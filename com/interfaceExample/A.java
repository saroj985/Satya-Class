package com.interfaceExample;

public interface A {

	void eat();
	void dance();
	
	static void walk() {
		System.out.println("I like walking");
	}
	
	default void run() {
		System.out.println("I like running");
	}
	
}

public class B implements A {
	@Override
	public void eat() {
		System.out.println("I like to eat");
	}
	
	@Override
	public void dance() {
		System.out.println("I like to dance");
	}
	
	public static void main(String[] args) {
		A.walk();
		System.out.println("hi");
		
		A a = new B();
		a.eat();
		
		a.dance();
	}
	
	
}
