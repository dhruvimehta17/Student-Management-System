FROM eclipse-temurin:23-jdk

WORKDIR /app

COPY target/eurekaServer-0.0.1-SNAPSHOT.jar eurekaServer.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "eurekaServer.jar"]
