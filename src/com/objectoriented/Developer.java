package com.objectoriented;

public class Developer extends Employee {

    public static final double DEVELOPER_SALARY = 80_000.0;
    
    public Developer(String name){
        super(name);
        super.setSalary(DEVELOPER_SALARY);
    }
    
    @Override
    public void talk() {
        System.out.println(super.getName() + ": I want to build beautiful code.");
    }

}
