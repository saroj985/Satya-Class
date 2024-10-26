//Adding two numbers with different numeric and decimal data types 
package com;

public class AddingTwoNumbers {
	public static void main(String[] args) {
		int a = 10, b = 20;
		int sum = a + b;
		
		int c = a++; //This will add the value of a to c and perform addition
		int d = ++a; //This will increment the value of a with 1 and assign the value after that
		int e = a--; //This will assign the value of a to e and perform substraction.
		int f = --a; //This will perform decrement first and assign its value to f.
		
		if (a > b & b > a)
			System.out.println("True");
		else
			System.out.println("False"); //This will print false.
		
		
		String str = (a > b & b < a) ? "True" : "Fasle"; 
		
		System.out.println(c); //This will print 10
		System.out.println(d); //This will print 12
		System.out.println(e); //This will print 12
		System.out.println(f); //This will print 10
		System.out.println("The sum of " + a + " and " + b  +" is: " + sum); 
		System.out.println(str); //This will print False
		System.out.println((a > b & b < a) ? "True" : "Fasle"); //This will print False
		System.out.println((a < b || b > a) ? "True" : "False"); //This will print True
		System.out.println((a < b && b > a) ? "True" : "False"); //This will print True
		
		

		
	}


}
