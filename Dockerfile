FROM openjdk:8-jdk-alpine
Expose 8090
ADD target/achat-10.jar xyz.jar
ENTRYPOINT ["java","jar","/xyz.jar"]