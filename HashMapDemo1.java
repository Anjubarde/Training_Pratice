package com.map;
import java.util.*;
public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		HashMap map=new HashMap();
//		map.put("nikita",102);
//		map.put(103,"jiya");
//		map.put('c', 78.96);
		//it does not follow insertion order
		//keys are unique and values are repeated
		HashMap<Integer, String> hmap=new HashMap<Integer,String>();
		hmap.put(7852, "nikita");
		hmap.put(20235,"rahul");
		hmap.put(null,"shaym");
		hmap.put(3445, "jiya");
		hmap.put(20235,"om");
		hmap.put(9896,"om");
		hmap.put(1,"om");
		System.out.println(hmap);
		System.out.println(hmap.size());
		System.out.println(hmap.get(9896));//get(key)
		System.out.println("---keys----");
		System.out.println(hmap.keySet());
		System.out.println("----values----");
		System.out.println(hmap.values());
		System.out.println("----entries-----");
		System.out.println(hmap.entrySet());
		System.out.println("--is key present---");
		System.out.println(hmap.containsKey(859));
		System.out.println(hmap.containsValue("jiya"));
		//hmap.clear();
		//hmap.isEmpty();
		System.out.println(hmap.getOrDefault(9896, "anydefaultvalue"));
	}

}
