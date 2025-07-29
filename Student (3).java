package com.arrayofobject.containment;

public class Student {

	private int sid;
	private String sname;
	private double smarks;
	private Course course;
	
	public Student() {
		super();
	}

	public Student(int sid, String sname, double smarks, Course course) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSmarks() {
		return smarks;
	}

	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + ", course=" + course + "]";
	}
	
	
}
