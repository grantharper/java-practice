package com.objectoriented;

public class Manager extends Employee {

    private static final double MANAGER_SALARY = 100_000.0;
    private static final double MANAGER_RAISE_FACTOR = 1.10;
    
    public Manager(String name) {
        super(name);
        this.salary = MANAGER_SALARY;
    }

    @Override
    public void talk() {
        System.out.println(super.getName() + ": I'm the manager!");
    }
    
    public void payRaise(){
    	//since salary is protected, this could work, but should use the setter instead
        //this.salary *= MANAGER_RAISE_FACTOR;
    	//setSalary(this.salary * MANAGER_RAISE_FACTOR);
    	setSalary(getSalary() * MANAGER_RAISE_FACTOR);
    }

}
