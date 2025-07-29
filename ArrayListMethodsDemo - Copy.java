package com.list;

import java.util.*;
import java.util.Arrays;

public class ArrayListMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names=new ArrayList<String>(); //default capacity 10
		//ArrayList<String> names=new ArrayList<String>(20); //cap 20
		//new cap= (1.5*old cap)+1
		System.out.println(names.isEmpty());
		names.add("narayan");
		names.add("pooja");
		names.add("rahul");
		names.add("jiya");
		names.add("pooja");
		
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("kavita");
		names1.add("deva");
		System.out.println(names);
		names.set(0, "jivan");
		names.add(0, "isha");
		System.out.println(names);
		
		System.out.println(names.isEmpty());
		System.out.println(names.contains("jiya"));
		System.out.println(names.contains("ram"));
		
		names.addAll(names1);
		System.out.println("---add all---");
		System.out.println(names);
		
		System.out.println(names.containsAll(names1));
		System.out.println(names1.contains(names));
		
		System.out.println(names.remove(0));
		System.out.println(names);
		System.out.println(names.remove("pooja"));
		System.out.println(names);
		System.out.println(names.indexOf("jivan"));
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		names.clear();
		
		//list to array
		Object sarr[]=names.toArray();
		//array to list
		String colors[]= {"red","blue","green"};
		List<String>colorlist=Arrays.asList(colors);
		
	}

}
