package com.containment;

public class ContainmentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case 2
		Address a1=new Address();
		Person p1=new Person(a1);
		p1.Display();
		
		
		//case 3
		Address a2=new Address();
		Person p2=new Person();
		p2.setAdd(a2);
		p2.Display();
	}

}
