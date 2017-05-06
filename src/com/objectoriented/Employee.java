package com.objectoriented;

public abstract class Employee {

    private static String companyName = "joke";
    private static int nextEmployeeId;
    private int id;
    private String name;
    private String email;
    private double salary;
    
    public Employee(String name){
        this.id = nextEmployeeId;
        nextEmployeeId++; //increment the employee id
        this.name = name;
        this.email = name + "@" + companyName + ".com";
    }

    public static String getCompanyName() {
        return companyName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = Math.round(salary);
    }
    
    public abstract void talk();
    
    public void payRaise(){
        //standard 5 percent raise
        salary *= 1.05;
    }
    
}
