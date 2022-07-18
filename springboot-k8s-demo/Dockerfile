FROM openjdk:17-oracle
EXPOSE 8080
ADD target/springboot-k8s-demo.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]