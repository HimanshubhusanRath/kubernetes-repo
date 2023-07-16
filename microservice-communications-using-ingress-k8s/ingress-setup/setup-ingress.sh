# Delete the existing namespace
kubectl delete ns ingress-nginx

# Create a new namespace
kubectl create ns ingress-nginx


################################################
################ INGRESS (NGINX) SETUP #########
################################################

# 1. Service account/Roles/ClusterRoles for Nginx admission controller
kubectl apply -f admission-service-account.yaml 

# 2. Validating webhook Configuration
kubectl apply -f validating-webhook.yaml

# 3. Jobs to create/update Webhook CA bundles
kubectl apply -f jobs.yaml
	
# 4. Service account/Roles/ClusterRoles of Nginx controller deployment
kubectl apply -f ingress-service-account.yaml

# 5. Nginx controller configmap
kubectl apply -f configmap.yaml

# 6. Services for nginx controller & admission controller
kubectl apply -f services.yaml

# 7. Ingress controller deployment
kubectl apply -f deployment.yaml


# File-1 to 7 clubbed into one file
#kubectl apply -f https://raw.githubusercontent.com/kubernetes/ingress-nginx/controller-v1.1.1/deploy/static/provider/cloud/deploy.yaml


##############################################
################## ISSUE FIX #################
##############################################

# Not sure why this is required but this needs to be executed
kubectl delete -A ValidatingWebhookConfiguration ingress-nginx-admission

