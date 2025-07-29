package com.inheritance;
class Granny{
	public void eat() {
		System.out.println("Grand-Parent");
	}
}
class Mother extends Granny{
	public void write() {
		System.out.println("Mother-class");
	}
}
class Children extends Mother{
	public void play() {
		System.out.println("Childern-class");
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Children c=new Children();
		c.eat();
		c.write();
		c.play();
	}

}
