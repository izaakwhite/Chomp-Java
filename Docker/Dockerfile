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
RUN javac Chomp.java

# Define the entry point for running the project
CMD ["sh", "-c", "xvfb-run x11vnc -display :0 -forever -usepw & java Chomp"]