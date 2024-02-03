# Notes:
* Build the executable jar : <code> mvn clean install </code>
* Create the docker image : <code> docker build -t himanshubhusan88/springboot-k8s-demo:1.0 . </code>
* Push the docker image to hub : <code> docker push himanshubhusan88/springboot-k8s-demo:1.0 </code>
* Install the Deployment and Service objects:
    * <code>kubectl apply -f k8s-deployment.yaml</code>
    * <code>kubectl apply -f k8s-service.yaml</code>
* Check the service, deployment and pods :
    * <code> kubectl get deploy </code>
    * <code> kubectl get svc </code>
    * <code> kubectl get pods </code>
* Get the service url (in Minikube cluster on local machine): <code> minikube service springboot-k8s-service --url </code>. This will get the URL for accessing the application.