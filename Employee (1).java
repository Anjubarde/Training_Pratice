package com.list;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

	int eid;
	String ename;
	double esal;
	
	public Employee(int eid,String ename,double esal) {
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + "]";
	}

	@Override
	public int compareTo(Employee o) {
		int i=this.getEname().compareTo(o.getEname());
		if(i==0) {
			return 0;
			
		}
		else if(i<0) {
			return -1;
		}
		else {
			return 1;
		}
		
	}	
	
}

class SalCompare implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEsal()==o2.getEsal()) {
			return 0;
		}
		else if(o1.getEsal()<o2.getEsal()) {
			return -1;
		}
		else {
			return 1;
		}
		
	}
	
}
//class SalCompare implements Comparator<Employee>{
//
//	@Override
//	public int compare(Employee o1, Employee o2) {
//		// TODO Auto-generated method stub
//		if(o1.getEsal()==o2.getEsal()) {
//			return 0;
//		}
//		else if(o1.getEsal()<o2.getEsal()) {
//			return -1;
//		}
//		else {
//			return 1;
//		}
//		
//	}
//	
//}
