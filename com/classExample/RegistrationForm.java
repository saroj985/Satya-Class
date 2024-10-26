package com.classExample;
import java.util.Scanner;

public class RegistrationForm {

	public static void main(String[] args) {
//		// Create a Scanner object for user input
//		Scanner s = new Scanner(System.in);
//
//		// Display a welcome message
//		System.out.println("=======================================");
//		System.out.println("       User Registration Form          ");
//		System.out.println("=======================================\n");
//
//		// Prompt the user for input
//		System.out.print("Enter First Name: ");
//		String firstName = s.nextLine();
//
//		System.out.print("Enter Last Name: ");
//		String lastName = s.nextLine();
//
//		System.out.print("Enter Email: ");
//		String email = s.nextLine();
//
//		System.out.print("Enter Age: ");
//		int age = s.nextInt();
//		s.nextLine(); // Consume the newline left-over
//
//		System.out.print("Do you agree to the terms and conditions? (yes/no): ");
//		String agreement = s.nextLine();
//
//		// Basic validation
//		if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || age < 18
//				|| (!agreement.equalsIgnoreCase("yes"))) {
//			System.out.println("\n=======================================");
//			System.out.println("                Error                 ");
//			System.out.println("=======================================\n");
//			System.out.println("Please fill in all fields correctly and agree to the terms.");
//		} else {
//			// Display success message
//			System.out.println("\n=======================================");
//			System.out.println("           Registration Successful     ");
//			System.out.println("=======================================\n");
//			System.out.println("Welcome, " + firstName + " " + lastName + "!");
//			System.out.println("Email: " + email);
//			System.out.println("Age: " + age);
//			System.out.println("Thank you for registering!\n");
//		}
//		// Close the scanner
//		s.close();
		
		
		
		
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("=======================");
		System.out.println("   Registration Form");
		System.out.println("=======================");
		
		System.out.println("\nWelcome to the Registration Form");
		
		System.out.print("\nEnter your first name: ");
		String firstName = input.nextLine();
		
		System.out.print("\nEnter your last name: ");
		String lastName = input.nextLine();	
		
		System.out.print("\nEnter your age: ");
		int age = input.nextInt();
		input.nextLine();
		
		System.out.print("\nEnter you email: ");
		String email = input.nextLine();
		
		System.out.println("\n******************************");
		System.out.println("Welcome to Registration Form");
		System.out.println("******************************");

		
		System.out.println("Name: " + firstName + lastName);
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);
		
		input.close();
		
		
		
		
		
	}


}
