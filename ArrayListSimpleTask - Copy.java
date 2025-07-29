package com.list;

import java.util.*;

public class ArrayListSimpleTask {

	public static boolean FindName(List<String>list,String n) {
		return list.contains(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>(); //default capacity 10
		
		names.add("narayan");
		names.add("pooja");
		names.add("rahul");
		names.add("jiya");
		names.add("pooja");
		
		//find element in arraylist
		String n="nikita";
		System.out.println(names.indexOf("nikita"));
//		
//		boolean flag=false;
//		for(String s:names) {
//			if(s.equals(n)) {
//				System.out.println(s);
//				flag=true;
//			}
//		}
		
		System.out.println(names.contains(n));
		boolean status=FindName(names, "pooja");
	}

}
