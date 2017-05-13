package com.example;

public class OrderOfOperations {
	
	//Postfix
	//Unary
	//Multiplication
	//Addition
	//Relational (<, >)
	//Equality (!=, ==)
	//Logical AND
	//Logical OR
	//Assignment
	
	
	private static double i = 4.0;
	private static double j = 8.0;
	private static double k = 2.0;

	public static void main(String[] args) {
		
		currentState();
		System.out.println(j++ / i + k); // 8 / 4 + 2 = 4 --> j increments to 9
		currentState();
		System.out.println( i + --j / k); // j decrements to 8 --> 4 + 8 / 2 = 8 
		currentState();
		System.out.println(i + j < k + j & i++ + k < --j); // false & --> j decrements to 7 --> 4 + 2 < 7 --> i increments to 5 
		currentState();
		
		
		//array access tricky order
		int index = 1;
		try{
			getArray()[index=2]++; //the assignment occurs before the null pointer is thrown
		}catch(Exception e){
			
		}
		System.out.println("index=" + index);
		
		boolean b1 = false; boolean b2 = false;
		//operator precedence here leads to false being assigned something, which is not allowed
		//compile time error
		//if (b2 != b1 = !b2){
		//this works because assignment is evaluated last
		if(b2 = b1 != b2){
			System.out.println("true"); 
		} else{
			System.out.println("false"); 
		}
		
	}
	
	public static int[] getArray(){
		return null;
	}
	
	public static void currentState(){
		System.out.println("i=" + i + ", j=" + j + ", k=" + k);
	}
	
	public static void reset(){
		i = 4.0;
		j = 8.0;
		k = 2.0;
	}
	
}
