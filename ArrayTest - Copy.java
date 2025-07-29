package com.onedim.array;

import java.io.Serializable;
import java.util.Arrays;

public class ArrayTest {

	public static boolean isEven(int n) {
		return n%2==0;
	}
	public static void FindEvenNo(int[]a) {
		int i;
		int len=a.length;
		for(i=0;i<len;i++) {
			if(isEven(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
	public static void FindOddNo(int[]a) {
		int i;
		int len=a.length;
		for(i=0;i<len;i++) {
			if(!isEven(a[i])) {
				System.out.println(a[i]);
			}
		}
	}
	
	public static int findMaxNo(int[]a) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}
	
	public static int FindSecondMaxNo(int[]a) {
		int max=a[0],secmax=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				secmax=max;
				max=a[i];
				
			}
			 if(max!=a[i] && secmax<a[i]) {
				secmax=a[i];
			}
		}
		return secmax;
	}
	public static int findMinNo(int[]a) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		}
		return min;
	}
	
	public static int SearchElement(int[]a,int ser) {
		int i,index=-1;
		for(i=0;i<a.length;i++) {
			if(ser==a[i])
				index=i;
		}
		return index;
	}
	
	public static void sortArray(int[] a) {
		int i,j,len=a.length;
		int temp;
		for(i=0;i<len;i++) {
			for(j=0;j<len;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("---after sort----");
		for(int k:a) {
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {12,35,66,78,77,33};
		System.out.println("----even nos from array----");
		FindEvenNo(num);
		System.out.println("----odd nos from array----");
		FindOddNo(num);
		System.out.println("---max no----");
		int maxno=findMaxNo(num);
		System.out.println(maxno);
		System.out.println("---min no----");
		int minno=findMinNo(num);
		System.out.println(minno);
		System.out.println("----search element of array----");
		int search=780;
		int idx=SearchElement(num,search);
		if(idx!=-1)
			System.out.println(search+" is present at index :"+idx);
		else
			System.out.println(search+" is not present in array");
		
		System.out.println("---Secon max no----");
		int smax=FindSecondMaxNo(num);
		System.out.println(smax);
		sortArray(num);
		
		//sort by built in method
		int ages[]= {5,67,43,35,89,2};
		System.out.println("--sorting--");
		Arrays.sort(ages);
		for(int a:ages) {
			System.out.println(a);
		}
			
	}

}
