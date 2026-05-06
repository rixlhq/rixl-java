#!/usr/bin/env bash
# Regenerate the Java SDK from the upstream RIXL OpenAPI spec.
set -euo pipefail

kiota generate \
    -l java \
    -c RixlClient \
    -n com.rixl.sdk \
    -d https://raw.githubusercontent.com/rixlhq/openapi/refs/heads/main/openapi.yaml \
    -o "$(dirname "$0")/sdk" \
    --clean-output \
    --exclude-backward-compatible
