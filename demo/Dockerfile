############################
# ---- Build Stage ----
############################
FROM maven:3.9.9-eclipse-temurin-21 AS builder

COPY . /app
WORKDIR /app

# Download dependencies and build
RUN mvn clean package -DskipTests

############################
# ---- Runtime Stage ----
############################
FROM eclipse-temurin:21-jre

WORKDIR /app

# Copy only the final JAR file from the builder
COPY --from=builder /app/target/demo-1.0-SNAPSHOT-jar-with-dependencies.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]