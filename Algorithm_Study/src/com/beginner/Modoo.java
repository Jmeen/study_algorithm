package com.beginner;

import java.util.Scanner;

public class Modoo {

	public static void main(String[] args) {
//		q0101();
//		q0102();
		q0301();
	}

	// n명 중 두명을 뽑아 짝을 짓는다고 할때, 짝을 지을 수 있는 조합을 출력하시오
	private static void q0301() {
		String[] list = { "mike", "Tom", "jerry" };
		String[] result = new String[3];

		for (int i = 0; i < list.length; i++) {
			for (int j = i; j < list.length; j++) {
				if (list[i].equals(list[j])) {

				} else {
					System.out.println(list[i] + '-' + list[j]);
				}
			}
		}
	}

	// n개의 정수값 입력받아 최대값 찾기
	private static void q0201() {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇개를 입력받을까?");
		int n = sc.nextInt();

		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = sc.nextInt();
		}
		int max = nums[0];
		for (int j = 1; j < n; j++) {
			if (nums[j] > max) {
				max = nums[j];
			}
		}
		System.out.println("최대값은 " + max);
		sc.close();
	}

	// 1부터 n 까지의 제곱합 구하기
	private static void q0101() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (i * i);
		}
		System.out.println(sum);

		sc.close();
	}

	private static void q0102() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		sum = ((n * (n + 1) * ((2 * n) + 1))) / 6;
		System.out.println(sum);

		sc.close();
	}

}
