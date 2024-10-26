package com.classExample;
public class DigitOccurrence {
    public static void main(String[] args) {
        int N = 121; int D = 1;  
           
        System.out.println("Digit " + D + " occurs " + digitCount(N,D) + " times in the number " + N);
    }

    public static int digitCount(int N, int D) {
        int count = 0;

        while (N > 0) {
            int digit = N % 10;  
            if (digit == D) {
                count++;  
            }
            N /= 10; 
        }

        return count;  
    }
}
