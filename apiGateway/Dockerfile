FROM eclipse-temurin:23-jdk

WORKDIR /app

COPY target/apiGateway-0.0.1-SNAPSHOT.jar apiGateway.jar

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "apiGateway.jar"]
