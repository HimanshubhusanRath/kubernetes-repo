FROM openjdk:17-oracle
EXPOSE 8080
ADD target/springboot-crud-k8s.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"] 