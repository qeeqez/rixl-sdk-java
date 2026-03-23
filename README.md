# RIXL Java SDKs

This repository contains the Java SDK split by service instead of one flat generated client.

## Layout

- `sdk/feeds`
- `sdk/videos`
- `sdk/images`

Each service folder is a standalone generated Java package with its own `pom.xml`, Gradle files, and source tree.

## Build Example

Build the videos SDK:

```sh
cd sdk/videos
mvn clean install
```

The generated packages follow the service namespace:

- `io.rixl.sdk.feeds.*`
- `io.rixl.sdk.videos.*`
- `io.rixl.sdk.images.*`

## Regenerate

Generate all services:

```sh
./scripts/generate.sh
```

Generate one service:

```sh
./scripts/generate.sh --service videos
```

Regenerate from a fresh OpenAPI file:

```sh
./scripts/generate.sh --spec /path/to/public.swagger.json --service images
```
