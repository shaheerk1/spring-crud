# Use a base image with Java and Maven pre-installed
FROM maven:3.8.4-openjdk-17-slim AS builder

# Set the working directory in the container
WORKDIR /app

# Copy the project files into the container
COPY . .

# Package the application into a JAR file
RUN mvn clean package

# Use a lightweight base image with Java pre-installed
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file from the builder stage into the container
COPY --from=builder /app/target/zahir-0.0.1-SNAPSHOT.jar .

# Expose the port that your Spring Boot application listens on
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "zahir-0.0.1-SNAPSHOT.jar"]
