package com.Exception;

// Custom exception class
public class AgeNotEligibleException extends Exception {
    public AgeNotEligibleException(String message) {
        super(message);  // Call the parent constructor with the error message
    }
}
