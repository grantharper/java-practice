package com.objectoriented;

public class Developer extends Employee implements Coder{

    public static final double DEVELOPER_SALARY = 80_000.0;
    
    public Developer(String name){
        super(name);
        super.setSalary(DEVELOPER_SALARY);
    }
    
    @Override
    public void talk() {
        System.out.println(super.getName() + ": I want to build beautiful code.");
    }

    @Override
    public void code() {
        System.out.println("I'm coding!");
        
    }

}
