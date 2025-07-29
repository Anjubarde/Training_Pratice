package com.abstraction;

import java.io.Serializable;

//interface which have only one abstract method
@FunctionalInterface
interface Showable{
	
	void show();
	private void m1() {}
	
}
//marker-empty interface
class Student implements Serializable{
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
