# Journal Application

## Overview
This is a simple Journal Application built with Spring Boot and MongoDB. The application provides RESTful API endpoints to create, read, update, and delete journal entries.

## Features
- Store journal entries in MongoDB
- Create new journal entries
- Retrieve all journal entries
- Retrieve a specific journal entry by ID
- Update existing journal entries
- Delete journal entries

## Technology Stack
- Java 17
- Spring Boot 3.5.0
- MongoDB
- Maven

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/journal/allEntries` | Retrieve all journal entries |
| GET | `/journal/getid/{id}` | Retrieve a specific entry by ID |
| POST | `/journal/createEntry` | Create new journal entries |
| PUT | `/journal/updateEntry/{id}` | Update an existing entry |
| DELETE | `/journal/deleteEntry/{id}` | Delete an entry |
| GET | `/health-check` | Check if the application is running |

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven
- MongoDB

### Setup
1. Clone the repository
2. Configure MongoDB connection in `application.properties`

```properties
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
```

3. Build the project
```bash
mvn clean install
```

4. Run the application
```bash
mvn spring-boot:run
```
The application will start on port 8081.

## Project Structure
- `controller` - REST endpoints
- `entity` - Data models
- `repository` - Database access interfaces
- `service` - Business logic

## Sample Journal Entry
```json
{
  "title": "First Day of Spring",
  "content": "The flowers are blooming and the weather is finally warming up."
}
```

## Future Enhancements
- User authentication and authorization
- Search functionality
- Tagging/categorizing entries
- Rich text editor
- End-to-end encryption


## Learning Journey
This project was developed as part of my journey to learn Spring Boot and API development. It serves as a foundation that will be expanded with additional features and improvements over time.

The focus areas include:
- REST API development with Spring Boot
- MongoDB integration using Spring Data
- Service-Repository architecture
- Object mapping and serialization

## License
This project is for educational purposes.
