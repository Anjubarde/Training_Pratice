package com.exception.demo;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]=new int[5];
		String s=null;
		try {
			//arr[7]=78;
			System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("always executes");
		}
		System.out.println("hello");
	}

}
