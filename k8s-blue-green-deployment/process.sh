### DEFINE THE COLOR
GREEN='\033[0;32m'
NC='\033[0m' # No color

echo -e "${GREEN}#####################################################################\n
 \t\t\t Build The Project\n
#####################################################################${NC}"
mvn clean install

echo -e "\n\n${GREEN}#####################################################################################\n
 \t Delete the existing deployments & services \n
#####################################################################################${NC}"
kubectl delete deploy callee-deploy-blue
kubectl delete deploy callee-deploy-green
kubectl delete service callee-svc

echo -e "\n\n${GREEN}#####################################################################################\n
 \t Create the container images and push to the container registry \n
#####################################################################################${NC}"
docker build -t himanshubhusan88/callee-service:1.0 callee-service/
docker push himanshubhusan88/callee-service:1.0

echo -e "\n\n${GREEN}#####################################################################################\n
 \t\t\t Create the deployments and services \n
#####################################################################################${NC}"
kubectl apply -f callee-service/blue-deployment-k8s.yml
kubectl apply -f callee-service/green-deployment-k8s.yml
kubectl apply -f callee-service/callee-service-k8s.yml
