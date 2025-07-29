package com.demo.encapsulation;
//encapsulation
//wrapping data in single unit and protect it from outside world
//with help of private keyword
//private data members are available within the class (not for outside of class)
//we can use private to variables,methods or constructors
public class Account {

	private int acc_no;
	private String acc_holder_name;
	private double acc_balance;
	
	public Account(int acc_no,String acc_holder_name,double acc_balance) {
		this.acc_no=acc_no;
		this.acc_holder_name=acc_holder_name;
		this.acc_balance=acc_balance;
	}
	
	//private data members can be accessible through public member function
	private void method1() {}
	public void show() {
		System.out.println("Account No:"+acc_no);
		System.out.println("Account Holder name:"+acc_holder_name);
		System.out.println("Account Balance:"+acc_balance);
	}
}
