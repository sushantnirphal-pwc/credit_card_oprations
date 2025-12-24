#!/bin/bash
set -e
systemctl restart nginx
systemctl restart auth-service
systemctl restart customer-service
systemctl restart creditcard-service
systemctl restart transaction-service
systemctl restart api-gateway
