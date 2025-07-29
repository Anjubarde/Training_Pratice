package com.onedim.array;

public class ArrayMergeElements {
	//1,2,3,4,5,11,12,13,14,15
	public static void mergeArrayPattern1(int a[],int b[]) {
		int i;
		int alen=a.length;
		int blen=b.length;
		int[] mergearr=new int[alen+blen];
		
		//1,11,2,12,3,13,4,14,5,15
		for(i=0;i<mergearr.length;i++) {
			if(i<alen) {
				mergearr[i]=a[i];
			}
			else {
				mergearr[i]=b[i-blen];
			}
		}
		
		for(int m:mergearr) {
			System.out.println(m);
		}
	}
	//1,11,2,12,3,13,4,14,5,15
	public static void mergeArrayPattern2(int a[],int b[]) {
		System.out.println("inside");
		int i;
		int alen=a.length;
		int blen=b.length;
		int[] mergearr=new int[alen+blen];
		int index1=0,index2=0;
		//1,11,2,12,3,13,4,14,5,15
		for(i=0;i<mergearr.length;i++) {
			if(i%2==0) {
				mergearr[i]=a[index1++];
			}
			else {
				mergearr[i]=b[index2++];
			}
			
		}
		
		for(int m:mergearr) {
			System.out.println(m);
		}
	}
	//1,12,3,14,5
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		int brr[]= {11,12,13,14,15};
		//mergeArrayPattern1(arr, brr);
		mergeArrayPattern2(arr, brr);
		}
	}


