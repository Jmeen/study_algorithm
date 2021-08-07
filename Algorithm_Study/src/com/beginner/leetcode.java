package com.beginner;

import java.util.Arrays;
import java.util.Scanner;

public class leetcode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		char s = sc.next().charAt(0);
		char[] s = { 'h', 'e', 'l', 'l', 'o' };
		reverseString(s);

	}

	public static void reverseString(char[] s) {
		// 344. Reverse String
		int i = 0;
		int x = s.length - 1;
		while (i <= x) {
			char tempcha = s[i];
			s[i] = s[x];
			s[x] = tempcha;
			x--;
			i++;
		}
		System.out.println(s);
	}

	public static boolean isPalindrome(String s) {
		// 125. Valid Palindrome
		// 한글유니코드(\uAC00-\uD7A3), 숫자 0~9(0-9), 영어 소문자a~z(a-z), 대문자A~Z(A-Z)를 제외한(^) 단어일
		// 경우 체크 / 공백(\s)
		String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z]";
		String str = s.replaceAll(match, "").toLowerCase();

		char[] chs = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			chs[i] = str.charAt(i);
		}
		boolean x = true;
		int z = str.length() - 1;
		int i = 0;
		while (i < str.length()) {
			if (chs[i] == chs[z]) {
				i++;
				z--;
//					System.out.println("OK");
			} else {
				x = false;
				break;
//					System.out.println("ERROR");
			}
		}
		return x;
	}
}
