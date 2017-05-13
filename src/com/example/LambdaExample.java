package com.example;


import java.util.ArrayList;
import java.util.List;
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
		
		
		//Tricky example
		boolean bb = false;
		
		//the isEmpty method is being used to return a boolean based on a passed in list
		bb = checkList(new ArrayList(), al -> al.isEmpty());
		
		//this is not allowed for two reasons. First because you have to surround the expression with parentheses
		//second because ArrayList implements List, so this more specific type can't be passed in
		//bb = checkList(new ArrayList(), ArrayList al -> al.isEmpty());
		
		//this is not allowed because the return statement requires brackets
		//bb = checkList(new ArrayList(), al -> return al.size() == 0);
		//this would be a correct way to do this
		bb = checkList(new ArrayList(), al -> {
			return al.size() == 0;
		});
		
		//the add method returns a boolean, so this is valid
		bb = checkList(new ArrayList(), al -> al.add("hello"));
		
		//this is invalid because the Lambda Predicate specfies list as the type
		//bb = checkList(new ArrayList(), (ArrayList al) -> al.isEmpty());
		
	
	}
	
	
	public static boolean checkList(List list, Predicate<List> p){
		return p.test(list);
	}
}
