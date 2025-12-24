#!/bin/bash
set -e
systemctl stop api-gateway || true
systemctl stop auth-service || true
systemctl stop customer-service || true
systemctl stop creditcard-service || true
systemctl stop transaction-service || true
