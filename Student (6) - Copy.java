package com.list;

public class Student implements Comparable<Student>{

	private int sid;
	private String name;
	private double marks;
	public Student(int sid, String name, double marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.getSid()==o.getSid()) {
			return 0;
		}
		else if(this.getSid()<o.getSid()) {
			return -1;
		}
		else {
			return 1;
		}
	}
	
	
}
