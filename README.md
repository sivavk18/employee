 Boot Kubernetes and MySQL

Sample project to test and deploy spring boot application with mysql database in kubernetes.

## Prerequisite

- Docker with kubernetes enabled
- Kubernetes command-line tool(kubectl)
- JDK 17 LTS
- Gradle

## Start application

echo -n 'root' | base64
will create the key
- Create secrets and start mysql database

```sh
kubectl apply -f deployment/secrets.yaml
kubectl apply -f deployment/mysql-deployment.yaml

```

- Build application and deploy in kubernetes

```sh
gradle clean dockerTag
kubectl apply -f deployment/app-k8s.yaml
