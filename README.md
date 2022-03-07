# Java

## How to start the application

`./mvnw spring-boot:run`

Open `http:localhost:8080`

## Table Structure
```sql
create table user (
id integer not null, 
birth_date timestamp, 
name varchar(255), 
primary key (id)
);

create table post (
id integer not null, 
description varchar(255), 
user_id integer, 
primary key (id)
);
```


## Resources and URI Mappings

- Simple hello world - GET /hello-world

- Greet user by name - GET /greeting

- Retrieve all Users - GET /users

- Create a User - POST /users

- Retrieve one User - GET /users/{id} -> /users/1

- Delete a User - DELETE /users/{id} -> /users/1

- Retrieve all posts for a User - GET /users/{id}/posts

- Create a posts for a User - POST /users/{id}/posts

- Retrieve details of a post - GET /users/{id}/posts/{post_id}

## Useful Links

- Actuator
    - http://localhost:8080/actuator
- Swagger
    - http://localhost:8080/swagger-ui.html
- H2-Console
    - http://localhost:8080/h2-console

## Tools 
- Java 8
- Eclipse
- Maven
- Embedded Tomcat
- REST Services Client