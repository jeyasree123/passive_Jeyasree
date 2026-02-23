# Employee Onboarding API for Company
## Description
##### This is the SpringBoot Application for a company to store onboarding employee details. In this application i have created two operations POST and GET for adding employees and get all employess. For Database I used Postgresql. Atfirst I created swagger and using swagger I created controller and Dto.Then I have created Service,Repository and Entity. In service layer I wrote my bussiness logic and Run the Project. Atlast i used Postman to hit the data.
## UML Diagram 
<img width="1308" height="892" alt="OnboardingEmployeeData" src="https://github.com/user-attachments/assets/3aae439f-a053-4513-b4c1-e869639b63b2" />


## Techologied used
1. Spring Boot
2. Java 21
3. Swagger
4. PostgreSQL
5. Postman
6. MAven
7. Spring Data JPA

## DataBase Used and its Configuration

PostgreSQL is used for the Employee CRUD API for JeyaSreeTech Company.

```
spring.datasource.url=jdbc:postgresql://localhost:5432/{databasename}
spring.datasource.username=[username]
spring.datasource.password=[password]
spring.datasource.driver-class-name = org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
```

## API Endpoint
- POST http://localhost:8080/api/employee
- GET http://localhost:8080/api/employee
 ## Functionality

- Create: Add new employee into the database. Employee details are employeeId, employeeName, email, role, salary.
- Fetch Employee: Retreive all employees from the database.

## Project Structure
```
src/main/java
  config
  controller
  mapper
  entity
  service
  repository
src/main/resources
  application.properties
  swagger.yaml
```

