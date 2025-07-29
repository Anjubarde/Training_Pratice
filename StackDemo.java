package com.list;
import java.util.*;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LIFO- last in first out
		
		Stack<Integer> stack=new Stack<Integer>();
		//System.out.println(stack.peek());
		//System.out.println(stack.pop());
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		stack.add(50);
		
		System.out.println(stack);
		System.out.println(stack.push(90));
		System.out.println(stack);
		System.out.println("Top:"+stack.peek());
		System.out.println(stack.pop());//removes and return top of stack
		System.out.println(stack);
	}

}
