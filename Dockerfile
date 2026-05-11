FROM eclipse-temurin:17

WORKDIR /app

COPY snakegame/target/*.jar app.jar

CMD ["java", "-jar", "app.jar"]