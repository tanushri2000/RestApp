FROM openjdk:17
COPY target/RestApp-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT [ "java" ,"-jar","RestApp-0.0.1-SNAPSHOT.jar"]