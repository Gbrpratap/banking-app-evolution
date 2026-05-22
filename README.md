# banking-app-evolution

Banking Application: The Java Evolution Journey: This repository is a living record of my journey through the history of Java development. Instead of jumping
straight into modern tools, I am building a banking application three times to experience how the ecosystem evolved from raw foundations to modern microservices.

Era 1: The Raw Foundations (Servlets & JSP)

Era 2: The Structure Revolution (Early Spring Framework)

Era 3: The Modern Era (Spring Boot & Microservices)

Era 1 Setup information

Java JDK 17
Apache Tomcat 9.0
MySQL Server
MySQL Connector (I am using version 9.1.0)

mySQL table creation queries

Create the Database

CREATE DATABASE SimpleBankDB;
USE SimpleBankDB;

Users Table

CREATE TABLE Users (
user_id INT PRIMARY KEY AUTO_INCREMENT,
username VARCHAR(50) NOT NULL UNIQUE,
password VARCHAR(50) NOT NULL,
full_name VARCHAR(100) NOT NULL
);

Accounts Table

CREATE TABLE Accounts (
account_id INT PRIMARY KEY AUTO_INCREMENT,
user_id INT,
account_type VARCHAR(20), -- 'SAVINGS' or 'CHECKING'
balance DECIMAL(15, 2) DEFAULT 0.00,
interest_rate DECIMAL(5, 2) DEFAULT 0.00,
FOREIGN KEY (user_id) REFERENCES Users(user_id)
);

Transactions Table

CREATE TABLE Transactions (
transaction_id INT PRIMARY KEY AUTO_INCREMENT,
account_id INT,
amount DECIMAL(15, 2),
transaction_type VARCHAR(20),
transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
FOREIGN KEY (account_id) REFERENCES Accounts(account_id)
);
branch 'main' of https://github.com/Gbrpratap/banking-app-evolution
