package com.demo.encapsulation;

public class Student {

	private int sid;
	private String sname;
	
	public Student(int sid,String sname) {
		this.sid=sid;
		this.sname=sname;
	}
	//setters
	//syntax
	//public void setVariable(datatype variable){this.variable=variable}
	
	public void setSid(int sid) {
		this.sid=sid;
	}
	
	public void setSname(String sname) {
		this.sname=sname;
	}
	
	//getters 
	//syntax
	//public returntype getVariable(){return variablename;}
	
	public int getSid() {
		return sid;
	}
	
	public String getSname() {
		return sname;
	}
	public void show() {
		System.out.println("Student Id:"+sid);
		System.out.println("Student Name:"+sname);
	}
}
