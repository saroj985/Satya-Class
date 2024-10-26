package com.Exception;

public class VotingSystem {

    // Method to check eligibility
    public static void checkEligibility(int age) throws AgeNotEligibleException {
        if (age < 18) {
        	//Even though you don't explicitly see an object creation line like new AgeNotEligibleException(), 
        	//an object is created when you throw the exception.
            throw new AgeNotEligibleException("Age is less than 18, not eligible to vote.");
            /*
             * This line does two things:
				Creates an Instance: 
				It creates an instance of UserDefinedException with the message you provided.
				Throws the Exception: 
				It throws that instance, which can then be caught in the catch block in your main method.*/
            
            
        } else {
            System.out.println("Eligible to vote.");
        }
    }

    // Main method
    public static void main(String[] args) {
        try {
            checkEligibility(16);  // This will throw the custom exception
        } catch (AgeNotEligibleException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        // Testing with a valid age
        try {
            checkEligibility(10);  // This will not throw an exception
        } catch (AgeNotEligibleException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
