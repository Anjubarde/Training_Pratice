package com.string.demo;

public class StringCreationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//by literal
		String s1="abc";
		
		//by new keyword
		String s2=new String("jiya");
		
		String s3=new String(s1);
		
		//by char array
		char ch[]= {'a','b','c'};
		String s4=new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
