package com.example;

public class StringPractice {

	private String s1;
	private String s2;

	public StringPractice() {
		this.s1 = "Hello";
		this.s2 = "World";

	}

	public static void main(String[] args) {

		StringPractice sp = new StringPractice();

		System.out.println(sp.getS1().concat(" ").concat(sp.getS2()));

		String myStr = "good";
		char[] myCharArr = { 'g', 'o', 'o', 'd' };
		String newStr = null;
		for (char ch : myCharArr) {
			// nullgood because the polymorphic operator + allows you to add
			// null as a String
			newStr = newStr + ch;
		}
		System.out.println("newStr=" + newStr + " : myStr=" + myStr);
		System.out.println((newStr == myStr) + " " + (newStr.equals(myStr)));

		String hello = "Hello", lo = "lo";
		System.out.print((com.example.Other.hello == hello) + " "); // line 1
		System.out.print((Other.hello == hello) + " "); // line 2
		System.out.print((hello == ("Hel" + "lo")) + " "); // line 3
		// Strings computed at run time are newly created and therefore are
		// distinct. (So line 4 prints false.)
		System.out.print((hello == ("Hel" + lo)) + " "); // line 4
		System.out.println(hello == ("Hel" + lo).intern()); // line 5

	}

	public String getS1() {
		return s1;
	}

	public String getS2() {
		return s2;
	}

}

class Other {
	static String hello = "Hello";
}
