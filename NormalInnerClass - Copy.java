package com.nestedclass;
class Outer{
	private int a=10;
	
	void show() {
		System.out.println("outer show method");
	}
	
	//Member Inner Class
	//Defined inside the class body, not static.
	//Can access all members (even private) of the outer class.
	class Inner{
		int b=20;
		void innerShow() {
			System.out.println("a:"+a);
			System.out.println("b:"+b);
		}
	}
}
public class NormalInnerClass {

	public static void main(String[] args) {
		//case 1
		new Outer().new Inner().innerShow();
		//case 2
		Outer.Inner ref=new Outer().new Inner();
		ref.innerShow();
		
		//case3
		Outer out=new Outer();
		out.new Inner().innerShow();
		//or
		Outer.Inner ref1=out.new Inner();
		ref1.innerShow();

	}

}
