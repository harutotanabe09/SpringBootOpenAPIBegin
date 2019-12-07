FROM openjdk:13-alpine

RUN mkdir /usr/app
WORKDIR /usr/app

COPY ../build/libs/openapi.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]