package com.Exception;


public class NestedCatch {

	public static void main(String[] args) {
		
		int a =10 ;
		int b=(int) (Math.random()*5);
		System.out.println("Random number is :- "+b);
		try {
			int d = a/b; // generate Airth Excep -> / by zero
			System.out.println("Value of d :"+d);
			int ar[]= {10,20, 30 , 40};
			try {
				System.out.println("value at index 2 "+ar[4]); // generate Array Index Out Of Bound
			} catch (ArrayIndexOutOfBoundsException ex) {
				ex.printStackTrace();
			}
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}

	}
	

}
