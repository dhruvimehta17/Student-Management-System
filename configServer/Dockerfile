FROM eclipse-temurin:23-jdk

WORKDIR /app

COPY target/configServer-0.0.1-SNAPSHOT.jar configServer.jar

EXPOSE 8888

ENTRYPOINT ["java", "-jar", "configServer.jar"]
