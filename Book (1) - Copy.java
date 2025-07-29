package com.list;

public class Book implements Comparable<Book> {
	    int bookid;
	    String bookname;
	    double bookprice;

	    public Book(int bookid, String bookname, double bookprice) {
	        this.bookid = bookid;
	        this.bookname = bookname;
	        this.bookprice = bookprice;
	    }

	   

	    public int getBookid() {
			return bookid;
		}



		public void setBookid(int bookid) {
			this.bookid = bookid;
		}



		public String getBookname() {
			return bookname;
		}



		public void setBookname(String bookname) {
			this.bookname = bookname;
		}


		public double getBookprice() {
			return bookprice;
		}


		public void setBookprice(double bookprice) {
			this.bookprice = bookprice;
		}


		@Override
	    public String toString() {
	        return bookid + "\t" + bookname + "\t\t" + bookprice;
	    }



		@Override
		public int compareTo(Book o) {
			// TODO Auto-generated method stub
			if(this.getBookprice()==o.getBookprice()) {
				return this.getBookname().compareTo(o.getBookname());
			}
			else if(this.getBookprice()>o.getBookprice()) {
				return 1;
			}
			else {
				return -1;
			}
			
			//return  ((int)getBookprice()-(int)o.getBookprice());
		}
}
