package com.containment;

public class Book {

	private int bookid;
	private String bookname;
	private double bookprice;
	private Author author;
	
	public Book(int bookid,String bookname,double bookprice,Author author) {
		this.bookid=bookid;
		this.bookname=bookname;
		this.bookprice=bookprice;
		this.author=author;
	}
	
	public String toString() {
		return "bookid:"+bookid+"\nbookname:"+bookname+"\nbookprice:"+bookprice+"\nAuthor:"+author;
	}
}
