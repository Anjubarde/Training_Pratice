package com.exception.demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("1");
		System.out.println("2");
		
		int a=10;
		int b=0;
		System.out.println("3");	
		try {
			int div=a/b;
			System.out.println("div:"+div);
		}
		catch(ArithmeticException e) {
			//System.out.println("error");
			//System.out.println(e.getMessage());//exception msg
			//System.out.println(e);
			e.printStackTrace();
		}
		
		
		System.out.println("4");
		System.out.println("5");
	}
}


