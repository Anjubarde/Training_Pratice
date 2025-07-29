package com.string.demo;

public class StringBasicProgram {

	static void Pattern1(String s) {
		int i,len=s.length();
		int indexspace=s.indexOf(' ');
		int indexlastspace=s.lastIndexOf(' ');
		System.out.println(s.charAt(0)+"."+s.charAt(indexspace+1)+"."+s.charAt(indexlastspace+1)+".");
		
	}
	static void Pattern2(String s) {
		int i,len=s.length();
		int indexspace=s.indexOf(' ');
		int indexlastspace=s.lastIndexOf(' ');
		System.out.println(s.charAt(0)+"."+s.charAt(indexspace+1)+"."+s.substring(indexlastspace+1));
		
	}
	static void Pattern3(String s) {
		int i,len=s.length();
		int indexspace=s.indexOf(' ');
		int indexlastspace=s.lastIndexOf(' ');
		System.out.println(s.substring(indexlastspace+1)+" "+s.substring(0,indexlastspace));
		
	}
	static void Pattern4(String s) {
		int i;
		for(i=0;i<s.length();i++) {
			System.out.println(s.substring(0,i+1));
		}
	}
	public static void main(String[] args) {
		
		String str1="Sachin Ramesh Tendulkar";
		Pattern1(str1);
		Pattern2(str1);
		Pattern3(str1);
		
		String str2="java";
		Pattern4(str2);
	}

}
