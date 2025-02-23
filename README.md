# Employee-MS
Menu-Based Employee Management System using Java

# Employee Management System

This is a simple Employee Management System implemented in Java. It allows users to add employee details, display all employee records, and calculate total salaries based on basic salary, HRA, DA, and income tax deductions.

## Features
- **Add an Employee**: Enter employee details including ID, department, designation, name, joining date, salary details, and designation code.
- **Display All Employees**: View all employee details in a structured format.
- **Calculate Total Salary**: Computes the total salary of each employee based on basic salary, HRA, DA (dependent on designation code), and income tax deductions.
- **Exit Program**: Allows the user to exit the system.

## Technologies Used
- **Language**: Java
- **Libraries**: `java.util.Scanner`

## How It Works
1. The program prompts the user to enter the number of employees.
2. The user is presented with a menu:
   - **Add an Employee**: Allows input of multiple employees' details.
   - **Display All**: Lists all employees with formatted output.
   - **Exit**: Terminates the program.
3. The total salary of each employee is calculated using:
   ```java
   float TS = basic[i] + hra[i] + da - it[i];
   ```
4. `getDA(String desCode)` function is used to retrieve the Dearness Allowance (DA) based on designation codes:
   - **HR**: 5000
   - **SD**: 4000
   - **Default**: 0

## Usage
1. Compile and run the Java file:
   ```bash
   javac exp1.java
   java exp1
   ```
2. Follow the menu prompts to add and view employee details.

## Future Improvements
- Expand designation codes and respective DA values.
- Implement data persistence (saving employee records to a file or database).
- Add employee search and update functionalities.

---
This project is a basic implementation of an Employee Management System using Java. Future enhancements can improve its usability and functionality.

