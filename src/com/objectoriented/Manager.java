package com.objectoriented;

public class Manager extends Employee {

    private static final double MANAGER_SALARY = 100_000.0;
    
    public Manager(String name) {
        super(name);
        super.setSalary(MANAGER_SALARY);
    }

    @Override
    public void talk() {
        System.out.println(super.getName() + ": I'm the manager!");
    }
    
    public void payRaise(){
        super.setSalary(super.getSalary() * 1.10);
    }

}
