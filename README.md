Here’s how the API documentation would look in GitHub `README.md` format:

```markdown
# Event Management System API

This API allows you to manage events, organizers, and venues. Below are the endpoints available in the system.

## Base URL

```
http://localhost:8080/api
```

## Table of Contents

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

This documentation provides a clear overview of how to interact with the Event Management System API, including details on each endpoint, the HTTP methods used, and the expected request and response formats.
```

You can copy and paste this markdown into your `README.md` file on GitHub, and it will render properly as a formatted document.
