package com.abstraction;
//interface ->implements
//interface is contract between producer and consumer
//eg Movable  ,it can be car also it can be chair also ,so here no hierarchy is present
//interface variables are by default public static final,need to assign it
//methods are by default public abstract
//from java 8 it also supports static method,private method ,default method
interface Shape{
	//by default public static final
	int a=10; //public static final int a=10
	int b=20;
	
	//by default public abstract
	void show(); //public abstract void show();
	//java 9
	private void print() {
		
	}
	default void m1() {
		
	}
	static void m3() {}
}
class Rect implements Shape{
	public void show() {
		System.out.println("show method");
	}
}
public class Test_interface {

	final int b=10;
	final static int c=30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int a;
		Rect r1=new Rect();
		r1.show();
	}

}
