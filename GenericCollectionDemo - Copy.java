package com.list;
import java.util.*;
public class GenericCollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("narayan");
		names.add("pooja");
		names.add("rahul");
		names.add("jiya");
		
		String s=names.get(1); // no need of type casting
		System.out.println(s);
		
		System.out.println("-----display list----");
		System.out.println(names);
		
		System.out.println("---for loop----");
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		System.out.println("---for each----");
		for(String s1:names) {
			System.out.println(s1);
		}
		System.out.println("---Iterator----");
		Iterator<String> itr=names.iterator();
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());
//		System.out.println(itr.hasNext()); //false
//		System.out.println(itr.next()); //exception
		
		while(itr.hasNext()) {
			//System.out.println(itr.next());
			String n=itr.next();
			System.out.println(n);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
