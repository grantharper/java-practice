package com.example;

public class ExceptionExample {

	public ExceptionExample(){
		System.out.println("Class created");
	}
	
	public static void main(String[] args) {
		ExceptionExample example = new ExceptionExample();
		try {
			example.badCode();
		} catch (CustomException e) {
			System.out.println("Exception message: " + e.getMessage());
			e.printStackTrace(); //this must be an asynchronous operation, since it comes out after the other lines
		} finally{
			System.out.println("Finally block will always run");
		}
		System.out.println("Still running after the exception");
	}
	
	
	public void badCode() throws CustomException{
		throw new CustomException("bad code was run");
	}
	
}
