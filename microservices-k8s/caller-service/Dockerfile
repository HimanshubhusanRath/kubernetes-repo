FROM openjdk:17-oracle
EXPOSE 8080
ADD target/caller-service.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
