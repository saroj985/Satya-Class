//Input: nums = [1, 2, 3, 4, 5], target = 9
//Output: [0, 2, 3]
//Explanation: 1 + 3 + 4 = 9
package com;

public class ThreeSum {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5 };
		int target = 9;

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				for (int k = j + 1; k < num.length; k++) {
					if (num[i] + num[j] + num[k] == target) {
						System.out.println("[ " + i + ", " + j + ", " + k + " ]");
						return;
					}
				}
			}
		}
	}
}
