
portal-web  deploy issue

# PortalWeb

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 6.0.7.

Go to  project folder ../XXXXX/portal-web

run below command to install node modules. This is one time step or dependency is added
$npm install


## Development server


Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Code scaffolding


Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

## Build


Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

## Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).


## Build Docker image
Go to  project folder ../portal-web
$docker build -t portal-web .

#### Create container
$docker run -it -p 80:80 portal-web

#### Test application
http://localhost/

#### Troubleshooting
* Not seeing changes.

Steps 1: Clean all stopped and running containers
docker stop $(docker ps -a -q)
docker rm $(docker ps -a -q)
docker kill $(docker ps -q)

Step 2: Clean all images
docker rmi $(docker images -q)


### Docker nginx reference documentation
https://docs.docker.com/samples/library/nginx/
https://docs.docker.com/samples/library/nginx/#using-environment-variables-in-nginx-configuration
https://github.com/nginxinc/NGINX-Demos/tree/master/nginx-hello



 





