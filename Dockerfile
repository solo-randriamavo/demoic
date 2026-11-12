FROM eclipse-temurin:21-jre
WORKDIR /app
COPY target/demoic-1.0.0-SNAPSHOT.jar app.jar
CMD ["java", "-cp", "app.jar", "com.devops.tp1.DemoIC"]
