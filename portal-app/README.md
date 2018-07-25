# seed
### pre requistes
 - maven 3.x
 -  java 8.x

### How to build locally
 - download the code
 - run "mvn clean spring-boot:run" to run your local server on 8080
 - hit this url to verify the server is running  "http://localhost:8080/portal/services/actuator/health"

### how to build deployable jar file
 - run "mvn clean install" this will generate portal-jar file in the targer folder.

### how to build docker image
 - run mvn docker:build to create image


# Required JAVA set-up on MaC
run below command to see various java installations
/usr/libexec/java_home -V

Matching Java Virtual Machines (2):
    9.0.1, x86_64:	"Java SE 9.0.1"	/Library/Java/JavaVirtualMachines/jdk-9.0.1.jdk/Contents/Home
    1.8.0_181, x86_64:	"Java SE 8"	/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home

To set required JDK update User bash profile as below
vi ~/.bash_profile

export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_181.jdk/Contents/Home
export PATH=$JAVA_HOME/bin:%PATH

source  ~/.bash_profile
