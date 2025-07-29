package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListInteratingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names=new ArrayList<String>();
		names.add("narayan");
		names.add("pooja");
		names.add("rahul");
		names.add("jiya");
		int i,len=names.size();
		System.out.println("-----by for loop-------");
		for(i=0;i<len;i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("-----by enhanced for loop-------");
		for(String s:names) {
			System.out.println(s);
		}
		System.out.println("----by Iterator------");
		Iterator<String> itr=names.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-----by List Iterator----");
		ListIterator<String>litr=names.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("-----by List Iterator in backward----");
		ListIterator<String>litr1=names.listIterator(names.size());
		while(litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}
		
	}

}
