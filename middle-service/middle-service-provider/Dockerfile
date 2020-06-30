FROM openjdk:8-jdk-alpine
COPY build/libs/middle-service-provider-1.0-SNAPSHOT.jar /opt/app.jar
WORKDIR /opt
ENTRYPOINT ["java","-jar","app.jar"]