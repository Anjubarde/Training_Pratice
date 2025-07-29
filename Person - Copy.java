package com.containment;

public class Person {

	//case 1
	//Address add=new Address();
	
	
	Address add;
	Person(){
		
	}
	
	//case2
	Person(Address add){
		this.add=add;
	}
	
	
	//case 3 
	public void setAdd(Address add) {
		this.add=add;
	}
	public Address getAdd() {
		return add;
	}
	public void Display() {
		add.show();
		System.out.println("Person show");
	}
}
