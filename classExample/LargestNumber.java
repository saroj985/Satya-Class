package com.classExample;

public class LargestNumber {

	public static void main(String[] args) {
		int []arr = {1, 2, 3};
		int largeNum = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > largeNum) {
				largeNum = arr[i];
			}
		}
		System.out.println(largeNum);
	}
}
