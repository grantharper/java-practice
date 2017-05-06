package com.objectoriented;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<Employee> allEmployees;
    
    public Office(){
        allEmployees = new ArrayList<>();
        Employee manager = new Manager("Joe");
        Employee developer1 = new Developer("Katie");
        Employee developer2 = new Developer("Shreya");
        allEmployees.add(manager);
        allEmployees.add(developer1);
        allEmployees.add(developer2);
    }
    
    public static void main(String[] args) {
        
        Office office = new Office();
        
        
        for(Employee emp: office.getAllEmployees()){
            System.out.println(emp.getName() + " makes $" + emp.getSalary());
            emp.talk();
        }
        
        System.out.println("End of the year salary increases are here!");
        
        for(Employee emp: office.getAllEmployees()){
            emp.payRaise();
            System.out.println(emp.getName() + " now makes $" + emp.getSalary());
        }
        
    }

    public List<Employee> getAllEmployees() {
        return allEmployees;
    }
    
    
}
