#!/bin/bash
echo "BeforeInstall: backing up current web filess"
TIMESTAMP=$(date +%s)
mkdir -p /tmp/backup-$TIMESTAMP
cp -r /var/www/html/* /tmp/backup-$TIMESTAMP/