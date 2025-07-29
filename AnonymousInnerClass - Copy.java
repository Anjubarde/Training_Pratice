package com.nestedclass;
abstract class Shape{
	
	abstract void area();
}

interface Drawable{
	void draw();
}
//class rect extends Shape implements Drawable{
//	void area() { 
//		System.out.println("rect child class");
//	}
//	
//	public void draw() {
//		System.out.println("draw method");
//	}
//}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape shpe=new Shape();
		
		//Shape sh=new rect();
		
		Shape rect=new Shape() {
			public void area() {
				System.out.println("shape is rectangle");
			}
		};
		
		Shape circle=new Shape() {
			public void area() {
				System.out.println("shape is circle");
			}
		};
		rect.area();
		circle.area();
	}

}
