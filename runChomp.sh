#!/bin/bash

cd ./app

# Compile the Java files
javac *.java

# Run the Chomp program
java -cp . Chomp

# Remove all .class files after the program exits
rm *.class
