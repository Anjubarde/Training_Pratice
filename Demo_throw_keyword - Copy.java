package com.exception.demo;

public class Demo_throw_keyword {

	// throw keyword- throwing exception explicitly
	// The throw keyword is used to manually throw an exception (either built-in or
	// custom) in Java.

	//It is used when you want to raise an exception explicitly based on a specific condition in your code.

	//syntax 
	//throw new ExceptionClassname("Error message");
	public void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("age should be greater than 18");
		} else {
			System.out.println("welcome to TQ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 8;
		Demo_throw_keyword d = new Demo_throw_keyword();
		try {
			d.checkAge(age);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("thank you");
		System.out.println("bye");
	}

}
