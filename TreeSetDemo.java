package com.set;

import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> nums=new TreeSet<Integer>();
		nums.add(10);
		nums.add(52);
		nums.add(78);
		nums.add(96);
		nums.add(96);
		nums.add(63);
		nums.add(36);
		
		for(Integer i:nums) {
			System.out.println(i);
		}
	}

}
