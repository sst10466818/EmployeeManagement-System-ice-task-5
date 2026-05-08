package com.mycompany.employeemanagement;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        try {
            // Demonstrate Polymorphism: Array of type Employee (Interface)
            Employee[] staff = new Employee[3];

            staff[0] = new FullTimeEmployee("Alice Johnson", 60000.0, new Date());
            staff[1] = new PartTimeEmployee("Bob Smith", 25000.0, new Date());
            staff[2] = new FullTimeEmployee("Charlie Davis", 55000.0, new Date());

            System.out.println("--- Employee Management System Report ---");

            for (Employee e : staff) {
                // Concept: Method Overriding (specific work details)
                e.work();

                // Requirement: Use Type Casting to access AbstractEmployee methods
                if (e instanceof AbstractEmployee) {
                    AbstractEmployee ae = (AbstractEmployee) e; // Narrowing cast
                    ae.displayInfo();
                    
                    // Requirement: Cast result for specific display
                    int roundedBonus = (int) ae.calculateBonus(); 
                    System.out.println("Calculated Bonus (Rounded): $" + roundedBonus);
                }
                System.out.println("---------------------------------------");
            }

        } catch (Exception ex) {
            // Requirement: Exception Handling
            System.out.println("A system error occurred: " + ex.getMessage());
        }
    }
}
