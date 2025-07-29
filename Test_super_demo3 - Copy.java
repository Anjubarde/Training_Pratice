package com.inheritance;
class Person{
	String name;
	int age;
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void show() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}

class Student extends Person{
	double marks;
	public Student(String name,int age,double marks) {
		super(name,age);
		this.marks=marks;
	}
	
	public void show() {
		super.show();
		System.out.println("Marks:"+marks);
	}
}
public class Test_super_demo3 {

	public static void main(String[] args) {
		Student s1 =new Student("pooja",10,56);
		s1.show();

	}

}
