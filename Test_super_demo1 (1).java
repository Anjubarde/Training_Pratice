package com.inheritance;
class Flower{
	String color="red";
	public void display() {
		System.out.println("Parent display method");
	}
}
class Rose extends Flower{
	
	String color="yellow";
	
	public void show() {
		System.out.println("Child Color:"+color);
		System.out.println("Parent Color:"+super.color);
	}
	
	public void display() {
		System.out.println("child display method");
		super.display();
	}
}
public class Test_super_demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rose r=new Rose();
		r.show();
		r.display();
	}

}
