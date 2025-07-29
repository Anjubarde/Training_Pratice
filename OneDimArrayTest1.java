package com.onedim.array;

public class OneDimArrayTest1 {

	public static void main(String[] a) {
		
		int num[]=new int[5];
		String[] names=new String[5];
		
		System.out.println(num.length);
		System.out.println(names.length);
		
		int len=num.length;
		System.out.println("length:"+len);
		
		//static array
		double [] avgs= {35.66,67.89,89.8};
		System.out.println(avgs.length);
		//avgs[3]=56.36;//not possible ,throw exception
	}

}
