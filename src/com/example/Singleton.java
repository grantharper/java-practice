package com.example;

public class Singleton {
	
	private static Singleton obj;
	private static int counter;
	
	
	public static Singleton getInstance(){
		if(obj == null){
			obj = new Singleton();
		}
		return obj;
	}

	private Singleton(){
		counter++;
	}
	
	public static void main(String...strings){
		Singleton s1 = Singleton.getInstance();
		
		System.out.println(Singleton.getCounter());
		
		Singleton s2 = Singleton.getInstance();
		
		//should be the same counter since this constructor is only called once
		System.out.println(Singleton.getCounter());
		
	}

	public static int getCounter() {
		return counter;
	}

	
	
}
