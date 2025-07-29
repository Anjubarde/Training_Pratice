package com.statickeyword;

class Student{
	//instance variables have copy per object
	private int sid;
	private String sname;
	private static String collegename="TQ";
	//static variables have copy per class
	//class variables
	
	public Student(int sid,String sname) {
		this.sid=sid;
		this.sname=sname;
		
	}
	public static void changeCollegename(String cname) {
		collegename=cname;
	}
	public void show() {
		System.out.println("Student Id:"+sid);
		System.out.println("Student Name:"+sname);
		System.out.println("Student College Name:"+collegename);
	}
}
public class Demo_static_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"neha");
		Student s2=new Student(2,"raj");
		Student s3=new Student(3,"shyam");
		s1.show();
		s2.show();
		s3.show();
		Student.changeCollegename("KC");
		Student s4=new Student(4,"ram");
		Student s5=new Student(5,"isha");
		s4.show();
		s5.show();
	}

}
