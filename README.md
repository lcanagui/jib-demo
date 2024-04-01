# Jib Demo 🏗️

This is a Spring Boot demo project to show how to build a Docker image using
[Jib][jib-repo-url].

You can navigate through the Git history to understand the different steps to
set up Jib in your Java project.

> [!NOTE]
> For more information about Jib, please refer to the [official documentation][jib-repo-url].

[jib-repo-url]: https://github.com/GoogleContainerTools/jib

## Requirements

* Java 21
* Maven 3.8.4

## Instructions

To compile the project:
```shell
mvn clean package
```

To build the Docker image and push it to a Docker registry (no Docker daemon required):
```shell
mvn jib:build
```

To only build the Docker image locally with Jib (using the local Docker daemon):
```shell
mvn jib:dockerBuild
```

To build the Docker image locally with native Docker:
```shell
docker build . -t jib-demo:dockerfile
```
