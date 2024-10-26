package com.classExample;

public class NumberPrime {
	public static void main(String[] args) {
        int number = 29;  

        if (isPrime(number)) {
            System.out.println(number + " = prime number.");
        } else {
            System.out.println(number + " = not prime number.");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
