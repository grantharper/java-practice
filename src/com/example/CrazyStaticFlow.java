package com.example;

public class CrazyStaticFlow {

	public static void main(String[] args) {
		System.out.println("Application main method started");
		CrazyStaticFlow csf = new CrazyStaticFlow();
		//Static methods of AnotherClass don't get executed unless it is referenced AND instantiated
		AnotherClass ac = new AnotherClass();
	}
	
	static {
		// This will throw ExceptionInInitializerError
		// Integer.parseInt("blah");
		System.out.println("static initializer 1");
	}

	

	public static int STATIC_INT = getInt();
	
	static {
		System.out.println("static initializer 2");
	}

	public static int getInt() {
		System.out.println("Called getInt()");
		// This will throw ExceptionInInitializerError
		//Integer.parseInt("blah");
		return 1;
	}
	
	
	
	public CrazyStaticFlow(){
		System.out.println("Constructor!");
	}
	
	
	String instanceVar = getInstanceVar();
	
	{
		System.out.println("instance initializer");
	}
	
	
			
	String getInstanceVar(){
		System.out.println("getting instance variable");
		return "a";
	}

}

class AnotherClass{
    
    static{
        System.out.println("Another class is running its static initializer");
    }
}
