//		Write prog for int type and use operators with 2-D array data.	 
package com;

public class ArrayPracatice2 {

	public static void main(String[] args) {
		int[][] array = new int[2][3];
		array[0][0] = 0;
		array[0][1] = 1;
		array[0][2] = 2;
		array[1][0] = 1;
		array[1][1] = 2;
		array[1][2] = 3;

		System.out.println("Addition: " + (array[0][0] + array[0][1] + array[0][2] + array[1][0] + array[1][1] + array[1][2]));
		System.out.println("Subtraction: " + (array[0][0] - array[0][1] - array[0][2] - array[1][0] - array[1][1] - array[1][2]));
		System.out.println("Multiplication: " + (array[0][0] * array[0][1] * array[0][2] * array[1][0] * array[1][1] * array[1][2]));
		System.out.println("Division: " + (array[0][0] / array[0][1] / array[0][2] / array[1][0] / array[1][1] / array[1][2]));
		System.out.println("Modulo: " + (array[0][0] % array[0][1] % array[0][2] % array[1][0] % array[1][1] % array[1][2]));


	}
}
