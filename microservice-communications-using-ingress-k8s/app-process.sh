####### BUILD THE APP AND PREPARE DOCKER IMAGE AND PUSH THE IMAGE ##########
mvn clean install
docker build -t himanshubhusan88/department-service:1.0 department-service/
docker build -t himanshubhusan88/user-service:1.0 user-service/
docker push himanshubhusan88/department-service:1.0
docker push himanshubhusan88/user-service:1.0



##### SETUP INGRESS ######

## THIS MANUAL SET-UP MAY NOT BE REQUIRED AS WE CAN SIMPLY ENABLE INGRESS IN MINIKUBE
## SO, WITH THIS, WE MAY NOT NEED THE /ingress-setup/* FILES

# cd ingress-setup
# Setup ingress(nginx)
# ./setup-ingress.sh
# cd ..
minikube addons enable ingress

# Delete the existing namespace
kubectl delete ns dev

# Create a new namespace
kubectl create ns dev

# Crete service and deployment for department-service
kubectl apply -f department-service/department-service-k8s.yml

# Crete service and deployment for user-service
kubectl apply -f user-service/user-service-k8s.yml


#kubectl apply -f temp-app/demo-app-deployment-k8s.yaml
#kubectl apply -f temp-app/demoapp-ingress.yaml

# Create ingress object
kubectl apply -f ingress-pathbased-k8s.yml

################################################################################
#### Create tunnel so that the cluster is available to the external system #####
################################################################################

minikube tunnel 