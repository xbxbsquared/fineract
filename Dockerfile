        # Use an official Java runtime as a parent image
        FROM openjdk:11-jdk-slim

        # Set the working directory inside the container
        WORKDIR /app

        # Copy the Fineract source code from your local machine to the container
        COPY . /app

        # Install Maven to build the project
        RUN apt-get update && apt-get install -y maven

        # Build Fineract using Maven
        RUN mvn clean install -DskipTests

        # Expose port 8080 (or your desired port for the backend API)
        EXPOSE 8080

        # Run the Fineract backend
        CMD ["java", "-jar", "fineract-provider/target/fineract-provider-*.jar"]
