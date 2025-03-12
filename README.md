# Employee Management System

## Overview
The **Employee Management System (EMS)** is a backend application built using **Spring MVC** to manage employee records. It provides functionalities for adding, updating, deleting, and retrieving employee details.

## Features
- Add new employees
- View employee list
- Update employee information
- Delete employee records
- REST API support

## Technologies Used
- **Backend:** Spring MVC, Spring Boot, Hibernate, JPA
- **Database:** MySQL / PostgreSQL
- **Build Tool:** Maven

## Installation and Setup

### Prerequisites
- Java 17+
- Maven
- MySQL or PostgreSQL
- Git

### Steps to Run the Project
1. **Clone the repository:**
   ```sh
   git clone https://github.com/yourusername/employee-management-system.git
   cd employee-management-system
   ```
2. **Configure the database:**
   - Update `application.properties` with your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/ems_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. **Build the project:**
   ```sh
   mvn clean install
   ```
4. **Run the application:**
   ```sh
   mvn spring-boot:run
   ```
5. **Access the API Endpoints:**
   - The application runs on `http://localhost:8080`

## API Endpoints
| HTTP Method | Endpoint | Description |
|------------|---------|-------------|
| GET | `/employees` | Get all employees |
| POST | `/employees` | Add a new employee |
| PUT | `/employees/{id}` | Update an employee |
| DELETE | `/employees/{id}` | Delete an employee |

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact
For any inquiries, please reach out via email at **jeevithae30k@gmail.com** or open an issue on GitHub.

