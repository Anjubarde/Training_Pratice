package com.abstraction;
//interface ->implements
interface Shape{
	//by default public static final
	int a=10; //public static final int a=10
	//by default public abstract
	void show(); //public abstract void show();
}
class Rect implements Shape{
	public void show() {
		System.out.println("show method");
	}
}
public class Test_interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1=new Rect();
		r1.show();
	}

}
