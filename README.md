
# Product REST API

This project is a simple RESTful API for managing products using Spring Boot and Kotlin. 
It supports creating, retrieving, updating, and deleting products. The project is implemented 
using Spring Boot, Spring Data JPA, and can be tested using Postman.

## Features

- Create new products
- Retrieve all products
- Retrieve a specific product by ID
- Update an existing product by ID
- Delete a product by ID

## Technologies Used

- Kotlin
- Spring Boot
- Spring Data JPA
- H2 Database (or MySQL)
- Postman (for testing)

## Getting Started

### Prerequisites

- JDK 17 or higher
- Maven
- Postman (for testing APIs)
- Git

### Installation

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```

2. Navigate to the project directory:
   ```bash
   cd product-rest-api
   ```

3. Open the project in your IDE (e.g., IntelliJ IDEA).

4. Add the necessary dependencies (these should already be included in the `pom.xml` file).

5. Configure the database:
   - By default, the project uses the H2 in-memory database.
   - If using MySQL, update the `application.properties` file with your database credentials.

6. Run the application:
   ```bash
   mvn spring-boot:run
   ```

### API Endpoints

#### Base URL

```
http://localhost:8080/api/v1/product
```

#### Endpoints

1. **Create a Product** (POST)
   - URL: `/`
   - Example Request Body:
     ```json
     {
       "name": "Laptop",
       "description": "High-performance laptop",
       "price": 1200.50
     }
     ```
   - Response: `201 Created`

2. **Get All Products** (GET)
   - URL: `/`
   - Response: `200 OK`
     ```json
     [
       {
         "id": 1,
         "name": "Laptop",
         "description": "High-performance laptop",
         "price": 1200.50
       }
     ]
     ```

3. **Get Product by ID** (GET)
   - URL: `/{id}`
   - Response: `200 OK` (if found)
     ```json
     {
       "id": 1,
       "name": "Laptop",
       "description": "High-performance laptop",
       "price": 1200.50
     }
     ```
   - If not found: `404 Not Found`

4. **Update Product by ID** (PUT)
   - URL: `/{id}`
   - Example Request Body:
     ```json
     {
       "name": "Gaming Laptop",
       "description": "High-performance gaming laptop",
       "price": 1500.75
     }
     ```
   - Response: `200 OK`

5. **Delete Product by ID** (DELETE)
   - URL: `/{id}`
   - Response: `204 No Content`

### Testing with Postman

Follow these steps to test the API using Postman:

1. Open Postman and create a new collection (e.g., "Product API").
2. Add requests for each endpoint listed above.
3. Send the requests and verify the responses.

### Example JSON Payloads

- Create Product:
  ```json
  {
    "name": "Smartphone",
    "description": "Latest model smartphone",
    "price": 899.99
  }
  ```

- Update Product:
  ```json
  {
    "name": "Smartphone Pro",
    "description": "Latest model smartphone with additional features",
    "price": 1099.99
  }
  ```

### Error Handling

- `404 Not Found`: Returned if the product with the specified ID does not exist.
- `400 Bad Request`: Returned if the request body is invalid.

### Project Structure

```
src/main/kotlin/com/example/productapi/
├── Product.kt               # Entity class for Product
├── ProductRepository.kt     # Repository interface for Product
├── ProductService.kt        # Service layer for business logic
├── ProductController.kt     # REST Controller for API endpoints
```

## Contribution

If you’d like to contribute, fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License.

---

**Author**: Cullen Murphy-Brady  
