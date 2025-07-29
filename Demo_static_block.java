package com.statickeyword;
class Demo1{
	static {
		System.out.println("Demo d1");
	}
	public static void method1() {
		System.out.println("method1");
	}
}
public class Demo_static_block {

	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--main method--");
		Demo1.method1();
	}

}
