package com.inheritance;
class Vehicle{
	String c_name;
	double price;
	public Vehicle() {
		System.out.println("Parent-Vehicle");
	}
	
	public Vehicle(String c_name,double price) {
		this.c_name=c_name;
		this.price=price;
	}
}

class Car extends Vehicle{
	int noofdoors;
	public Car(){
		super();
		System.out.println("Child-Car");
	}
	
	public Car(String c_name,double price,int noofdoor) {
		super(c_name,price);
		this.noofdoors=noofdoor;
	}
}
public class Test_super_demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
	}

}
