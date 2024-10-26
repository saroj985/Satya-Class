
package com.Exception;

public class ThrowsInOverloading {

    public static void calculate(int a) throws NegativeNumberException {
        checkNegative(a);
        System.out.println("The sum is: " + (a + 10));
    }

    public static void calculate(int a, int b) throws NegativeNumberException {
        checkNegative(a, b);
        System.out.println("The sum is: " + (a + b));
    }

    public static void calculate(int a, int b, int c) throws NegativeNumberException {
        checkNegative(a, b, c);
        System.out.println("The sum is: " + (a + b + c));
    }

    public static void checkNegative(int a) throws NegativeNumberException {
        if (a < 0) {
            throw new NegativeNumberException();
        }
    }

    public static void checkNegative(int a, int b) throws NegativeNumberException {
        if (a < 0 || b < 0) {
            throw new NegativeNumberException();
        }
    }

    public static void checkNegative(int a, int b, int c) throws NegativeNumberException {
        if (a < 0 || b < 0 || c < 0) {
            throw new NegativeNumberException();
        }
    }

    public static void main(String[] args) {
        try {
            calculate(1);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }

        try {
            calculate(-1, 12);
        } catch (NegativeNumberException e) {
            System.out.println( e.getMessage());
        }

        try {
            calculate(1, -1, 10);
        } catch (NegativeNumberException e) {
            System.out.println( e.getMessage());
        }
    }
}