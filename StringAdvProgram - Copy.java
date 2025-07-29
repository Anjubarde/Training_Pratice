package com.string.demo;

public class StringAdvProgram {

	static void findCountOfChar(String s, char ch) {
		int i, len = s.length();
		int count = 0;
		for (i = 0; i < len; i++) {
			if (ch == s.charAt(i)) {
				count++;
			}
		}
		if (count != 0) {
			System.out.println(ch + ":" + count);
		} else {
			System.out.println(ch + " is not present");
		}
	}

	static int findCountOfChar1(String s, char ch) {
		int i, len = s.length();
		int count = 0;
		for (i = 0; i < len; i++) {
			if (ch == s.charAt(i)) {
				count++;
			}
		}
		return count;
	}

	static void UniqueCharInString(String s) {
		int i, j, len = s.length();
		char ch1;
		int count = 0;
		for (i = 0; i < len; i++) {
			ch1 = s.charAt(i);
			count = findCountOfChar1(s, ch1);
			if (count == 1) {
				System.out.println(ch1);
			}
		}
	}

	static void DuplicateCharInString(String s) {
		int i, j, len = s.length();
		char ch1;
		int count = 0;
		for (i = 0; i < len; i++) {
			ch1 = s.charAt(i);
			if (ch1 != ' ') {
				count = findCountOfChar1(s, ch1);
				if (count > 1) {
					System.out.println(ch1);
					s = s.replace(ch1, ' ');
				}
			}
		}
	}

	static void countFrqOfChar(String s) {
		int i, j, len = s.length();
		int count;
		char ch1, ch2;
		for (i = 0; i < len; i++) {
			count = 0;
			ch1 = s.charAt(i);
			if (ch1 != ' ') {
				for (j = 0; j < len; j++) {
					ch2 = s.charAt(j);
					if (ch1 == ch2) {
						count++;
					}

				} // inner

				System.out.println(ch1 + ":" + count);
				s = s.replace(ch1, ' ');
			}

		}
	}

	public static void main(String[] args) {

		String s1 = "hello world";
		countFrqOfChar(s1);
		findCountOfChar("hello", 'k');
		UniqueCharInString("hello");
		System.out.println("---duplicate char---");
		DuplicateCharInString("rose is red");
	}

}
