FROM openjdk:8-jdk-alpine
EXPOSE 8090
ADD target/achat-10.jar achat-10.jar
ENTRYPOINT ["java","jar", "/achat-10.jar"]
