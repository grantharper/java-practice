package com.example;

public class MethodOverrideAndInstanceVars {

	public static void main(String[] args) {
		A o1 = new C();
		B o2 = (B) o1;
		//accesses overriden method in C (object type)
		System.out.println(o1.m1());
		//accesses instance variable in B (reference type)
		System.out.println(o2.i);
		//accesses overriden method in C (object type)
		System.out.println(o2.m1());
		
		A o3 = new A();
		//this cast cannot happen and will result in a class cast exception
		B o4 = (B) o3;
	}
	
}


class A { int i = 10; int m1() { return i;} }
class B extends A { int i = 20; int m1() { return i;} }
class C extends B {int i = 30; int m1() { return i;} }