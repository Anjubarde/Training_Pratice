package com.wrapperclass;

public class WrapperClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		Integer obj=a;  //autoboxing
		
		System.out.println("a:"+a);
		System.out.println("obj:"+obj);
		
		
		Integer num=123;
		//int b=Integer.valueOf(num);   //unboxing
		int b=num;
		
		System.out.println("num:"+num);
		System.out.println("b:"+b);
		
	}

}
