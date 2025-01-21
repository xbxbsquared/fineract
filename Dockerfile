# Base image
FROM openjdk:17-jdk-slim

# Install necessary tools
RUN apt-get update && apt-get install -y \
    git \
    gradle \
    && rm -rf /var/lib/apt/lists/*

# Set default working directory
WORKDIR /app/fineract
