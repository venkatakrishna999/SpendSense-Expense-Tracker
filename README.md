# SpendSense – Expense Tracker

## Project Overview

SpendSense is a personal expense management application developed using Spring Boot and MySQL. It helps users manage their daily expenses, track income, monitor spending habits, and maintain financial records efficiently.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL
- REST API
- Maven
- Postman
- Git & GitHub

## Features

- Add new income and expense records.
- View all transactions.
- Update existing transaction details.
- Delete transactions.
- Track daily expenses.
- Manage income and expenses.
- Store transaction details in MySQL database.
- Perform CRUD operations through REST APIs.

## Project Structure

```text
SpendSense-Expense-Tracker/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── spendsense/
│   │   │           ├── controller/
│   │   │           ├── service/
│   │   │           ├── repository/
│   │   │           ├── entity/
│   │   │           └── SpendSenseApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── pom.xml
├── database.sql
└── README.md
```

## Database Configuration

1. Install MySQL Server and MySQL Workbench.
2. Create a database for SpendSense.
3. Configure database credentials in `application.properties`.
4. Execute the SQL queries from `database.sql` if provided.

Example configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/spendsense
spring.datasource.username=root
spring.datasource.password=kittu

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/venkatakrishna999/SpendSense-Expense-Tracker.git
```

2. Open the project in Eclipse or Spring Tool Suite.
3. Update Maven dependencies.
4. Configure the MySQL database.
5. Run the `SpendSenseApplication.java` file.
6. The Spring Boot application will start.

## API Testing

Use Postman to test the REST APIs.

Available operations:
- POST – Create transaction.
- GET – Retrieve transactions.
- PUT – Update transaction.
- DELETE – Delete transaction.

## GitHub Repository

https://github.com/venkatakrishna999/SpendSense-Expense-Tracker

## Developer

**PAMARTHI VENKATAKRISHNA**

Java Developer
