FROM openjdk:8-jdk-alpine
MAINTAINER anamex.edu.mx.
COPY target/contenidoNutricioBackEnd-0.0.1-SNAPSHOT.jar docker-contenidoNutricioBackEnd.jar 
ENTRYPOINT ["java","-jar","/docker-contenidoNutricioBackEnd.jar"]
