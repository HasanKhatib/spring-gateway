## Spring API Gateway (Basic Auth)

<div align="center">

[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)
![GitHub Workflow Status](https://img.shields.io/github/workflow/status/hasankhatib/random-meme/CI%20-%20Build%20&%20Dockerize)
[![versionspringboot](https://img.shields.io/badge/dynamic/xml?color=brightgreen&url=https://raw.githubusercontent.com/bhuism/badge/master/pom.xml&query=%2F%2A%5Blocal-name%28%29%3D%27project%27%5D%2F%2A%5Blocal-name%28%29%3D%27parent%27%5D%2F%2A%5Blocal-name%28%29%3D%27version%27%5D&label=springboot)](https://github.com/spring-projects/spring-boot)
[![java: &gt;= 17](https://oss.aoapps.com/ao-badges/java-17.svg)](https://openjdk.org/projects/jdk/17/)
![Twitter Follow](https://img.shields.io/twitter/follow/hasankhatib?style=social)
</div>

A generic purpose API Gateway with support to Basic Authentication.

### Development
- JDK17
- gradle 7.5
- Spring Cloud 2.6.2

### Build & Run

PS. With default configuration, you can use this gateway with these credentials `user:pass`.

You can configure username and password by configuring the application properties or by passing environment variables to docker image.

**Docker**
```shell
docker pull hasankhatib/api-gateway
docker run -d -p 8080:8080 -e BE_SERVICE_URL=$YOUR_BACKEND_SERVICE -e API_USER=user -e API_PASS=pass hasankhatib/api-gateway:latest
```

**Run with gradle**
```shell
gradle clean build
gradle bootRun
```
