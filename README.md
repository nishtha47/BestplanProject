# Restful API
RESTful API for CRUD operations, developed with Spring Boot in Java.

# Function
Six RESTful APIs for the Game Store web application.

API                       | Description         | URL
--------------------------|---------------------|--------------
GET /api/products         | Get all products    | GET [http://localhost:9090/api/products](http://localhost:8080/api/products)
GET /api/products/{id}    | Get a product by ID | GET [http://localhost:9090//api/products/1](http://localhost:8080/api/products/1)
POST /api/products        | Add a new product   | POST [http://localhost:9090//api/products](http://localhost:8080/api/products)
PUT /api/products/{id}    | Update a product    | PUT [http://localhost:9090//api/products/1](http://localhost:8080/api/products/1)
DELETE /api/products/{id} | Delete a product    | DELETE [http://localhost:9090//api/products/1](http://localhost:8080/api/products/1)
POST /api/upload          | Upload an image     | POST [http://localhost:9090//api/upload](http://localhost:8080/api/upload)

# Setup Locally
```bash
git clone https://github.com/jojozhuang/restful-api-springboot.git
mvn spring-boot:run
```
Access http://localhost:9090/api/products in web browser or PostMan, you should get the following JSON as response.
```json
[  
   {
        "id": 3,
        "price": 125.0,
        "image": null,
        "type": "plan3",
        "productName": "voice,admn",
        "totalPrice": 0.0
    },
    {
        "id": 2,
        "price": 150.0,
        "image": null,
        "type": "plan2",
        "productName": "email,database,adm",
        "totalPrice": 0.0
    },
    {
        "id": 1,
        "price": 100.0,
        "image": null,
        "type": "plan1",
        "productName": "voice,ema",
        "totalPrice": 0.0
    }

]

```shell
mvn spring-boot:run
```

