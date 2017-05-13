package com.example;

public class WrapperClasses {

	public static void main(String[] args) {
		
	    //Examples using Long
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
		myPrimLong = Long.valueOf(myPrimLong);
		
		//Examples using Integer
		//converting from String to Integer
		Integer myInteger = Integer.parseInt(myStr);
		myInteger = Integer.valueOf(myStr);
		//using the .intValue() method
		int myPrimInt = myInteger.intValue();
		//auto-unboxing
		myPrimInt = myInteger;
		myPrimInt = new Integer(myStr);
		myPrimInt = Integer.valueOf(myStr);
		
		
		//Examples using Character
		myStr = "a";
		//can't do this because the Character wrapper class does not have the valueOf(String str) method
		//Character myChar = Character.valueOf(myStr);
		char myChar = 'a';
		Character myCharacter = Character.valueOf(myChar);
		myCharacter = new Character(myChar);
		myChar = myCharacter.charValue();
		myCharacter = myChar;
		
		//convert to a string
		myStr = myCharacter.toString();
		myCharacter = myStr.charAt(1);
		
	}
	
}
