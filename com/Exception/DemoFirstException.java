package com.Exception;


import java.io.File;
import java.io.FileInputStream;

public class DemoFirstException {

	public static void main(String[] args) {
		int a =10 ;
		int b=(int) (Math.random()*5);
		System.out.println("Random number is :- "+b);
		int d = a/b;
		System.out.println("End of main method");
		String str=null;
		show(str);
//		
//		File file = new File("C:/test");
//		FileInputStream fis = new FileInputStream(file);

	}
	
	public static void show(String str) {
		System.out.println("length  of string :- "+str.length());
	}

}
