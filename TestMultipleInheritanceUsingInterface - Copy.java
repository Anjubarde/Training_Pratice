package com.abstraction;
interface AddMe{
	int add(int a,int b);
}
interface SubMe{
	int sub(int a,int b);
}
//multiple inheritance
class Cal implements AddMe,SubMe{
	public int add(int a,int b) {
		return a+b;
	}
	public int sub(int a,int b) {
		return a-b;
	}
}
public class TestMultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal c1=new Cal();
		int addition=c1.add(10, 20);
		int subtraction=c1.sub(20, 3);
		
		System.out.println("Add:"+addition);
		System.out.println("sub:"+subtraction);
		
	}

}
