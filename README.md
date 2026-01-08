# Software Engineer Management API

A RESTful API built with Spring Boot for managing software engineer records. This service provides CRUD operations for software engineer profiles with PostgreSQL database persistence.

## Tech Stack

- **Java** with Spring Boot
- **Spring Data JPA** for database operations
- **PostgreSQL** database
- **Docker Compose** for containerization
- **Maven** for dependency management

## Features

- Create, Read, Update, and Delete software engineer records
- RESTful API endpoints
- DTO pattern for clean data transfer
- Docker-based database deployment

## Prerequisites

- Java 17 or higher
- Maven
- Docker and Docker Compose

## Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/mashavaprince09/software-engineer-management-api
   cd software-engineer-management-api
   ```

2. **Start the PostgreSQL database**
   ```bash
   docker-compose up -d
   ```

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

   The API will be available at `http://localhost:8080`

## API Endpoints

See `request.http` for example API calls.
