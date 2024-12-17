# UserRegistrationApp
This project is a User Registration System built using Java Servlets and MySQL. It collects user data via an HTML form, validates passwords, and stores the information in a MySQL database using JDBC. Based on the outcome, users are redirected to success, failure, or mismatch pages, showcasing input validation and servlet handling.
# User Registration System (Java Servlets + MySQL)

This project is a web-based **User Registration System** built using **Java Servlets** and **MySQL**. The application processes user input from an HTML form and stores validated data into a MySQL database.

## Features
- Input validation for matching passwords.
- Stores user details: Name, Email, Mobile, Password, Address.
- Redirects to success, failure, or mismatch pages based on the outcome.
- Utilizes **JDBC** for database connectivity.

## Technologies Used
- **Java Servlets**
- **MySQL Database**
- **HTML/CSS** (for frontend)
- **JDBC** for database integration

## Setup Instructions
1. **Database Setup**:  
   - Create a MySQL database named `jdbc` and a table `user` with the following schema:  
     ```sql
     CREATE TABLE user (
         id INT AUTO_INCREMENT PRIMARY KEY,
         name VARCHAR(50),
         email VARCHAR(50),
         mobile VARCHAR(15),
         password VARCHAR(50),
         address VARCHAR(100)
     );
     ```
   - Update the database credentials in the `Register.java` file:  
     ```java
     String url = "jdbc:mysql://localhost:3306/jdbc";
     String username = "root";
     String pwd = "your_password_here";
     ```

2. **Project Setup**:  
   - Use an IDE like **Eclipse** or **IntelliJ**.
   - Add the **MySQL JDBC Driver** (mysql-connector-java-x.x.x.jar) to your project's classpath.

3. **Deploy Application**:  
   - Place your project in a servlet container like **Tomcat**.
   - Ensure your `web.xml` includes the servlet mapping for the `Register` class.

4. **Run Application**:  
   - Access the application via the form page:  
     ```
     http://localhost:8080/your_project_name/form_page.html
     ```

## Directory Structure

## Author
- Prateek Chougale
- Contact: prateekchougale65@gmail.com
