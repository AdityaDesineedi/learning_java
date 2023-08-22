package com.aditya.cj.day21;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    public static void main(String[] args) {
        List<Employee> list = loadFromFile();
        //list.stream().forEach(System.out::println);
        //Get the employee names name => firstName+ " "+lastName
        List<String> fullNameList = getFullNames(list);
        System.out.println(fullNameList);

    }

    private static List<String> getFullNames(List<Employee> employeeList){
        List<String> list = new ArrayList<>();
        for(Employee employee:employeeList){
            String name = employee.getFirstname() +" "+employee.getLastname();
            list.add(name);
        }
        return list;
    }

    private static List<Employee> loadFromFile(){
        //Open
        //Read
        //Convert row emp to object
        //Add each object to container
        //Return container object
        List<Employee> empList = new ArrayList<>();
        try {
            URL url = EmployeeManager.class.getResource("/employee.csv");
            List<String> list = Files.readAllLines(Paths.get(url.toURI()));
            for(int i=1;i<list.size();i++){
                String data = list.get(i);
                String[] arr = data.split(",");
                Employee emp = convertRowToEmp(arr);
                empList.add(emp);
            }
        }catch (IOException |URISyntaxException e){
            e.printStackTrace();
        }
        return empList;
    }

    private static Employee convertRowToEmp(String[] arr){
        Long id = Long.parseLong(arr[0]);
        String firstname = arr[1];
        String lastname = arr[2];
        String email = arr[3];
        String gender = arr[4];
        double salary = Double.parseDouble(arr[5]);
        return new Employee(id,firstname,lastname,email,gender,salary);
    }

    private static List<Employee> convertRowsToList(List<String> list){
        throw new UnsupportedOperationException("This operation is not supported");
    }
    private static double withdraw(double balance,double amount){
        if(balance<amount){
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance-=amount;
        return balance;
    }
}
