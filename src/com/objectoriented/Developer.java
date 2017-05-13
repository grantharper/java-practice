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
    
    //This return type is not allowed becuase it is not compatible with the primitive return type of Employee
	// public Integer overrideMe(){
	// return 1;
	// }
    
    //can also just keep the Employee object reference here instead of explicitly stating it returns Developer
    public Employee getAnEmployee(){
    	return new Developer("Dev Girl");
    }
    
  //cannot throw a parent exception to the method from Employee
	// public void showFatigue() throws Exception{
	//
	// }
    
    public void showFatigue() throws TiredException{
    	throw new TiredException();
    }
    
    

}
