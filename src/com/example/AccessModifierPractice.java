package com.example;

public class AccessModifierPractice {

	private int number;
	
	private Person p1;
	private Person p2;
	
	public AccessModifierPractice(){
		p1 = new Person("Fred", 234);
		p2 = new Person("Joe", 123);
	}
	
	public static void main(String[] args) {
		AccessModifierPractice practice = new AccessModifierPractice();
		practice.p1 = practice.p2;
		practice.p1.name = "Smith";
		
		System.out.println("p1=" + practice.p1.toString());
		System.out.println("p2=" + practice.p2.toString());
		
	}
	
	//explore the differences between literal ints going into other data types and how datatypes are passed to method parameters
	
	
	private int getNumber(){
		return 1;
	}


	public Person getP1() {
		return p1;
	}


	public void setP1(Person p1) {
		this.p1 = p1;
	}


	public Person getP2() {
		return p2;
	}


	public void setP2(Person p2) {
		this.p2 = p2;
	}


	public void setNumber(int number) {
		this.number = number;
	}
	
	
	

}

