package com.polymorphism;

class Cal{

	public void add(int a,int b) {
		System.out.println("addition of two int:"+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("addition of three int:"+(a+b+c));
	}
	public void add(float x,float y) {
		System.out.println("addition of float :"+(x+y));
	}
	
	public double add(double d, double e) {
		return d+e;
	}
	
	private void add(int a,int b,float c) {
		
	}
	
}
public class Demo_method_Overloading {

	public static void main(String[] args) {
		Cal c1=new Cal();
		c1.add(10, 20);
		

	}

}
