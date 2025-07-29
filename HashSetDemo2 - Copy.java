package com.set;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>names=new ArrayList<String>();
		names.add("nikita");
		names.add("pooja");
		names.add("raj");
		names.add("neha");
		names.add("om");
		names.add("raj");
		names.add("neha");
		
		HashSet<String> nm=new HashSet<String>(names);
		System.out.println(nm);
	}

}
