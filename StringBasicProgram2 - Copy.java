package com.string.demo;

public class StringBasicProgram2 {

	static void findSpace(String s) {
		int i,len=s.length();
		int count=0;
		char ch;
		for(i=0;i<len;i++) {
			ch=s.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println("Count:"+count);
	}
	//find no of char present in string without using length method
	static void findNoOfChar(String s) {
		char ch[]=s.toCharArray();
		int count=0;
		for(char c:ch) {
			count++;
		}
		System.out.println("Count:"+count);
	}
	
	static String findReverseString(String s) {
		int i,len=s.length();
		String revstr="";
		for(i=len-1;i>=0;i--) {
			revstr=revstr+s.charAt(i);
		}
		return revstr;
	}
//	static void isPalindrome(String s) {
//		int i,len=s.length();
//		String revstr="";
//		for(i=len-1;i>=0;i--) {
//			revstr=revstr+s.charAt(i);
//		}
//		if(revstr.equals(s)) {
//			System.out.println(s+" is palindrome");
//		}
//		else {
//			System.out.println(s+" is not palindrome");
//		}
//	}
	static void isPalindrome(String s) {
		int i,len=s.length();
		String revstr=findReverseString(s);
		
		if(revstr.equals(s)) {
			System.out.println(s+" is palindrome");
		}
		else {
			System.out.println(s+" is not palindrome");
		}
	}
	public static void main(String[] args) {
		
		String str1="rose is red";
		findSpace(str1);
		
		//how to convert string in char array
		char ch[]=str1.toCharArray();
		for(char c:ch) {
			System.out.println(c);
		}
		findNoOfChar("java");
		String s=findReverseString("java");
		System.out.println(s);
		
		isPalindrome("java");
	}

}
