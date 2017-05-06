package com.example;

public class Person implements Comparable<Person>{
	
	String name;
	int number;
	
	public Person(){
		name = "Joe";
		number = 1234;
	}
	
	public Person(String name, int number){
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public String toString(){
		return name + number;
		
	}

	@Override
	public int compareTo(Person o) {
		if(this.number < o.getNumber()){
			return -1;
		}else if(this.number == o.getNumber()){
			return 0;
		}else{
			return 1;
		}
		
	}
	

}
