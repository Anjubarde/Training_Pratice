package com.containment;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//annonymous object
		
		Book b1=new Book(101,"lets learn java",500,new Author(1,"nikita"));
		System.out.println(b1);
		
		Author a1=new Author(1,"mitali");
		Book b2=new Book(101,"lets learn c#",250,a1);
		System.out.println(b2);
	}

}
