# EmployeeManagement-System-ice-task-5

## Project Overview
This project is an **Employee Management System** designed to demonstrate the practical application of advanced Java Object-Oriented Programming (OOP) principles. It manages various employee types (Full-Time, Part-Time, and Contract) while ensuring data integrity and specialized behavior through inheritance and polymorphism.




## Technical Features & Java Concepts
This implementation fulfills all project requirements by utilizing the following concepts:

*   **Date & Time**: Employs `java.util.Date` to accurately store and display employee hire dates.
*   **Exception Handling**: Includes a robust `try-catch` mechanism in the `Main` class to handle runtime errors and maintain system stability.
*   **Abstraction**: Features an `AbstractEmployee` class that provides a shared foundation for all staff while keeping specialized methods like `work()` abstract.
*   **Interfaces**: Implements the `Employee` interface to define a standard behavioral contract (`work()`) across the entire system.
*   **Enums**: Utilizes an `EmployeeType` enum to categorize staff members safely and avoid invalid data entries.
*   **Polymorphism**: Demonstrates polymorphic behavior by storing different concrete objects in an `Employee[]` array and executing specialized logic through a single loop.
*   **Type Casting**: Uses **Narrowing Casting** to access superclass-specific methods (like `displayInfo`) from interface references and to round calculated financial bonuses.
*   **Method Overriding**: Each concrete subclass (`FullTimeEmployee`, `PartTimeEmployee`, etc.) provides a unique implementation of the `work()` method.




## File Structure
*   **`Employee.java`**: Interface defining core employee behavior.
*   **`EmployeeType.java`**: Enum containing valid employee classifications.
*   **`AbstractEmployee.java`**: Abstract base class containing shared attributes (name, salary, hireDate).
*   **`FullTimeEmployee.java` / `PartTimeEmployee.java`**: Concrete subclasses with specific work logic.
*   **`Main.java`**: The execution class that builds the employee array and generates the system report.




## Instructions for Use
1.  **Environment**: Ensure you are using **NetBeans** with the Maven plugin installed.
2.  **Build**: Right-click the project and select **Clean and Build**[cite: 3].
3.  **Run**: Execute the `Main.java` file to see the polymorphic employee report in the console.



