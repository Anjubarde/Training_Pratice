package com.twodim.array;

import java.util.Scanner;

public class Array2DimDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mat[][]=new int[3][3];
		int rows,cols,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a row:");
		rows=sc.nextInt();
		System.out.println("Enter a cols:");
		cols=sc.nextInt();
		
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				System.out.println("Enter an Element :mat["+i+"]["+j+"]");
				mat[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("--array---");
		for(i=0;i<rows;i++) {
			for(j=0;j<cols;j++) {
				System.out.println("mat["+i+"]["+j+"]:"+mat[i][j]);
				
			}
		}
	}

}
