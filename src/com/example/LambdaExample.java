package com.example;

public class LambdaExample {

	
	public static void main(String[] args) {
		
		LambdaInterface a = (u, v) -> u * v;
		
		System.out.println(a.compute(4, 2));
		
		LambdaInterface b = (u, v) -> u / v;
		
		System.out.println(b.compute(4, 2));
	}
}
