*Canary deployment in Kubernetes*
--------------------------------------
* There are two deployments defined:
  * stable deployment - 3 pods with label as 'app:callee-app' & 'version: stable' [CURRENT version]
  * canary deployment - 1 pod with label as 'app:callee-app' & 'version: canary' [NEW version]
* Service is defined with label selector as 'app:callee-app' so that it can use both 'stable' as well as 'canary' pods.
* This way the new version is also partially pushed (1 pod) along with the old version (3 pods).
* We can check the version of pod by accessing the '/msg' endpoint of callee service. It prints the below:
  * "From : callee-deploy-canary-6c5df9fdbd-b4t2x-1685854426"
* NOTE: Sometimes we can see the '**canary**' pod and sometimes we can see '**stable**' pod in this message.


*Advantages of Canary deployment*
----------------------------------
- New version/changes can be pushed partially to the production.
- Instead of pushing the new version in a big bang mode, we can gradually make it live.