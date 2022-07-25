mvn clean install
kubectl delete deploy caller-service-d
kubectl delete deploy callee-service-d
kubectl delete service callee-service-svc
kubectl delete service caller-service-svc
docker build -t himanshubhusan88/caller-service:1.0 caller-service/
docker push himanshubhusan88/caller-service:1.0
docker build -t himanshubhusan88/callee-service:1.0 callee-service/
docker push himanshubhusan88/callee-service:1.0
kubectl apply -f caller-service/caller-service-k8s.yml
kubectl apply -f callee-service/callee-service-k8s.yml
