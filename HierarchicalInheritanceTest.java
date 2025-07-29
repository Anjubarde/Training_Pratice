package com.inheritance;
class Fruit{
	public void taste() {
		System.out.println("sweet");
	}
}
class Banana extends Fruit{
	public void color() {
		System.out.println("yellow");
	}
}
class Apple extends Fruit{
	public void price() {
		System.out.println("500rs per kg");
	}
}
public class HierarchicalInheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banana b=new Banana();
		b.taste();
		b.color();
		
		Apple a=new Apple();
		a.price();
		a.taste();
	}

}
