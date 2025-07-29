package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> lang = new ArrayList<>();
		lang.add("C++");
		lang.add("Html");
		lang.add("Java");
		lang.add("Python");

		Iterator<String>itr=lang.iterator();
		while(itr.hasNext()) {
			String s=itr.next();
			if(s.equals("Python")) {
				//lang.remove("Python");
				itr.remove();  
				
			}
			//System.out.println(s);
		}
		for(String s:lang) {
			if(s.equals("Python"))
				lang.remove("Python");
		}
	}

}
