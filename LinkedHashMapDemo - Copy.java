package com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> hmap=new LinkedHashMap<Integer,String>();
		hmap.put(7852, "nikita");
		hmap.put(20235,"rahul");
		hmap.put(null,"shaym");
		hmap.put(3445, "jiya");
		hmap.put(20235,"om");
		hmap.put(9896,"om");
		hmap.put(1,"om");
		
		for(Map.Entry<Integer, String>h:hmap.entrySet()) {
			System.out.println(h.getKey()+"|"+h.getValue());
		}
	}

}
