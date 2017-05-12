package com.example;

public class CustomException extends Exception{

	public CustomException(String string) {
		//must call the constructor of the parent class, because constructors are NOT inherited
		super(string);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -772088027430123736L;

	
	
}
