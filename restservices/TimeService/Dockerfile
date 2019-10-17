FROM java:8-jdk-alpine

COPY ./build/libs/TimeService-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","TimeService-0.0.1-SNAPSHOT.jar"]