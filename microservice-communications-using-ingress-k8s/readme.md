Ingress Setup in Kubernetes(Minikube)
--------------------------------------------
* Check the '/ingress-setup/setup-ingress.sh'.
* Here we do the below things.
  * Create new namespace for ingress (ingress-nginx)
  * Define the roles, services and deployments for ingress controller.


Start the application
-----------------------
* Check the 'app-process.sh' file which contains the below steps.
  * Build the department-service and user-service application, create docker images and push to the docker-hub.
  * Use '/ingress-setup/setup-ingress.sh' file to setup ingress.
  * Create a new namespace for these two application(services).
  * Create service and deployment objects for department-service.
  * Create service and deployment objects for user-service.
  * Create ingress object with routing rules for these services.
  * Once all these operations are done, create a tunnel so that the cluster would be now available to the external system.


Refer: https://devopscube.com/setup-ingress-kubernetes-nginx-controller/

