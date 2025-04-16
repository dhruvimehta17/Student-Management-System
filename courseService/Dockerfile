FROM eclipse-temurin:23-jdk

WORKDIR /app

COPY target/courseService-0.0.1-SNAPSHOT.jar courseService.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "courseService.jar"]
