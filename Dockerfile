# Start with a base image
FROM adoptopenjdk:11-jdk-hotspot

# Set the working directory inside the container
WORKDIR /demo

# Copy the compiled JAR file from the target directory to the container
COPY target/*.jar demo.jar

# Expose the port that your application is listening on (change the port if needed)
EXPOSE 8080

# Set any necessary environment variables
ENV SPRING_PROFILES_ACTIVE=production

# Specify the command to run your application when the container starts
CMD ["java", "-jar", "demo.jar"]
