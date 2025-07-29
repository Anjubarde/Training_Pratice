package com.inheritance;
class Parent{
	String name="TQ";
	public void show() {
		System.out.println("Parent");
	}
}

class Child extends Parent{
	public void display() {
		System.out.println("child "+name);
	}
}
public class SingleInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		c.show();
		c.display();
	}

}
