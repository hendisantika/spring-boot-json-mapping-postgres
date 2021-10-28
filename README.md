# spring-boot-json-mapping-postgres

How to map JSON data in PostGreSQL database to a Hibernate Entity column?

### Things todo list:

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-json-mapping-postgres.git`
2. Navigate to the folder: `cd spring-boot-json-mapping-postgres`
3. Change Postgres credential with your own.
4. Run the application: `mvn clean spring-boot:run`
5. Open your favorite browser: http://localhost:8080/getData

### You can use Docker Container:

### Run Postgres docker container

```shell
 docker run -d --rm --name pg14 -e POSTGRES_USER=user -e POSTGRES_PASSWORD=password -e POSTGRES_DB=horizon0 -p 5432:5432 postgres:14

```

Create New Data

```shell
 curl -s -X POST "http://localhost:8080/addData" -H "Content-Type: application/json" -d '{\
    "data": {
        "name" : "Uzumaki Naruto",
        "age": 35,
        "address": "Konoha"
    }
}'

```

Get All Data

```shell
curl http://localhost:8080/getData

[
    {
        "id": 1,
        "data": {
            "name": "Uzumaki Naruto",
            "age": 35,
            "address": "Konoha"
        }
    },
    {
        "id": 2,
        "data": {
            "name": "Uzumaki Naruto",
            "age": 35,
            "address": "Konoha"
        }
    }
]
```
