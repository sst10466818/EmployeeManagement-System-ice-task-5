package com.mycompany.employeemanagement;

import java.util.Date;

//  Abstraction
public abstract class AbstractEmployee implements Employee {
    protected String name;
    protected double salary;
    protected Date hireDate; // Requirement: java.util.Date
    protected EmployeeType type;

    public AbstractEmployee(String name, double salary, Date hireDate, EmployeeType type) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        this.type = type;
    }

    // Shared method for all employees
    public double calculateBonus() {
        return this.salary * 0.10; // Default 10% bonus
    }

    public void displayInfo() {
        System.out.println("Name: " + name + " | Type: " + type + " | Hired: " + hireDate);
    }

    // Requirement: work() remains abstract for subclasses to define
    @Override
    public abstract void work();
}
