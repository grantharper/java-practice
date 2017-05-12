package com.example;

public class WrapperClasses {

	public static void main(String[] args) {
		
		String myStr = "123";
		//converting from string to Long
		Long myLong = Long.parseLong(myStr);
		myLong = Long.valueOf(myStr);
		//using the .longValue() method
		long myPrimLong = myLong.longValue();
		//again auto-unboxing
		myPrimLong = myLong;
		myPrimLong = new Long(myStr);
		myPrimLong = Long.valueOf(myStr);
		
		
		
		
	}
	
}
