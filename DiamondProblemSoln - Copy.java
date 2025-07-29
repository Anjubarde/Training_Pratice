package com.abstraction;
interface A{
	default void show() {
		System.out.println("Class A");
	}
}
interface B extends A{
	default void show() {
		System.out.println("interface B");
	}
}
interface C extends A{
	default void show() {
		System.out.println("interface C");
	}
}
class D implements B,C{
	public void show() {
		B.super.show();
		C.super.show();
	}
}
public class DiamondProblemSoln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D d1=new D();
		d1.show();
	}

}
