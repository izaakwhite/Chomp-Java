FROM openjdk:11-jdk-slim

RUN apt-get update && apt-get install -y \
    xvfb \
    x11vnc \
    && rm -rf /var/lib/apt/lists/*

# Set the working directory inside the container
WORKDIR /docker_app

# Copy the entire APP folder into the container
COPY ../app/*.java /docker_app/

# Compile the project
RUN javac *.java

# Run The Project
CMD ["java", "-cp", ".", "Chomp"]