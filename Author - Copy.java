package com.containment;

public class Author {

	private int authorid;
	private String authorname;
	
	public Author(int authorid,String authorname) {
		this.authorid=authorid;
		this.authorname=authorname;
	}
	public String toString() {
		return "Author Id:"+authorid+"\nAuthor Name:"+authorname;
	}
}
