package com.aditya.emp;

import com.aditya.emp.service.EmployeeService;

public class EmployeeManager {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.getEmployeeWithFormattedSalaries().forEach(emp->{
            System.out.println(emp);
        });
    }
}
