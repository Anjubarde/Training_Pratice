package com.exception.demo;

import java.io.FileWriter;
import java.io.IOException;

public class Demo_checkedException {

	public void m1()throws IOException {
		FileWriter fw=new FileWriter("abc.txt");
	}
	public void m2() throws IOException {
		m1();
	}
	public void m3() {
		try {
			m2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		try {
		FileWriter fw=new FileWriter("abc.txt");
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}

}
