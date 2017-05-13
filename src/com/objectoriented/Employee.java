package com.objectoriented;

public abstract class Employee {

	//standard 5 percent raise
	private static final double STANDARD_RAISE_FACTOR = 1.05;
	//class variable to provide unique ids for each employee
    private static int nextEmployeeId;
    //private access modifier ensures that no other class can modify the below instance variables, including children
    private int id;
    private String name;
    private String email;
    //protected instance variable allows children to directly access the variable
    protected double salary;
    
    public Employee(String name){
        this.id = nextEmployeeId;
        nextEmployeeId++; //increment the employee id
        this.name = name;
        this.email = name + "@" + Office.companyName + ".com";
    }
    
    public Employee(){
    	//call to other constructor MUST be the first line
    	this("fake");
    }

    //only a getter for a number of employee instance variables are present to make sure nobody can set it
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    //this setter guarantees that the salary will be rounded each time
    protected void setSalary(double salary){
    	this.salary = Math.round(salary);
    }

    public double getSalary() {
        return salary;
    }
    
    //this abstract method MUST be implemented by any concrete children of this class
    public abstract void talk();
    
    //this method MAY be overriden by children of the class, but this is not required
    public void payRaise(){
        setSalary(this.salary *= STANDARD_RAISE_FACTOR);
    }
    
    public void reportSalary(){
    	System.out.println(this.name + " makes $" + this.salary);
    }
    
    //because this has a primitive type, the overriding methods, must match the return type exactly
    public int overrideMe(){
    	return 1;
    }
    
    public abstract Employee getAnEmployee();
    
    public abstract void showFatigue() throws TiredException;
    
}
