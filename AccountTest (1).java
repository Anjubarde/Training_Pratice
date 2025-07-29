package com.demo.encapsulation;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1=new Account(101,"hina",1000);
		//System.out.println(a1.acc_id); acc_id is private can not access outside class
		a1.show();
		//a1.method1();
	}

}
