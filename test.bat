kubectl expose deployment skaffold-gradle --type=LoadBalancer --port=8080
curl http://localhost:8080/hello
