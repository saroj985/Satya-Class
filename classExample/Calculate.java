package com.classExample;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        double num1, num2;
        double result = 0;

        Scanner s = new Scanner(System.in);
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
        } else {
            System.out.println("Not a valid operator");
        }
    }
}
