package com.Exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2;
        double result = 0;
        String continueCalc;
        Scanner s = new Scanner(System.in);
        
        do {
        try {
        System.out.print("Enter first number: \n");
        num1 = s.nextDouble();
        System.out.print("Enter your operator: \n");
        String operator = s.next();
        System.out.print("Enter last number: \n");
        num2 = s.nextDouble();

        if (operator.equals("+")) {
            result = num1 + num2;
            System.out.println("Result is: " + result);
        } else if (operator.equals("-")) {
            result = num1 - num2;
            System.out.println("Result is: " + result);
        } else if (operator.equals("*")) {
            result = num1 * num2;
            System.out.println("Result is: " + result);
        } else if (operator.equals("/")) {
            result = num1 / num2;
            System.out.println("Result is: " + result);
            if(num2 == 0) {
            	System.out.println("Cannot divide with 0.");
            }
        } else {
            System.out.println("Not a valid operator");
        }
        } catch(Exception e) {
        	e.printStackTrace();
        	System.out.println("Do not enter character or string or other invalid character.");
        }
		System.out.print("Do you want to perform another calculation? (yes/no): ");
		continueCalc = s.next();
        } while (continueCalc.equalsIgnoreCase("yes"));
        	System.out.println("Calculator exiting... Thank you!");
            s.close();
        
    }
}