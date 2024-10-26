package com.Exception;


public class TryWithMultiCatch {

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
		catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(a +" is divided by "+b);
		} 
		catch (ArrayIndexOutOfBoundsException ex) {
			ex.printStackTrace();
			//System.out.println("Its ArrayIndexOutOfBoundsException");
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
		
		System.out.println("End of main method");
		System.out.println("Calculated value is "+val*val);

	}

}
