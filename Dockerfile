FROM eclipse-temurin:17-jdk-focal

ENV BE_SERVICE_URL http://localhost:8000
ENV API_PASS user
ENV API_USER pass
COPY ./build/libs/*.jar /app.jar
USER 1000:1000

CMD ["java", "-jar", "/app.jar"]