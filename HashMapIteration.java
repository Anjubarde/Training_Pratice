package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap=new HashMap<Integer,String>();
		hmap.put(7852, "nikita");
		hmap.put(20235,"rahul");
		hmap.put(3445, "jiya");
		hmap.put(20235,"om");
		hmap.put(9896,"om");
		// 1. Using entrySet() – to get key and value both
		for(Map.Entry<Integer, String>h:hmap.entrySet()) {
			System.out.println(h.getKey()+"|"+h.getValue());
		}
		
		for(Integer i:hmap.keySet()) {
			System.out.println(i+"|"+hmap.get(i));
		}
		
		//only values
		for(String s:hmap.values()) {
			System.out.println(s);
		}
	}

}
