package com.list;
import java.util.*;
//List -> accept duplicate values and follows insertion order


public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> list;
		
		list=new ArrayList<String>();
		list=new LinkedList<String>();
		
		//or
		
		//non-generice collection
		ArrayList list1=new ArrayList();
		LinkedList list2=new LinkedList();
		
		//generic collection
		ArrayList<String> names=new ArrayList<String>();
		LinkedList<Integer>nums=new LinkedList<Integer>();
	}

}
