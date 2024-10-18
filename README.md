# Chomp Java Game

This is a project we made in AP CSA at Mariemont Highschool in 2021-2022, it is a game called chomp where the main objective is to not eat the last square because it is poisoned! This project was done to get us familiarized with 2D arrays, Jave GUIs, & computer player logic as well as OOP

## Deployment

This could be dockerized into a .jar file, I am planning on deploying to a .war and deploy using Heroku

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
