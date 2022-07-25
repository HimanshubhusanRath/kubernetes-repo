Project Structure:
-------------------
<img width="1287" alt="Screenshot 2022-07-18 at 6 55 18 PM" src="https://user-images.githubusercontent.com/40859584/179523271-086d792d-797f-4b60-9747-d91ca0da82f7.png">


File Details [The objects should be created in the following order by applying these definitions]
---------------------------------------------------------------------------------------------------
* mysql-configMap.yaml: 
  * Contains the config values (host-name, db-name) in plain text format.
* mysql-secrets.yaml:
  * Contains the secrets (username, password) in encoded text format.
* db-deployment-and-service.yaml:
  * Contains the deployment and service information for the MYSQL container.
* app-deployment-and-service.yaml:
  * Contains the deployment and service information for the SPRING-BOOT application container.


Create Deployment, Service, Config & Secret objects [Follow the below order]
-----------------------------------------------------------------------------------
* kubectl apply -f mysql-configMap.yaml
* kubectl apply -f mysql-secrets.yaml
* kubectl apply -f db-deployment-and-service.yaml
* kubectl apply -f app-deployment-and-service.yaml



Points to Note:
----------------
* The DNS name for MYSQL service is defined as 'mysql-server' and is defined in the 'db-deployment-and-service.yaml' file.

* This DNS value is mentioned as 'host' in the 'mysql-configMap.yaml'. This value is used by the Spring Boot application instance to connect to the mysql database instance. In this way, SPRING-BOOT application container is able to connect with the MYSQL container using DNS resolution.
