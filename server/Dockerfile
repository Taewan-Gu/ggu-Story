FROM openjdk:7u211-jdk-alpine3.9
COPY build/libs/server-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "app.jar", "--server.servlet.context-path=/api"]