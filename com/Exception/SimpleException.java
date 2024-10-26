package com.Exception;

public class SimpleException {

	public static void main(String[] args) {
		int a = 10;
		String [] fruits = {"Apple", "Banana", "Mango"};
		int num = (int)(Math.random() * 5);
		try {
			System.out.println("The division result is: " + a/num);
			System.out.println("The random number is: " + num);
			message();

			System.out.println(fruits[2]);
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Index order is not correct.");
		}
	}
	public static void  message() {
		System.out.println("You are in the right track!");
	}

}
