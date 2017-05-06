package com.example;

public class StringPractice {
	
	
	private String s1;
	private String s2;
	
	public StringPractice(){
		this.s1 = "Hello";
		this.s2 = "World";
		
	}

	public static void main(String[] args) {
		
		StringPractice sp = new StringPractice();
		
		System.out.println(sp.getS1().concat(" ").concat(sp.getS2()));

	}
	
	public String getS1(){
		return s1;
	}
	
	public String getS2(){
		return s2;
	}

}
