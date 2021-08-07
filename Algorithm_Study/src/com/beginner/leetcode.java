package com.beginner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class leetcode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		char s = sc.next().charAt(0);
		System.out.println(reverse(1999999999));
	}

	public static int reverse(int x) {

		long result = 0;
		while (x != 0) {
			result = (result * 10) + (x % 10);
			x /= 10;
		}
		return outOfRange(result) ? 0 : (int) result;

	}

	public static boolean outOfRange(long num) {
		return num != (int) num;
	}
 /// 너무 복잡하게 생가하지 말자.
//		int result = 0;
//		String result_str = "";
//		String str = Integer.toString(x);
//		int a = 0;
//		int b = str.length() - 1;
//		boolean ch = true;
//		char[] chs = new char[str.length()];
//		for (int i = 0; i < str.length(); i++) {
//			chs[i] = str.charAt(i);
//		}
//		while (a <= b) {
//			if (ch) {
//				if (chs[0] == '-') {
//					a += 1;
//					ch = false;
//				}
//			}
//			char temp = chs[b];
//			chs[b] = chs[a];
//			chs[a] = temp;
//			a++;
//			b--;
//		}
//		
//		for(char c : chs) {
//			result_str+=c;
//		}
//		result = Integer.parseInt(result_str);
//		return result;

	public static int[] twoSum(int[] nums, int target) {
		// leetcode 1. Two Sum

		// 해시맵은 key와 value값을 가지고 있다. - 0
		HashMap<Integer, Integer> map = new HashMap<>();

		// 반복을 하는데 - 1
		for (int i = 0; i < nums.length; i++) {
			// 만약 taget-nums[i]의 키를 map이 가지고 있으면 -3
			if (map.containsKey(target - nums[i])) {
				// 그 키의 값 (인덱스)를 가져와서 new int[]로 리턴한다. -- 4
				return new int[] { map.get(target - nums[i]), i };
			}
			// 맵에 집어넣는다 (키값 , 값 )
			// nums[i]가 키, 인덱스가 값이다. -2
			map.put(nums[i], i);
		}
		return null;

//		int[] result = new int[2];
//
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 1; j < nums.length; j++) {
//				if (i == j) {
//					continue;
//				}
//				if (nums[i] + nums[j] == target) {
//					result[0] = i;
//					result[1] = j;
//					return result;
//				}
//			}
//		}
//
//		return result;

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
