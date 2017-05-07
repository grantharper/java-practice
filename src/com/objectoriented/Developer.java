package com.objectoriented;

public class Developer extends Employee implements Coder{

    private static final double DEVELOPER_SALARY = 80_000.0;
    
    public Developer(String name){
        super(name);
        this.salary = DEVELOPER_SALARY;
    }
    
    @Override
    public void talk() {
    	//cannot use this.name here because the instance variable is not visible to this class
        System.out.println(this.getName() + ": I want to build beautiful code.");
    }

    @Override
    public void code() {
        System.out.println("I'm coding!");
        
    }

}
