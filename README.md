# Spring Boot OAuth2 Authentication server. Part -1-

Project shows how to create OAuth2 authentication server.

Main features
- OAuth2 server features
- Integration with database (postgresql) which is using as token storage


# How to install/run

Installation requires only start project with maven command:
```
mvn spring-boot:run
```


# How to use

Below curl commands show how to obtain access_token from server:

``` 
curl -vu prodClientIdPassword:secret http://localhost:8081/spring-oauth2-server/oauth/token -H "Accept: application/json" \
-d "password=nimda&username=admin&grant_type=password&client_secret=secret&client_id=prodClientIdPassword"

curl -vu cliClientIdPassword:secret http://localhost:8081/spring-oauth2-server/oauth/token -H "Accept: application/json" \
-d "password=nimda&username=admin&grant_type=password&client_secret=secret&client_id=cliClientIdPassword"

``` 
