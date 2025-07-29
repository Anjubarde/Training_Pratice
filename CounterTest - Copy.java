package com.statickeyword;
class Counter{
	
	int a=1;
	static int b=1;
	
	public Counter() {
		a++;
		b++;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}
public class CounterTest {

	public static void main(String[] args) {
		Counter c1=new Counter();
		Counter c2=new Counter();
		Counter c3=new Counter();

	}

}
