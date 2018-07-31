# seed
### pre requistes
 - maven 3.x
 -  java 8.x

### How to build locally
 - download the code
 - run "mvn clean spring-boot:run" to run your local server on 8080
 - hit this url to verify the server is running  "http://localhost:8080/gsa/api/actuator"

### how to build deployable jar file
 - run "mvn clean install" this will generate portal-jar file in the targer folder.

# how to run on docker

## Build app docker image
 - "cd portal-app"
 - "mvn clean install"
 - run "mvn docker:build" to create image

 ## Build web docker image
 - cd ..
 - "cd portal-web"
 - "ng build --prod --base-href portal-web"
 - "docker build . -t portal/portal-web:latest"
 
 ## Run Docker compose
 
 - "docker-compose up" 
 - navigate to "http://localhost:81/portal-web/index.html"
 
