package com.exception.demo;

public class Demo_nested_try_catch {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int arr[]=new int[5];
		String s=null;
		try {
			System.out.println(a/b);
			try {
				System.out.println(a/b);
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println(arr[7]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}
			try {
				System.out.println(s.length());
			}
			catch(NullPointerException e) {
				System.out.println(e.getMessage());
			}
			
		}
		catch(Exception e) {
			System.out.println("main catch");
		}
	}

}
