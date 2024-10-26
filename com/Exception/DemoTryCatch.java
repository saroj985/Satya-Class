package com.Exception;


public class DemoTryCatch {

	public static void main(String[] args) {
		int a =10 ;
		int b=(int) (Math.random()*5);
		System.out.println("Random number is :- "+b);
		try {
			int d = a/b; // exce is generated
			System.out.println("Value of d :"+d);
			
		} catch (Exception e) { // exce is caught
			System.out.println("Exception generated");
			System.out.println("excepoccured"+e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("End of main method");
		

	}

}
