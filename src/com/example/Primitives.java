package com.example;

public class Primitives {

	public static void main(String... args) {
		System.out.println("Program is running");
		
		int i = 10;
		int j = i++ + ++i;
		System.out.println("i=" + i);
		System.out.println("j=" + j);
		char c = 'a';
		System.out.println(c + i);
		int h = 0x1F;
		System.out.println(h);
		int o = 017;
		System.out.println(o);
		int b = 0b11111111;
		System.out.println(b);
		
		float f = 100.0f;
		double d = 100.0;
		
		long l1 = 20000000000000L;
		long l2 = 132L;
		
		float f1 = l1 + l2;
		System.out.println(f1);
		
		double d1 = l1 + l2;
		System.out.println(d1);
		
		System.out.println(someInt(3));
	}
	
	
	protected static int someInt(int int1){
		byte b = 2;
		return b;
	}
	
	static void charPractice(){
		
		char c = 'a';
		int f = 10;
		//results in a compilation error because int can't be narrowed to char
		//c = f;
		final int g = 10;
		//does not result in a compilation error because the value is known at compile time
		c = g;
		
		byte b = 1;
		//even though char has a good positive range for byte, the negatives make this impossible
		//c = b;
		
		final long l = 100L;
		//even though the long is final and within range, this cannot be implicitly narrowed
		//c = l;
		
		
	}

}
