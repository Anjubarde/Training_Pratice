package com.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//duplicates are not allowed
		//not following insertion order
		HashSet<String>names=new HashSet<String>();
		names.add("nikita");
		names.add("rahul");
		names.add("krishna");
		names.add("rahul");
		names.add("ram");
		names.add("isha");
		names.add(null);
		names.add(null);
		
		for(String n:names) {
			System.out.println(n);
		}
	}

}
