package com.string.demo;

import java.util.Arrays;

public class StringMethodsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="hello world";
		String s3=" ";
		String s4=" rose is red ";
		char ch[]= {'h','e','l','l','a'};
		System.out.println(s1.startsWith("h"));
		System.out.println(s1.endsWith("t"));
		
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		
		System.out.println(s1.join("-", s1,s2));
		System.out.println(s4.length());
		s4=s4.trim();
		System.out.println(s4.length());
		
		
		System.out.println(s2.contains(s1));
		
		System.out.println(s1.getClass());
		//int a=10;
		Integer a=10;
		System.out.println(a.getClass());
		String s6=String.valueOf("123");
		System.out.println(s6);
		System.out.println(s6.getClass());
		
		String arr[]=s4.split(" ");//returns string array
		System.out.println(Arrays.toString(arr));
	}

}
