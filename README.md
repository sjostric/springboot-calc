# Spring Boot Calculator
Simple Spring Boot application that can do calculations (at least addition). 

The project build produces 2 main artifacts; a runnable jar and a docker image (using the [Spotify Docker Maven plugin](https://github.com/spotify/docker-maven-plugin)).

## Build
* maven clean install

## Run
* Local Java: ```java -jar calc-app/target/calc-app-1.0.0-SNAPSHOT.jar```
* Docker: ```docker run -p 8080:8080 calc-app-docker```
* To CloudFoundry: ```cf push -f manifest.yml```

## Test
For local deployment, direct the broswer to: ```http://localhost:8080/calc/add/1/5```
