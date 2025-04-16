FROM eclipse-temurin:23-jdk

WORKDIR /app

COPY target/attendanceService-0.0.1-SNAPSHOT.jar attendanceService.jar

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "attendanceService.jar"]
