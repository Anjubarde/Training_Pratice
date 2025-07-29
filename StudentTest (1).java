package com.arrayofobject;

import java.util.Scanner;

public class StudentTest {

	static Scanner sc=new Scanner(System.in);
	public static void AddStudent(Student s) {
		System.out.println("Enter Student Id:");
		s.setSid(sc.nextInt());
		System.out.println("Enter Student name:");
		s.setSname(sc.next());
		System.out.println("Enter Student marks:");
		s.setSmarks(sc.nextDouble());
	}
	
	public static Student findTopper(Student[]sarr) {
		int i=0,len=sarr.length;
		Student s=new Student();
		double maxm=sarr[0].getSmarks();
		for(i=0;i<len;i++) {
			if(sarr[i]!=null) {
				if(maxm<sarr[i].getSmarks()) {
					maxm=sarr[i].getSmarks();
					s=sarr[i];
					//System.out.println(s);
				}
			}
		}
		return s;
	}
	
	public static double FindMaxMarks(Student[]sarr) {
		int i=0,len=sarr.length;
		Student s=new Student();
		double maxm=sarr[0].getSmarks();
		for(i=0;i<len;i++) {
			if(sarr[i]!=null) {
				if(maxm<sarr[i].getSmarks()) {
					maxm=sarr[i].getSmarks();
					
					//System.out.println(s);
				}
			}
		}
		return maxm;
	}
	
	public static void sortByMarks(Student[]arr) {
		int i=0,j=0,len=arr.length;
		Student stemp;
		for(i=0;i<len;i++) {
			for(j=0;j<len;j++) {
				if(arr[i].getSmarks()<arr[j].getSmarks()) {
					stemp=arr[i];
					arr[i]=arr[j];
					arr[j]=stemp;
					
					
				}
			}
		}
		for(Student s:arr) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stuarr=new Student[5];
		int i,len=stuarr.length;
		//case-1
		stuarr[0]=new Student(101, "pooja", 89);
		stuarr[1]=new Student(102,"shyam",60);
		stuarr[2]=new Student(103,"priya",57);
		
		//case -2
		Student s3=new Student(104,"priya",57);
		stuarr[3]=s3;
		
		//case-3 
		stuarr[4]=new Student();
		stuarr[4].setSid(105);
		stuarr[4].setSname("rani");
		stuarr[4].setSmarks(89);
//		
//		for(i=0;i<2;i++) {
//			stuarr[i]=new Student();
//			AddStudent(stuarr[i]);
//		}
		
		for(i=0;i<len;i++) {
//			if(stuarr[i]!=null) {
//			System.out.println(stuarr[i].getSid());
//			System.out.println(stuarr[i].getSname());
//			System.out.println(stuarr[i].getSmarks());
//			System.out.println("------------------------");
//			}
			
			if(stuarr[i]!=null) {
				System.out.println(stuarr[i]);
			}
		}
		
		//by for each loop
		System.out.println("by for each loop");
		for(Student s:stuarr) {
			System.out.println(s); //s.toString();
		}
		System.out.println("----Topper---");
		Student topper=findTopper(stuarr);
		System.out.println(topper);
		
		System.out.println("----topper----");
		double max=FindMaxMarks(stuarr);
		for(Student s:stuarr) {
			if(s.getSmarks()==max) {
			System.out.println(s); //s.toString();
			}
		}
		
		//sorting
		System.out.println("---by sorting----");
		sortByMarks(stuarr);
		
	}

}
