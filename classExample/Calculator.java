//import java.util.Scanner;
//
//public class Calculator {
//
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("=====================");
//		System.out.println("     Calculator");
//		System.out.println("=====================");
//		
//		System.out.println("You can choose only following operator: ");
//		System.out.println("\nAddition (+),  Subtraction (-),  Multiplication (*),  Division (/)");
//		
//		System.out.print("Enter your number: ");
//		int num1 = scanner.nextInt();
//		
//		System.out.print("Enter you operand: ");
//		String operand = scanner.nextLine();
//		scanner.nextLine();
//		
//		
//		System.out.print("Enter you next number: ");
//		int num2 = scanner.nextInt();
//		
//		
//		if (operand.equals("+"))
//			System.out.println("The value of " + num1 +""+ num2 + "is: " + (num1 + num2) );
//		else if (operand.equals("-"))
//			System.out.println("The value of " + num1 +""+ num2 + "is: " + (num1 - num2) );
//		else if (operand.equals("*"))
//			System.out.println("The value of " + num1 + ""+num2 + "is: " + (num1 + num2) );
//		else if (operand.equals("/"))
//			System.out.println("The value of " + num1 + ""+ num2 + "is: " + (num1 + num2) );
//
//
//		scanner.close();
//		
//	}
//
//}
package com;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=====================");
        System.out.println("     Calculator");
        System.out.println("=====================");
        
        System.out.println("You can choose only the following operator: ");
        System.out.println("\nAddition (+),  Subtraction (-),  Multiplication (*),  Division (/)");
        
        System.out.print("Enter your number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter your operand: ");
        scanner.nextLine(); // Consume the newline character
        String operand = scanner.nextLine();
        
        System.out.print("Enter your next number: ");
        int num2 = scanner.nextInt();
        
        if (operand.equals("+"))
            System.out.println("The value of " + num1 + " + " + num2 + " is: " + (num1 + num2));
        else if (operand.equals("-"))
            System.out.println("The value of " + num1 + " - " + num2 + " is: " + (num1 - num2));
        else if (operand.equals("*"))
            System.out.println("The value of " + num1 + " * " + num2 + " is: " + (num1 * num2));
        else if (operand.equals("/"))
            System.out.println("The value of " + num1 + " / " + num2 + " is: " + (num1 / num2));
        
        scanner.close();
    }
}

