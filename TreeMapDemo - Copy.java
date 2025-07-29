package com.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer>map=new TreeMap<String, Integer>();
		map.put("html", 102);
		map.put("css", 103);
		map.put("java", 105);
		map.put("python", 103);
		map.put("java", 111);
		//map.put(null, 85);
		//in TreeMap null keys are not allowed
		for(Map.Entry<String, Integer>m:map.entrySet()) {
			System.out.println(m.getKey()+"|"+m.getValue());
		}
	}

}
