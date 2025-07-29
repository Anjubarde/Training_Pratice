package com.map;
import java.util.*;
public class CustomMap {

	public static void findEmployees(Map<Employee,String>map,String dept) {
		for(Map.Entry<Employee,String>m:map.entrySet()) {
			if(m.getValue().equalsIgnoreCase(dept)) {
				System.out.println(m.getKey());
			}
		}
	}
	public static List<Employee> findEmployeesAddinList(Map<Employee,String>map,String dept) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		for(Map.Entry<Employee,String>m:map.entrySet()) {
			if(m.getValue().equalsIgnoreCase(dept)) {
				list.add(m.getKey());
			}
		}
		return list;
	}
	//map from map - create new map for existing map
	//deptname and no of working employee in it
	
	static void NewMap(Map<Employee,String>map) {
		HashMap<String, Integer> newmap=new HashMap<String, Integer>();
		
		for(Map.Entry<Employee,String>m:map.entrySet()) {
			String deptname=m.getValue();
			if(newmap.containsKey(deptname)){
				int value=newmap.get(deptname);
				newmap.put(deptname, ++value);
			}
			else {
				newmap.put(deptname, 1);
			}
		}
		
		System.out.println("-----new map-----");
		System.out.println(newmap);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Employee,String> hmap=new HashMap<Employee, String>();
		hmap.put(new Employee(101,"jiya",25000), "IT");
		hmap.put(new Employee(102,"amol",35000), "SALES");
		hmap.put(new Employee(103,"kavita",55000), "IT");
		hmap.put(new Employee(104,"ram",15000), "HR");
		hmap.put(new Employee(107,"sakshi",75000), "IT");
		hmap.put(new Employee(108,"rahul",35000), "HR");
		for(Map.Entry<Employee,String>m:hmap.entrySet()) {
			System.out.println(m.getKey()+" |"+m.getValue());
		}
		
		String dept="IT";
		System.out.println("----employees working in "+dept+"----");
		findEmployees(hmap, dept);
		
		System.out.println("===list===");
		List<Employee>elist=findEmployeesAddinList(hmap, "sales");
		System.out.println(elist);
		
		System.out.println("----------------");
		NewMap(hmap);
	}

}
