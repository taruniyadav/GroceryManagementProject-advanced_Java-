# Grocery Management System

A Java-based Grocery Management System built using **Core Java, JDBC, and MySQL**. The project demonstrates database connectivity, object-oriented programming, and the organization of application logic into separate Java classes.

## Overview

The Grocery Management System is designed to handle grocery-related operations through a Java application connected to a MySQL database. It uses JDBC to communicate with the database and separates product, cart, and service-related logic into individual classes.

## Tech Stack

- **Language:** Java
- **Database:** MySQL
- **Database Connectivity:** JDBC
- **IDE:** Eclipse
- **Version Control:** Git and GitHub

## Project Structure

```text
GroceryManagementProject/
├── src/
│   ├── module-info.java
│   └── com/
│       └── grocery/
│           ├── CartItem.java
│           ├── DbConnection.java
│           ├── GroceryApp.java
│           ├── GroceryService.java
│           ├── GroceryServiceIMPL.java
│           ├── Product.java
│           └── package-info.java
├── .classpath
├── .project
├── .gitignore
└── README.md
```

## Prerequisites

Before running the application, ensure you have:

- Java Development Kit (JDK)
- MySQL Server
- MySQL Connector/J JDBC driver
- Eclipse IDE or another Java IDE

## Setup and Installation

### 1. Clone the repository

```bash
git clone -b github-ready https://github.com/taruniyadav/GroceryManagementProject-advanced_Java-.git
```

### 2. Create the database

Open MySQL and create the database:

```sql
CREATE DATABASE grocery_db;
```

Ensure that the database tables required by the application are created before running it.

### 3. Configure database connectivity

Open `src/com/grocery/DbConnection.java` and configure the JDBC connection URL, username, and password for your local MySQL environment.

**Security note:** Never commit actual database passwords or other sensitive credentials to GitHub. Keep local credentials private.

### 4. Configure the JDBC driver

Add the MySQL Connector/J driver to your project's build path so Java can establish a connection to MySQL.

### 5. Run the application

1. Import the project into Eclipse as an existing Java project.
2. Verify the JDK and MySQL JDBC driver configuration.
3. Ensure MySQL is running and the database is configured.
4. Run `GroceryApp.java` as a Java application.

## Key Components

| Class | Responsibility |
|---|---|
| `GroceryApp.java`         | Application entry point |
| `DbConnection.java`       | Establishes the database connection |
| `Product.java`            | Represents grocery product data |
| `CartItem.java`           | Represents an item in the shopping cart |
| `GroceryService.java`     | Defines grocery service operations |
| `GroceryServiceIMPL.java` | Implements grocery service logic |

## Concepts Demonstrated

- Object-oriented programming in Java
- Separation of application responsibilities
- JDBC-based database connectivity
- MySQL integration
- Java interfaces and implementation classes
- Git-based version control

## Future Improvements

- Add input validation and exception handling.
- Externalize database credentials using environment variables.
- Add automated tests for service and database operations.
- Improve application usability and reporting.

## Author

**Taruni Yadav**

