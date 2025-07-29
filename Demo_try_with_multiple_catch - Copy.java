package com.exception.demo;

public class Demo_try_with_multiple_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=2;
		int arr[]=new int[5];
		String s=null;
		
		try {
			System.out.println(a/b);
			System.out.println(arr[9]);
			System.out.println(s.length());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch(RuntimeException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
