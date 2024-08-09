# Event Management System

This is a backend application for managing events, organizers, and venues, built using Java and Spring Boot. The application provides CRUD (Create, Read, Update, Delete) operations for managing the data related to events, organizers, and venues. This project is designed to be a robust and scalable backend for any event management platform.

## Table of Contents

- [Introduction](#introduction)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [API Endpoints](#api-endpoints)
  - [Events](#events)
  - [Organizers](#organizers)
  - [Venues](#venues)

## Introduction

The Event Management System is a backend service designed to handle the essential operations for managing events, organizers, and venues. This service is implemented using Java and Spring Boot and exposes RESTful APIs that can be consumed by any frontend application or other services.

## Technologies Used

- **Java 17**: The core programming language used for this project.
- **Spring Boot 3.x**: A framework that simplifies the development of Java applications.
- **Spring Data JPA**: Used for data persistence and interaction with the MySQL database.
- **MySQL**: The relational database used to store the data.
- **Postman**: Used for testing and documenting the REST APIs.

## Features

- **CRUD Operations**: 
  - Create, Read, Update, and Delete events, organizers, and venues.
- **RESTful API**: 
  - Well-defined API endpoints for managing data.
- **Spring Data JPA**: 
  - Simplifies data access using JPA repositories.
- **Validation**: 
  - Basic validation for input data.
- **Scalable Architecture**: 
  - Designed to be extended with additional features as needed.

## Base URL

```
http://localhost:8080/api
```

## Table of Contents

- [API Endpoints](#api-endpoints)
  - [Events](#events)
    - [Create Event](#create-event)
    - [Get All Events](#get-all-events)
    - [Update Event](#update-event)
    - [Delete Event](#delete-event)
  - [Organizers](#organizers)
    - [Create Organizer](#create-organizer)
    - [Get Organizer](#get-organizer)
    - [Update Organizer](#update-organizer)
  - [Venues](#venues)
    - [Create Venue](#create-venue)
    - [Get Venue](#get-venue)
    - [Update Venue](#update-venue)
    - [Delete Venue](#delete-venue)

---

## API Endpoints

### Events

- **POST** `/events` - Create a new event
- **GET** `/events` - Get all events
- **PUT** `/events/{id}` - Update an event by ID
- **DELETE** `/events/{id}` - Delete an event by ID

### Organizers

- **POST** `/organizers` - Create a new organizer
- **GET** `/organizers/{id}` - Get an organizer by ID
- **PUT** `/organizers/{id}` - Update an organizer by ID

### Venues

- **POST** `/venues` - Create a new venue
- **GET** `/venues/{id}` - Get a venue by ID
- **PUT** `/venues/{id}` - Update a venue by ID
- **DELETE** `/venues/{id}` - Delete a venue by ID


## Events

### Create Event

- **Endpoint:** `/events`
- **Method:** `POST`
- **Request Body:**

```json
{
    "eventName": "Java Classes",
    "eventDate": "2024-08-20",
    "description": "A Java class about OOPs",
    "organizer": {
        "id": 1  
    },
    "venue": {
        "id": 2  
    }
}
```

- **Response:** `201 Created` (if successful)

### Get All Events

- **Endpoint:** `/events`
- **Method:** `GET`
- **Response:** `200 OK` (returns a list of all events)

### Update Event

- **Endpoint:** `/events/{id}`
- **Method:** `PUT`
- **Request Body:**

```json
{
    "eventName": "Spring boot class",
    "eventDate": "2024-08-29",
    "description": "A spring boot class",
    "organizer": {
        "id": 2  
    },
    "venue": {
        "id": 4 
    }
}
```

- **Response:** `200 OK` (if successful)

### Delete Event

- **Endpoint:** `/events/{id}`
- **Method:** `DELETE`
- **Response:** `204 No Content` (if successful)

---

## Organizers

### Create Organizer

- **Endpoint:** `/organizers`
- **Method:** `POST`
- **Request Body:**

```json
{
    "name": "John Doe",
    "contactInfo": "johndoe@example.com"
}
```

- **Response:** `201 Created` (if successful)

### Get Organizer

- **Endpoint:** `/organizers/{id}`
- **Method:** `GET`
- **Response:** `200 OK` (returns organizer details)

### Update Organizer

- **Endpoint:** `/organizers/{id}`
- **Method:** `PUT`
- **Request Body:**

```json
{
    "name": "sandesh bhujbal",
    "contactInfo": "sandesh@gmail.com"
}
```

- **Response:** `200 OK` (if successful)

### Delete Organizer

- **Endpoint:** `/organizers/{id}`
- **Method:** `DELETE`
- **Response:** `204 No Content` (if successful)
---

## Venues

### Create Venue

- **Endpoint:** `/venues`
- **Method:** `POST`
- **Request Body:**

```json
{
    "name": "Class Java",
    "location": "Deccan, Pune",
    "capacity": 60
}
```

- **Response:** `201 Created` (if successful)

### Get Venue

- **Endpoint:** `/venues/{id}`
- **Method:** `GET`
- **Response:** `200 OK` (returns venue details)

### Update Venue

- **Endpoint:** `/venues/{id}`
- **Method:** `PUT`
- **Request Body:**

```json
{
    "name": "Class Spring boot",
    "location": "Vimannagar, Pune",
    "capacity": 20
}
```

- **Response:** `200 OK` (if successful)

### Delete Venue

- **Endpoint:** `/venues/{id}`
- **Method:** `DELETE`
- **Response:** `204 No Content` (if successful)

---




This `README.md` provides a clear overview of how to interact with the Event Management System API, including details on each endpoint, the HTTP methods used, and the expected request and response formats.
