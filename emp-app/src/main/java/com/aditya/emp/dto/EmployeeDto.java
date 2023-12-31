package com.aditya.emp.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class EmployeeDto {
    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private double salary;
    private String currency;
    private String formattedSalary;
}