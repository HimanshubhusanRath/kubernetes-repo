*Spring Boot Microservices Communications in Kubernetes*
--------------------------------------------------------
* Caller-service calls the Callee-service using the service name, not the IP address.
* The name of the service object mentioned in the K8s yaml file is used to access the service. This is the DNS for the callee-service.

**Note:**
* Service Discovery : No spring cloud service registry or similar modules are used. Service discovery happens using Kubernetes.
* Check the process.sh file. This contains the below steps:
  * Build the project using maven
  * Create and push the docker images for these projects
  * Delete and redeploy the service and deployment objects in kubernetes.

