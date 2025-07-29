package com.map;

import java.util.*;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> map=new LinkedHashMap<Integer, String>();
		map.put(105, "pooja");
		map.put(108, "leena");
		map.put(125, "kavita");
		map.put(563,"om");
		
		for(Map.Entry<Integer,String> m:map.entrySet()) {
			System.out.println(m.getKey()+"|"+m.getValue());
		}
	}

}
