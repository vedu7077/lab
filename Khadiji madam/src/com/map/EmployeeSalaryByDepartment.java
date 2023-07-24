package com.map;

import java.util.*;

class Department {
	
	
	
     int id;
     String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

class Employee {
	
	
     int id;
     String name;
    double salary;
     Department department;

    public Employee(int id, String name, double salary, Department department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Department getDepartment() {
        return department;
    }
}

public class EmployeeSalaryByDepartment {
    public static void main(String[] args) {
    	
    	
    	
        Department d1 = new Department(1, "Department 1");
        Department d2 = new Department(2, "Department 2");
        Department d3 = new Department(3, "Department 3");

        Employee employee1 = new Employee(1, "VEDANT", 5000, d1);
        Employee employee2 = new Employee(2, "VEDANG", 6000, d1);
        Employee employee3 = new Employee(3, "JAI", 5500, d2);
        Employee employee4 = new Employee(4, "MANGESH", 7000, d2);
        Employee employee5 = new Employee(5, "NIKHIL", 4500, d3);
        Employee employee6 = new Employee(6, "RUSHIKESH", 8000, d3);

        HashMap<Department, Double> hm = new HashMap<>();

        addEmployeeToMap(employee1, hm);
        addEmployeeToMap(employee2,hm);
        addEmployeeToMap(employee3,hm);
        addEmployeeToMap(employee4, hm);
        addEmployeeToMap(employee5, hm);
        addEmployeeToMap(employee6, hm);

        HashMap<Department, Double> departmentSalaryMap = null;
		// Print the department and average salary
        for (Map.Entry<Department, Double> entry : departmentSalaryMap.entrySet()) {
            Department department = entry.getKey();
            double averageSalary = entry.getValue();
            System.out.println(department.getName() + ": " + averageSalary);
        }
    }

    private static void addEmployeeToMap(Employee employee, HashMap<Department, Double> departmentSalaryMap) {
        Department department = employee.getDepartment();
        double salary = employee.getSalary();

        if (departmentSalaryMap.containsKey(department)) {
            double currentTotalSalary = departmentSalaryMap.get(department);
            int currentEmployeeCount = departmentSalaryMap.size() - 1; 
            double newAverageSalary = (currentTotalSalary + salary) / (currentEmployeeCount + 1);
            departmentSalaryMap.put(department, newAverageSalary);
        } else {
            departmentSalaryMap.put(department, salary);
        }
    }
}
