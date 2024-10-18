FROM openjdk:11-jdk-slim

# Set the working directory inside the container
WORKDIR /docker_app

# Copy the entire APP folder into the container
COPY ../app/*.java /docker_app/

# Compile the project
RUN javac Chomp.java

# Define the entry point for running the project
CMD ["java", "Chomp"]