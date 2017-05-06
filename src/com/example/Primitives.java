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

}
