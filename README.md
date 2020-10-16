# springboot-rest-error-handling
### Things to do list:
1. Clone this repository: `git clone https://github.com/hendisantika/springboot-rest-error-handling.git`
2. Go inside the folder: `cd springboot-rest-error-handling`
3. Run the application: `mvn clean spring-boot:run`
4. Open REST Client App e.g [POSTMAN](https://www.postman.com/downloads/) or curl with [jq](https://stedolan.github.io/jq/).
5. Import POSTMAN Collection

### Image Screen shot
**List All Books**

##### Request
```shell script
curl --location --request GET 'http://localhost:8080/books' | jq. 

```

##### Response
```shell script
[
  {
    "id": 1,
    "name": "A Guide to the Bodhisattva Way of Life",
    "author": "Santideva",
    "price": 15.41
  },
  {
    "id": 2,
    "name": "The Life-Changing Magic of Tidying Up",
    "author": "Marie Kondo",
    "price": 9.69
  },
  {
    "id": 3,
    "name": "Refactoring: Improving the Design of Existing Code",
    "author": "Martin Fowler",
    "price": 47.99
  },
  {
    "id": 4,
    "name": "A Guide to be Spring Boot Developer Way of Life",
    "author": "Hendi Santika",
    "price": 15.41
  },
  {
    "id": 5,
    "name": "A Guide to be Spring Boot Developer as Way of Life",
    "author": "Hendi Santika Hiruzen",
    "price": 20.2
  }
]
```

**Add New Book**

##### Request
```shell script
curl --location --request POST 'http://localhost:8080/books' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "A Guide to be Spring Boot Developer Way of Life",
    "author": "Hendi Santika",
    "price": 15.41
}' | jq .

```

##### Response
```shell script
{
  "id": 6,
  "name": "A Guide to be Spring Boot Developer Way of Life",
  "author": "Hendi Santika",
  "price": 15.41
}
```

**Find Book By ID**
##### Request
```shell script
curl --location --request GET 'http://localhost:8080/books/4' | jq .

```

##### Response
```shell script
{
  "id": 4,
  "name": "A Guide to be Spring Boot Developer Way of Life",
  "author": "Hendi Santika",
  "price": 15.41
}
```

**Save or Update Book**
##### Request
```shell script
curl --location --request PUT 'http://localhost:8080/books/5' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "A Guide to be Spring Boot Developer as Way of Life",
    "author": "Hendi Santika",
    "price": 20.20
}' | jq .

```

##### Response
```shell script
{
  "id": 5,
  "name": "A Guide to be Spring Boot Developer as Way of Life",
  "author": "Hendi Santika",
  "price": 20.2
}
```