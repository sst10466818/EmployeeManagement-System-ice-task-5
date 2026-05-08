package com.mycompany.employeemanagement;
import java.util.Date;

public class PartTimeEmployee extends AbstractEmployee {
    public PartTimeEmployee(String name, double salary, Date hireDate) {
        super(name, salary, hireDate, EmployeeType.PART_TIME);
    }

    @Override
    public void work() {
        System.out.println(name + " is assisting with seasonal shifts.");
    }
}
