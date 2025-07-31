# Student Management System

![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-16-336791)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-005F0F)

A simple CRUD application for managing student records with PostgreSQL.

## Features
- **Create** students (first name, last name, email)
- **Read** student list
- **Update** student records
- **Delete** students
- Basic Thymeleaf UI

## Technologies
- **Backend**: Spring Boot 3.x
- **Frontend**: Thymeleaf
- **Database**: PostgreSQL
- **Build**: Maven

## Database Setup
```sql
CREATE TABLE students (
    id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100)
);
