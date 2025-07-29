package com.map;
import java.util.*;
public class CustomMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee,String> hmap=new HashMap<Employee, String>();
		hmap.put(new Employee(101,"jiya",25000), "IT");
		hmap.put(new Employee(102,"amol",35000), "SALES");
		hmap.put(new Employee(103,"kavita",55000), "IT");
		hmap.put(new Employee(104,"ram",15000), "HR");
		
		for(Map.Entry<Employee,String>m:hmap.entrySet()) {
			System.out.println(m.getKey()+" |"+m.getValue());
		}
	}

}
