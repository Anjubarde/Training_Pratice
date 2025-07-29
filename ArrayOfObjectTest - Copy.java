package com.arrayofobject.containment;

import java.util.Arrays;

/*Create student class { int sid , String name , int[] marks }
each student has marks of 3 subjects 
find name of student having highest percentage*/
class Student_1 {
	private int sid;
	private String sname;
	private int[] marks;

	public Student_1() {
		super();
	}

	public Student_1(int sid, String sname, int[] marks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.marks = marks;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student_1 [sid=" + sid + ", sname=" + sname + ", marks=" + Arrays.toString(marks) + "]";
	}

	public double getPercentage(int[] mks) {
		int sum = 0;
		for (int m : mks) {
			sum += m;
		}
		return (sum * 100) / 300;

	}

}

public class ArrayOfObjectTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student_1 s1 = new Student_1(101, "radhika", new int[] { 78, 58, 96 });
		int marks[] = { 78, 40, 56 };
		Student_1 s2 = new Student_1(102, "pooja", marks);

		Student_1 s3 = new Student_1();
		s3.setSid(103);
		s3.setSname("yash");
		s3.setMarks(new int[] { 95, 87, 80 });

		Student_1 stud[] = new Student_1[5];
		stud[0] = s1;
		stud[1] = s2;
		stud[2] = s3;
		System.out.println("----student array----");
		for (Student_1 s : stud) {
			System.out.println(s);
		}

		double highper = stud[0].getPercentage(stud[0].getMarks());
		System.out.println(highper);
		// System.out.println(stud[1].getPercentage(stud[1].getMarks()));
		// System.out.println(stud[2].getPercentage(stud[2].getMarks()));
		Student_1 topper = new Student_1();
		for (int i = 0; i < stud.length; i++) {
			if (stud[i] != null) {
				double per = stud[i].getPercentage(stud[i].getMarks());
				if (highper < per) {
					highper = stud[i].getPercentage(stud[i].getMarks());
					topper = stud[i];
				}
			}
		}
		System.out.println(topper);
	}
}
