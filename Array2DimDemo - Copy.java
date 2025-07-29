package com.twodim.array;

public class Array2DimDemo {

	public static void main(String[] args) {
		
		int [][]mat=new int[3][2];
		
		System.out.println(mat.length);
		mat[0][0]=23;
		mat[0][1]=90;
		mat[1][0]=56;
		mat[1][1]=33;
		
		System.out.println(mat[0][0]);
		
		System.out.println("---by for loop---");
		for(int i=0;i<mat.length;i++) {
			//System.out.println("cols:"+mat[i].length);
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
		
		int [][]matrix= {{23,45},{78,25}};
	}

}
