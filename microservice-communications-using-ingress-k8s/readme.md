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
  * Create a new namespace as 'dev' for these two application(services).
  * Create service and deployment objects for department-service.
  * Create service and deployment objects for user-service.
  * Create ingress object with routing rules for these services.
  * Once all these operations are done, create a tunnel so that the cluster would be now available to the external system.


Access the services
---------------------
* The domain name is mentioned as **city-details.com** in the ingress file (ingress-pathbased-k8s.yml)
* Now we need to find the external IP for this domain by using 'kubectl get ingress -n **dev** '. Here 'dev' is the application namespace.
<img width="757" alt="Screenshot 2022-07-29 at 12 06 27 PM" src="https://user-images.githubusercontent.com/40859584/181698108-bd496e73-96f1-41bd-a5b9-9d10330da61c.png">

* Get the ADDRESS value in the result. Now add the below entry in the '/etc/hosts' file.

   * 127.0.0.1    city-details.com

* Now use the below URL to access to each of the services. We use domain name here but based on the relative url, ingress will redirect to the respective services.
   * http://city-details.com/department  ----> Access the department service
   * http://city-details.com/user  ----> Access the user service
   

Refer: https://devopscube.com/setup-ingress-kubernetes-nginx-controller/

