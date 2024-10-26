package com.classExample;

public class MultiplicationTable {

	public static void main(String[] args) {
//		for (int i = 0; i <= 10; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//
//		}
		
		table();

	}
	
	public static void table () {
		for (int i = 1; i <=10; i++) {
			for (int j = 1; j <=10; j++) {
				System.out.println(i + " * " + j + " = " +i *j);
			}
			System.out.println();
		}
	}

}
