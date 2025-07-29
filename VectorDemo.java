package com.list;

import java.util.*;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//legecy class java 1.0
		Vector<Integer>ages=new Vector<Integer>();
		ages.addElement(10);
		ages.addElement(56);
		ages.addElement(23);
		ages.addElement(20);
		ages.addElement(36);
		//ages.add(45);
		
		Enumeration<Integer> em=ages.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		//Iterator
		//foreach
	}

}
