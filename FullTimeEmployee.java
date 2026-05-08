package com.mycompany.employeemanagement;
import java.util.Date;

public class FullTimeEmployee extends AbstractEmployee {
    public FullTimeEmployee(String name, double salary, Date hireDate) {
        super(name, salary, hireDate, EmployeeType.FULL_TIME);
    }

    @Override
    public void work() {
        System.out.println(name + " is managing department operations 40 hours a week.");
    }
}
