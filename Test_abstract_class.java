package com.abstraction;
//abstraction - hiding implementation details and showing funly
//define object -(class -variable /methods)


//abstract class
//class followed by abstract keyword
//if any class is having single abstract method ,that class must be declare as abstract class
//abstract method- method followed by abstract keyword is abstract method
//abstract method does not have body/implementation in same class
//abstract class having all terms same like non-abstract class,only diff is having abstract method
//and we can not instantiate abstract class(means we can not create its object)

//for giving implentation to abstract method we need child class

abstract class Mobile{
	public abstract void call();
}
class Oneplus extends Mobile{
	public void call() {
		System.out.println("oneplus call method");
	}
}
class Motorola extends Mobile{
	public void call() {
		System.out.println("motorola call method");
	}
}
public class Test_abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Mobile m1=new Mobile();  not possible
		//case 1
		Mobile m1=new Oneplus();
		m1.call();
		Mobile m2=new Motorola();
		m2.call();
		
		//case 2
		Mobile m3;
		
		m3=new Oneplus();
		m3.call();
		m3=new Motorola();
		m3.call();
	}

}
abstract class Vehicle{
	int a;
	static int b;
	final int c=20;
	Vehicle(){
		
	}
	public void applybreak() {
		
	}
	final void m1() {
		
	}
	static void m2() {
		
	}
}