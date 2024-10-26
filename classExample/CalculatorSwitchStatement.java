package com.classExample;

import java.util.Scanner;

public class CalculatorSwitchStatement {

	public static void main(String[] args) {
		double n1, n2; 
		double result = 0;
		String operator;

		System.out.println("Calculator\n");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number: ");
		n1 = s.nextDouble();
		
		System.out.println("Enter the operator: +, -, *, /");
		operator = s.next();
		
		System.out.println("Enter next number: ");
		n2 = s.nextDouble();
		
		switch(operator) {
		case "+":
			result = n1 + n2;
			break;
		case "-":
			result = n1 - n2;
			break;
		case "*":
			result = n1 * n2;
			break;
		case "/":
			result = n1 / n2;
			break;
		default:
			System.out.println("Enter valid operator.");
		}

		
		System.out.println("The result is: " + result);

		

		
	}

}
