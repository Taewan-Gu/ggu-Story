FROM gradle:7.1-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:7u211-jdk-alpine3.9
VOLUME /build
COPY --from=build /home/gradle/src/build/libs/server-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "app.jar", "--server.servlet.context-path=/api"]