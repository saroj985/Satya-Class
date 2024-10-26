package com.classExample;

public class DiamondShape {

	public static void main(String[] args) {
		for (int i = 0; i < 7; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 7; k++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}

}
