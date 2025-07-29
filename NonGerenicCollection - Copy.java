package com.list;

import java.util.ArrayList;

public class NonGerenicCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		
		list.add("nikita");
		list.add(12);
		list.add(12.56);
		list.add('a');
		list.add(56);
		System.out.println(list);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---for each----");
		for(Object o:list) {
			System.out.println(o);
		}
		
		//type casting 
		//it is not type safe
		String s=(String)list.get(0); //need to convert object into string
	}

}
