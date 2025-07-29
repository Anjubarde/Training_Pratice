package com.list;

import java.util.*;

public class StudentArrayList {

	//find student from list
	
	static Student findStudent(List<Student> list,String name) {
		Student stu=null;
		for(Student s:list) {
			if(s.getName().equals(name)) {
				stu=s;
			}
		}
		return stu;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> slist=new ArrayList<Student>();
		slist.add(new Student(1,"narayan",89));
		slist.add(new Student(2,"kavita",56));
		Student s1=new Student(3,"pooja",78);
		slist.add(s1);
		
		System.out.println("----student list-----");
		for(Student s:slist) {
			//System.out.println(s.getSid()+"|"+s.getName()+"|"+s.getMarks());
			System.out.println(s);
		}
		findStudent(slist, "pooa");
		
	}

}
