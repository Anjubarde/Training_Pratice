package com.statickeyword;

class MyClass{
	static int a=10;
}
public class Demp_static_variables {

	int id=101; //instance variable
	static String name="TQ";
	
	public void show() {
		System.out.println(id);
		System.out.println(name);
	}
	
	//static methods only accept static variables
	public static void Display() {
		//System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args) {
		

		Demp_static_variables  d1=new Demp_static_variables();
		System.out.println(d1.id);
		
		System.out.println(name);
		System.out.println(MyClass.a);
	}

}
