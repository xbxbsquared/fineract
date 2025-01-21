# Base image
FROM openjdk:17-jdk-slim

# Install necessary tools
RUN apt-get update && apt-get install -y \
    git \
    gradle \
    mariadb-client && \
    rm -rf /var/lib/apt/lists/*  # Ensure no space or characters after the backslash

# Set default working directory
WORKDIR /fineract

# Copy the entire project into the container
COPY . .

# Ensure gradlew has execute permissions
RUN chmod +x /fineract/gradlew

# Set the command to run the application
CMD ["./gradlew", "bootRun"]
