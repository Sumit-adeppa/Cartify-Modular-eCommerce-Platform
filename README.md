# 🛒 Cartify4U

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-green)
![MySQL](https://img.shields.io/badge/MySQL-Database-blue)
![JWT](https://img.shields.io/badge/JWT-Security-red)
![Swagger](https://img.shields.io/badge/Swagger-OpenAPI-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Build-red)

### Enterprise-Grade E-Commerce Backend Application

Secure, scalable, and production-ready e-commerce backend built using Spring Boot, JWT Authentication, MySQL, Razorpay Integration, and Swagger/OpenAPI Documentation.

</div>

---

# 📌 Table of Contents

* Overview
* Features
* Technology Stack
* Architecture Overview
* High-Level Design (HLD)
* Low-Level Design (LLD)
* Application Modules
* Security Architecture
* Database Design
* Entity Relationship Diagram
* Application Flow Diagrams
* API Documentation
* Installation
* Configuration
* Running the Application
* API Endpoints
* Design Patterns
* Architecture Documentation
* Future Enhancements
* Contributing
* License

---

# 🚀 Overview

Cartify4U is a modern e-commerce backend platform that provides:

* User Authentication & Authorization
* Product Catalog Management
* Category Management
* Shopping Cart Management
* Order Processing
* Payment Integration
* Business Analytics
* Administrative Operations
* Secure REST APIs
* Interactive Swagger Documentation

The application follows a Layered Monolithic Architecture and implements enterprise-grade development practices.

---

# 🎯 Key Features

## Authentication & Authorization

* User Registration
* Login & Logout
* JWT Authentication
* Role-Based Access Control (RBAC)
* HttpOnly Cookie Support

## Product Management

* Create Product
* Update Product
* Delete Product
* Product Listing
* Product Search

## Category Management

* Product Categorization
* Category-based Filtering

## Shopping Cart

* Add to Cart
* Remove from Cart
* Update Quantity
* View Cart

## Order Management

* Place Orders
* View Order History
* Order Details
* Order Tracking

## Payment Processing

* Razorpay Integration
* Payment Verification
* Secure Payment Flow

## Admin Features

* Product Administration
* User Administration
* Business Analytics Dashboard

---

# 🏗 Technology Stack

## Backend

* Java 17
* Spring Boot
* Spring MVC
* Spring Data JPA
* Hibernate

## Database

* MySQL

## Security

* Spring Security
* JWT Authentication
* BCrypt Password Encoder

## API Documentation

* Swagger UI
* OpenAPI 3

## Payment Gateway

* Razorpay

## Build Tool

* Maven

---

# 🏛 Architecture Overview

```text
Client Applications
        │
        ▼
REST Controllers
        │
        ▼
Business Services
        │
        ▼
Repositories
        │
        ▼
MySQL Database
```

Architecture Style:

* Layered Monolithic Architecture
* RESTful APIs
* Repository Pattern
* DTO-Based Communication

---

# 📐 High-Level Design (HLD)

The HLD document contains:

## System Context Diagram

Shows interaction between:

* Users
* Admins
* Client Applications
* Backend APIs
* Database
* Razorpay

## Component Diagram

Major Components:

* Authentication Module
* User Module
* Product Module
* Cart Module
* Order Module
* Payment Module
* Analytics Module
* Admin Module

## Architecture Diagram

```text
Client
   |
   ▼
Controllers
   |
   ▼
Services
   |
   ▼
Repositories
   |
   ▼
Database
```

## Security Architecture

* JWT Authentication
* Role-Based Authorization
* Request Filtering
* Protected APIs

---

# 🔬 Low-Level Design (LLD)

The LLD document includes:

## Entity Design

* User
* Product
* Category
* CartItem
* Order
* OrderItem
* JWTToken

## Service Layer Design

* Business Logic
* Transaction Management
* Validation Rules

## Repository Design

* CRUD Operations
* Custom Queries
* Data Access Layer

## Controller Design

* REST Endpoints
* Request Validation
* Response Handling

## DTO Flow

```text
Request DTO
     │
     ▼
Validation
     │
     ▼
Service Layer
     │
     ▼
Entity
     │
     ▼
Database
```

---

# 📦 Application Modules

## Authentication Module

Responsibilities:

* Registration
* Login
* Logout
* Token Management

---

## User Module

Responsibilities:

* User Profile Management
* User Information

---

## Product Module

Responsibilities:

* Product CRUD
* Product Search
* Product Filtering

---

## Cart Module

Responsibilities:

* Add Items
* Remove Items
* Update Quantity

---

## Order Module

Responsibilities:

* Order Creation
* Order Tracking
* Order History

---

## Payment Module

Responsibilities:

* Razorpay Integration
* Payment Verification

---

## Admin Module

Responsibilities:

* Product Administration
* User Administration
* Business Analytics

---

# 🔐 Security Architecture

## Authentication Flow

```text
User
 |
 ▼
Login API
 |
 ▼
Authentication Manager
 |
 ▼
JWT Generation
 |
 ▼
HttpOnly Cookie
 |
 ▼
Response
```

## Authorization Flow

```text
Request
   |
   ▼
JWT Filter
   |
   ▼
Role Validation
   |
   ▼
Protected Resource
```

Roles:

* ADMIN
* CUSTOMER

---

# 🗄 Database Design

Core Entities:

* User
* Product
* Category
* CartItem
* Order
* OrderItem
* JWTToken

---

# 📊 Entity Relationship Diagram (ERD)

```text
Category (1)
    |
    └──────< Product (Many)

Product (1)
    |
    └──────< CartItem (Many)

User (1)
    |
    └──────< CartItem (Many)

User (1)
    |
    └──────< Order (Many)

Order (1)
    |
    └──────< OrderItem (Many)

Product (1)
    |
    └──────< OrderItem (Many)

User (1)
    |
    └──────< JWTToken (Many)
```

---

# 🔄 Application Flow Diagrams

## User Registration Flow

```text
User
 |
 ▼
Auth Controller
 |
 ▼
Validation
 |
 ▼
User Service
 |
 ▼
Repository
 |
 ▼
Database
```

---

## Login Flow

```text
User
 |
 ▼
Auth Controller
 |
 ▼
Authentication Manager
 |
 ▼
JWT Generation
 |
 ▼
HttpOnly Cookie
 |
 ▼
Response
```

---

## Product Purchase Flow

```text
Browse Products
       |
       ▼
Add To Cart
       |
       ▼
Checkout
       |
       ▼
Create Order
       |
       ▼
Payment
       |
       ▼
Order Confirmation
```

---

## Payment Flow

```text
Customer
 |
 ▼
Create Order
 |
 ▼
Razorpay Order
 |
 ▼
Payment Success
 |
 ▼
Verification
 |
 ▼
Order Confirmation
```

---

# 📚 API Documentation

Swagger/OpenAPI is integrated into the application.

## Swagger UI

```bash
http://localhost:8080/swagger-ui/index.html
```

## OpenAPI Docs

```bash
http://localhost:8080/v3/api-docs
```

Benefits:

* Interactive API Testing
* Request/Response Examples
* API Discoverability
* Faster Development

---

# ⚙ Installation

## Clone Repository

```bash
git clone https://github.com/your-org/cartify4u.git
cd cartify4u
```

## Build Project

```bash
mvn clean install
```

## Run Application

```bash
mvn spring-boot:run
```

---

# 🔧 Configuration

Update application.properties:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/cartify4u
spring.datasource.username=root
spring.datasource.password=password

jwt.secret=your-secret-key

razorpay.key=your-key
razorpay.secret=your-secret
```

---

# ▶ Running the Application

Application:

```text
http://localhost:8080
```

Swagger:

```text
http://localhost:8080/swagger-ui/index.html
```

---

# 🌐 API Endpoints

## Authentication

```text
/api/auth/**
```

## Users

```text
/api/users/**
```

## Products

```text
/api/products/**
```

## Cart

```text
/api/cart/**
```

## Orders

```text
/api/orders/**
```

## Payments

```text
/api/payment/**
```

## Admin Products

```text
/admin/products/**
```

## Admin Users

```text
/admin/user/**
```

## Business Analytics

```text
/admin/business/**
```

---

# 🎨 Design Patterns Used

* MVC Pattern
* Repository Pattern
* DTO Pattern
* Dependency Injection
* Service Layer Pattern
* Singleton Pattern
* RBAC Security Pattern

---

# 📄 Architecture Documentation

This repository includes complete architecture documentation.

## HLD Document

Includes:

* System Context Diagram
* Architecture Diagram
* Component Diagram
* Security Architecture
* Deployment Diagram

## LLD Document

Includes:

* Entity Design
* Service Design
* Controller Design
* Repository Design
* DTO Flow Design
* API Design

## Diagrams Included

* High-Level Architecture Diagram
* Component Diagram
* Security Flow Diagram
* Authentication Flow Diagram
* Authorization Flow Diagram
* Registration Flow Diagram
* Login Flow Diagram
* Product Purchase Flow Diagram
* Order Processing Flow Diagram
* Payment Flow Diagram
* ER Diagram
* Sequence Diagrams
* Deployment Diagram

### Supported Formats

* DOCX
* PDF

Suggested Location:

```text
/docs/architecture/
├── Cartify4U_HLD.pdf
├── Cartify4U_HLD.docx
├── Cartify4U_LLD.pdf
├── Cartify4U_LLD.docx
```

---

# 🚀 Future Enhancements

* Redis Caching
* Docker Support
* Kubernetes Deployment
* Kafka Integration
* Elasticsearch
* Recommendation Engine
* Email Notifications
* Inventory Management

---

# 🤝 Contributing

1. Fork Repository
2. Create Feature Branch
3. Commit Changes
4. Push Changes
5. Create Pull Request

---

# 📜 License

This project is intended for educational, learning, portfolio, and demonstration purposes.

---

<div align="center">

Made with ❤️ using Spring Boot, MySQL, JWT, Razorpay, and Swagger/OpenAPI.

</div>
