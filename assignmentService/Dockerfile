FROM eclipse-temurin:23-jdk

WORKDIR /app

COPY target/assignmentService-0.0.1-SNAPSHOT.jar assignmentService.jar

EXPOSE 8086

ENTRYPOINT ["java", "-jar", "assignmentService.jar"]
