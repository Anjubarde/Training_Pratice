package com.list;

import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<String> color=new CopyOnWriteArrayList<String>();
		color.add("blue");
		color.add("white");
		color.add("red");
		color.add("yellow");
		
		for(String s:color) {
			color.add("green");
			System.out.println(s);
		}
		System.out.println(color);
	}

}
