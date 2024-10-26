package com.Exception;

//Assignment:- Can try with finally (without catch ) can be used. Or Catch with finally (without try) be used

public class Finally {

	public static void main(String[] args) {
		randomNumwithFinally();
		animalArrayWithTryAndCatch();
	}

	public static void randomNumwithFinally() {

		int a = 10;
		int b = (int) (Math.random() * 5);
		System.out.println("Random number: " + b);
		try {
			int c = a / b;
		} finally {
			System.out.println("I am still able to print.");
		}
	}

	public static void animalArrayWithTryAndCatch() {
		String animal[] = { "Lion", "Tiger", "Rhino", "Monkey", "Horse", "Elephant" };
		int i = (int) (Math.random() * animal.length);

		try {
			if (i > 3) {
				System.out.println("Animal at index " + i + " is: " + animal[i]);
				int error = i / 0;
			}

			System.out.println("Random number: " + animal[i]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

	}
}
