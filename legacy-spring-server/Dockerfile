FROM mcr.microsoft.com/java/jdk:11-zulu-alpine
COPY build/libs/server-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java", "-jar", "app.jar", "--server.servlet.context-path=/api"]