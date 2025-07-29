package com.onedim.array;

public class FindSumOfArrayElements {

	public static int findSum(int[] arr) {
		int sum=0;
		int i;
		for(int a:arr) {
			sum+=a;
		}
		return sum;
	}
	public static void findSquare(int[] arr) {
		int i,len=arr.length;
		for(i=0;i<len;i++) {
			System.out.println(arr[i]+":"+(arr[i]*arr[i]));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]= {34,13,45};
		int len=num.length;
		int sum=0,i;
		
		for(i=0;i<len;i++) {
			sum=sum+num[i];
		}
		System.out.println("sum:"+sum);
		
		System.out.println("---method approach---");
		int ans=findSum(num);
		System.out.println(ans);
		findSquare(num);
	}

}
