package com.onedim.array;

public class OneDimArrayTest2 {

	public static void main(String[] args) {
		int num[]=new int[5];

		//how to assign value to array elements
		num[0]=78;
		num[1]=85;
		num[2]=63;
		
		System.out.println("----array elements-----");
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		
		System.out.println("----for loop-----");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		System.out.println("---array in reverse order----");
		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
		System.out.println("----foreach loop----");
		//array or collection
		//for(datatype var:arr|collection){sopln(var)}
		//forward direction 
		//we can not update data 
		for(int a:num) {
			System.out.println(a);
		}
	}

}
