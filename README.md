# 🚗 Parking Control API

## 📌 About the Project
Parking Control is a Spring Boot-based REST API for managing parking spot registrations in residential or corporate settings. It allows creation, update, and deletion of parking records while maintaining data integrity.

## 💡 Features
- Register and manage parking spots
- Validate unique license plates and apartment numbers
- Timestamp for registration entries
- Exception handling and status codes

## 🛠️ Technologies Used
- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok

## 📁 Folder Structure
```
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.parkingcontrol
│   │   └── resources
│   │       └── application.properties
```

## 🚀 Getting Started
1. Clone the repository
2. Configure your `application.properties` with your PostgreSQL credentials
3. Run `ParkingControlApplication.java`

```bash
git clone https://github.com/Lucasvdalves/Parking-Control.git
```

## 🔍 API Endpoints
- `POST /parking-spot`
- `GET /parking-spot`
- `GET /parking-spot/{id}`
- `PUT /parking-spot/{id}`
- `DELETE /parking-spot/{id}`

## 🎯 Future Improvements
- Add authentication and authorization
- Swagger documentation
- Pagination and filtering

## 📄 License
MIT License

