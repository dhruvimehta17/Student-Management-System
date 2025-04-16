FROM eclipse-temurin:23-jdk

WORKDIR /app

COPY target/studentService-0.0.1-SNAPSHOT.jar studentService.jar

EXPOSE 8081

ENTRYPOINT ["java", "-jar", "studentService.jar"]
