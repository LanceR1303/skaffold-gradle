kubectl expose deployment skaffold-gradle --type=LoadBalancer --port=8080
curl http://localhost:100000/hello
