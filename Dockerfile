# Base image
FROM openjdk:17-jdk-slim

# Install necessary tools
RUN apt-get update && apt-get install -y \
    git \
    gradle \
    mariadb-client && \  # Use mariadb-client instead of mysql-client
    rm -rf /var/lib/apt/lists/*

# Set default working directory
WORKDIR /fineract

# Copy the entire project into the container
COPY . .

# Ensure gradlew has execute permissions
RUN chmod +x /fineract/gradlew
