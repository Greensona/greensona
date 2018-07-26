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

### how to run on docker
 - cd portal-app
 - run mvn docker:build to create image
 - cd ..
 - run "docker up" (this will build web and add the app container too)
 
 
