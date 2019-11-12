# Sample app Spring Boot and Cosmos DB

## build and run with Docker

```
docker build -t chanezon/spring-boot-cosmos-db .
```

cp src/main/resources/application.properties .
edit application.properties to add params for your cosmosdb connection

```
docker run -p 8080:8080 \
-v $(pwd)/application.properties:/config/application.properties \
 chanezon/spring-boot-cosmos-db
```
