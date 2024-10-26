package com.Exception;

public class CatchWithMultiException {

	public static void main(String[] args) {
		int a = 10;
		int b = (int) (Math.random() * 5);
		System.out.println("Random number is :- " + b);
		int val =0;
		try {
			int d = a / b; // generate Airth Excep -> / by zero
			System.out.println("Value of d :" + d);
			int ar[] = { 10, 20 };
			val=ar[b];
			System.out.println("value at index  " + ar[b]);
			String str=null;
			str.toString();
			
		} 
		catch (ArithmeticException | ArrayIndexOutOfBoundsException ae) {
			ae.printStackTrace();
		} 
		
		
		System.out.println("End of main method");
		System.out.println("Calculated value is "+val*val);

	}

}
