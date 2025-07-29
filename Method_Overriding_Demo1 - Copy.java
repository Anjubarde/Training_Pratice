package com.inheritance;
//method overriding -same method name and same parameters from parent to child
//parent->child

//Rule 1
//method signature should be same

//Rule 2
//child method can have same access modifier or in higher order
//public protected default private
//note: private method can not be override

//parent -public
//child  -public 

//parent - protected
//child  -protected ,public

//parent - default
//child  - default,protected ,public

//Rule 3 -return type
//case 1
//parent -void
//child - void

//case 2
//parent- primitive
//child -primitive

//case 3
//parent ->non-primitive
//child -> same or co-varient
class Mobile{
	public Number call(String contact) {
		System.out.println("calling from parent");
		return 0;
	}
}
class Android extends Mobile{
	@Override
	public Integer call(String contact) {
		
		System.out.println("calling from android");
		return 0;
	}
}
public class Method_Overriding_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
