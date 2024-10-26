package com.classExample;
public class StarNStripes {
    public static void main(String[] args) {
        // Print the top part with stars and stripes
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 35; j++) {
                if (j < 10) {
                    System.out.print("*");
                } else {
                    System.out.print("=");
                }
            }
            System.out.println();
        }
        
        // Print the stripes only (bottom part)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 35; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
        System.out.println("          US Flag");
    }
}
