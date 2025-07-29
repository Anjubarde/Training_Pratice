package com.arrayofobject.containment;

public class StudentCourseTest {

	//find no of students in each course
	
	//find student same who is learning java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student []sarr=new Student[5];
		Course c1=new Course(1,"java");
		Course c2=new Course(2,"c#");
		
		sarr[0]=new Student(101,"radha",25,c1);
		sarr[1]=new Student(102,"hinal",33,c1);
		sarr[2]=new Student(103,"rahul",45,c2);
		sarr[3]=new Student(104,"yash",56,new Course(3,"html"));
		sarr[4]=new Student(105,"navin",56,c1);
		
		for(int i=0;i<sarr.length;i++) {
			System.out.println(sarr[i]);
		}
		
	}

}
