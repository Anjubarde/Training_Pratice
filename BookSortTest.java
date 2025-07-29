package com.list;

import java.util.*;

public class BookSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Java", 500));
        books.add(new Book(2, "Python", 300));
        books.add(new Book(3, "C++", 300));
        books.add(new Book(4, "Spring", 700));

        Collections.sort(books);
        
        for(Book b:books){
        		System.out.println(b);
        }
	}

}
