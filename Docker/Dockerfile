# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the compiled JAR file or source files into the container
COPY . /app

# Run and Comp  Main
RUN javac Chomp.java

# Define the entry point for running the project
CMD ["java", "Chomp"]
