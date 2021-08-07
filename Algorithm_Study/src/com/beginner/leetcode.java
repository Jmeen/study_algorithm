package com.beginner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class leetcode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		char s = sc.next().charAt(0);
		int[] nums = { 2, 5, 5, 11 };
		int target = 10;

		System.out.println(Arrays.toString(twoSum(nums, target)));

	}

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
