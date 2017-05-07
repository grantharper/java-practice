package com.objectoriented;

public interface Coder {

	
	//static methods in interfaces MUST have their method bodies defined (where else would they be defined)
	public static void blah() {
		System.out.println("Welcome to my world");
	}
	
	public static double randomNum1to10(){
		return  Math.round(Math.random() * 10.0);
	}
	
    public void code();
    
    default void complain(){
        System.out.println("This is such a pain...");
    }
    
}
