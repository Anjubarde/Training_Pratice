package com.onedim.array;

import java.util.Scanner;

public class OneDimArrayTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]=new String[10];
		int len=names.length,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("How many elements you want to add in array:?");
		int n=sc.nextInt();
		
		for(i=0;i<n;i++) {
			System.out.println("Enter name:");
		}
		
//		if(len>n) {
//			for(i=0;i<n;i++) {
//				System.out.println("Enter name:");
//				names[i]=sc.next();
//			}
//		}
//		else {
//			System.out.println("please check array length");
//		}
		System.out.println("-----String array-----");
		for(String s:names) {
			System.out.println(s);
		}
	}

}
