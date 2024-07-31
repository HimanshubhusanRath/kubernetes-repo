*Blue-Green deployment in Kubernetes*
--------------------------------------
* There are two deployments defined:
  * blue deployment - 2 pods with label as 'version: blue'   [CURRENT / OLD VERSION]
  * green deployment - 2 pods with label as 'version: green'  [NEW VERSION]
* Service is defined with label selector as 'version: blue' so that only the BLUE pods are used by the service.
* We can check this by accessing the callee-service's end point: '/msg'. It prints the below:
  - "From : callee-deploy-blue-5fc57db9b4-xwfc5-1231691412"
* Now update the service to use green pods (label selector as 'version : green') and apply.
* We can see now the green pods are used by the service by accessing the '/msg' endpoint which prints the below:
  - "From : callee-deploy-green-77d77dfd7-uuiy3-1655232280"


*Advantages of Blue-Green deployment*
---------------------------------------
- We can maintain different versions in separate pods. One with current-version and another with new-Version.
- Once the pods with new version is ready and tested properly, then we can update the Service instance to use the new nodes instead of old nodes.
- If something goes wrong with the new nodes, we can simply update the Service instance to switch back to the old nodes.
