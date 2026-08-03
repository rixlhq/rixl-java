# Contributing

Everything under `sdk/` is generated. Do not edit it by hand, because the next
regeneration will overwrite your changes. Fix the OpenAPI spec instead, then
regenerate.

## Regenerating the SDK

The client is produced by [Kiota](https://learn.microsoft.com/openapi/kiota/)
1.34.1 from the upstream Rixl OpenAPI spec. With the `kiota` CLI on your PATH:

```bash
./gen.sh
```

That runs:

```bash
kiota generate \
    -l java \
    -c RixlClient \
    -n com.rixl.sdk \
    -d https://raw.githubusercontent.com/rixlhq/openapi/refs/heads/main/openapi.yaml \
    -o "./sdk" \
    --clean-output \
    --exclude-backward-compatible
```

`--clean-output` wipes `sdk/` first, so regeneration is the only way changes to
the spec reach this repo. Commit the result on its own, without mixing in
hand-written changes.

## Building

```bash
mvn -q compile
```

The build compiles `sdk/` directly (`sourceDirectory` in `pom.xml`) and targets
Java 17.

## Releasing

Releases are cut by release-please from conventional commits. The version lives
in `pom.xml` and `.release-please-manifest.json`, and both are updated by the
release PR, so do not bump them by hand. When the version changes, update the
install snippets in `README.md` to match.
