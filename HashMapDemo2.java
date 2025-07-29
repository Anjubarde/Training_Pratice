package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap=new HashMap<Integer,String>();
		hmap.put(1, "nikita");
		hmap.put(2,"rahul");
		hmap.put(null,"shaym");
		hmap.put(4, "jiya");
		hmap.put(5,"om");
		hmap.put(2,"om");
		
		for(Map.Entry<Integer, String>h:hmap.entrySet()) {
			System.out.println(h.getKey()+"|"+h.getValue());
		}
		
		
	}

}
