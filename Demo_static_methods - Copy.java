package com.statickeyword;

//static
//methods,variables,block,nested class
class Demo{
	public static void method1() {
		System.out.println("Demo class static method");
	}
}
public class Demo_static_methods {

	public static void Display() {
		System.out.println("this is static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display();// we do not require object to class static method
		
		Demo.method1();
		//if static method present in different class
		//then class by using Classname.methodname()
	}

}
