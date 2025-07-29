package com.demo.encapsulation;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1, "parag");
		
		s1.show();
		s1.setSname("rohan");
		System.out.println(s1.getSid());
		System.out.println(s1.getSname());
	}

}
