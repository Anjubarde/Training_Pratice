package com.nestedclass;
class Outer1{
	private int a=10;
	
	void show() {
		class Inner{
			int b=20;
			void m1() {
				System.out.println("a:"+a);
				System.out.println("b:"+b);
			}
		}//inner class
		
		//new Inner().m1();
		Inner inn=new Inner();
		inn.m1();
		
		class MyInner{
			
		}
	}//show method
	
	void display() {
		class Inner{
			
		}
	}
}
public class LocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1 out=new Outer1();
		out.show();
	}

}
