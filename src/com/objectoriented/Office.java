package com.objectoriented;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Office {

	
	public static final String companyName = "Joke Inc.";
    private List<Employee> allEmployees;
    
    public Office(){
    	
    	//using a static final class variable to be able to reference the company name throughout
    	System.out.println("Welcome to " + Office.companyName);
    	
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
        	emp.talk();
            emp.reportSalary();
        }
        
        System.out.println("End of the year salary increases are here!");
        
        for(Employee emp: office.getAllEmployees()){
            emp.payRaise();
            emp.reportSalary();
        }
        
        System.out.println("Coding time in " + Coder.randomNum1to10() + " minutes");
        Coder.blah();
        for(Employee emp: office.getAllEmployees()){
            if(emp instanceof Coder){
            	Coder c = (Coder) emp;
            	//example of a lambda function implementation of predicate
            	Predicate<Coder> predicate = p -> (Coder.randomNum1to10() < 5);
            	if(predicate.test(null)){
            		c.complain();
            	}else{
            		c.code();
            	}
            }
        }
        
        
        
    }

    public List<Employee> getAllEmployees() {
        return allEmployees;
    }
    
    
}
