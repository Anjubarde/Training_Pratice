package com.list;

import java.util.ArrayList;

public class BulkMethodsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> lang = new ArrayList<>();
		lang.add("C++");
		lang.add("Html");
		lang.add("Java");
		lang.add("Python");
		
		ArrayList<String> lang2 = new ArrayList<>();
		lang2.add("SQL");
		lang2.add("Python");
		lang2.add("Spring");
		lang2.add("Html");
		
		ArrayList<String>lang3=new ArrayList(lang2);
		
		System.out.println("lang:"+lang);
		System.out.println(lang2);
		System.out.println("lang3:"+lang3);
		
		//lang3.addAll(lang);
		System.out.println(lang3);
		//lang3.removeAll(lang);
		//System.out.println(lang3);
		lang3.retainAll(lang);
		System.out.println("retailall:"+lang3);
	}

}
