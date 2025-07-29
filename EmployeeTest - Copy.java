package com.list;
import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee>elist=new ArrayList<Employee>();
		elist.add(new Employee(101,"neha",86000));
		elist.add(new Employee(102,"raj",16000));
		elist.add(new Employee(103,"amit",56000));
		
		System.out.println("---employee list----");
		for(Employee e:elist) {
			System.out.println(e);
		}
		Collections.sort(elist);
		System.out.println("---employee list after sorting----");
		for(Employee e:elist) {
			System.out.println(e);
		}
		//task -sort by salary
		Collections.sort(elist,new SalCompare());
		System.out.println("---employee list after sorting----");
		for(Employee e:elist) {
			System.out.println(e);
		}
	}	

}
