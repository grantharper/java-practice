package com.example;

import java.util.function.Predicate;

public class LambdaExample {

	
	public static void main(String[] args) {
		
		LambdaInterface a = (u, v) -> u * v;
		
		System.out.println(a.compute(4, 2));
		
		LambdaInterface b = (u, v) -> u / v;
		
		System.out.println(b.compute(4, 2));
		
		Predicate<Object> c = u -> {
			System.out.println(u.hashCode());
			if(u.hashCode() < 1044036745){
				return true;
			}
			return false;
		};
		
		System.out.println("The predicate returns " + c.test(new Object()));
	
	}
}
