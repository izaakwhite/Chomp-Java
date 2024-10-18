# Chomp Java Game

We made this project in AP CSA at Mariemont High School in 2021-2022, a game called Chomp where the main objective is not to eat the last square because it is poisoned! This project was done to get us comfortable with 2D arrays, Java GUIs, & computer player logic as well as OOP

## Deployment

This could be dockerized into a .jar file, I am planning on deploying to a .war and deploy it using Heroku, maybe dockerize and use AWS, Google Cloud Etc...

## Compilation

### Linux

```bash
# if no jdk already
sudo apt update
sudo apt install openjdk-11-jdk
sudo apt install libxrender1 libxtst6 libxi6
# if Java Env Is all set
cd ~/Chomp-Java/app
java -cp . Chomp
```

### Windows

Just Make Sure JDK is installed, make './app' a java project, run the java project
