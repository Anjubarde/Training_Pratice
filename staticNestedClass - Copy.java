package com.nestedclass;

class staticOuterClass{
	int a=10;
	static int b=20;
	static class Inner{
		void show() {
			System.out.println("static inner class:"+new staticOuterClass().a);
			System.out.println("static inner class:"+b);
		}
		static void m1() {
			System.out.println("static method");
		}
	}
}
public class staticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticOuterClass.Inner s=new staticOuterClass.Inner();
		s.show();
		staticOuterClass.Inner.m1();
	}

}
