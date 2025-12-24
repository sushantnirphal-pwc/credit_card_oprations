#!/bin/bash
set -e

# Copy jars
mkdir -p /opt/creditportal/jars
cp -f /opt/creditportal/deploy/artifacts/jars/*.jar /opt/creditportal/jars/

# Copy UI
mkdir -p /var/www/creditportal-ui
rm -rf /var/www/creditportal-ui/*
cp -r /opt/creditportal/deploy/artifacts/ui/* /var/www/creditportal-ui/

# Nginx: React + proxy /api -> gateway
cat > /etc/nginx/conf.d/creditportal.conf << 'EOF'
server {
  listen 80;
  server_name _;
  root /var/www/creditportal-ui;
  index index.html;

  location / { try_files $uri /index.html; }

  location /api/ { proxy_pass http://127.0.0.1:8080/; }
}
EOF

# Gateway service
cat > /etc/systemd/system/api-gateway.service << 'EOF'
[Unit]
Description=API Gateway
After=network.target

[Service]
User=ec2-user
WorkingDirectory=/opt/creditportal
ExecStart=/usr/bin/java -jar /opt/creditportal/jars/api-gateway.jar --spring.profiles.active=prod
Restart=always
RestartSec=5

[Install]
WantedBy=multi-user.target
EOF

create_service () {
  NAME=$1
  DBNAME=$2

  cat > /etc/systemd/system/${NAME}.service << EOF
[Unit]
Description=${NAME}
After=network.target

[Service]
User=ec2-user
WorkingDirectory=/opt/creditportal

Environment=DB_HOST=${RDS_ENDPOINT}
Environment=DB_PORT=5432
Environment=DB_NAME=${DBNAME}
Environment=DB_USERNAME=${DB_USERNAME}
Environment=DB_PASSWORD=${DB_PASSWORD}

ExecStart=/usr/bin/java -jar /opt/creditportal/jars/${NAME}.jar --spring.profiles.active=prod
Restart=always
RestartSec=5

[Install]
WantedBy=multi-user.target
EOF
}

# ---- Option A: hardcode Postgres connection values ----
RDS_ENDPOINT="credit-card.cluster-c5s4as6o8nem.ap-southeast-2.rds.amazonaws.com"
DB_USERNAME="postgres"
DB_PASSWORD="Awscloud#123"
DBNAME="credit-card"
# -------------------------------------------------------

create_service "auth-service" "auth_db"
create_service "customer-service" "customer_db"
create_service "creditcard-service" "card_db"
create_service "transaction-service" "transaction_db"

systemctl daemon-reload
systemctl enable nginx api-gateway auth-service customer-service creditcard-service transaction-service
