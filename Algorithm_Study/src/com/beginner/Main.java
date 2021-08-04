package com.beginner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// KOI 2019 막대기
		// 높이가 다른 막대가 주어진다.
		// 한방향에서 바라봤을때, 몇개가 보이는지 카운팅해라.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		int[] nums = new int[n];
		for (int k = 0; k < n; k++) {
			nums[k] = sc.nextInt();
		}
		int temp = nums[n - 1];

		for (int i = n - 2; i >= 0; i--) {
			if (nums[i] > temp) {
				temp = nums[i];
				count++;
			}
		}
		System.out.println(count);

	}

	public static void countingSqueare() {
		// 정사각형의 갯수 구하기
		// 한변의 길이가 n인 격자판이 있다. 각 격자의 길이가 1인경우, 크고 작은 정사각혀으이 갯수는?
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 0; i < n; i++) {
			count += ((n - i) * (n - i));

		}
		System.out.println(count);

	}

	public static void reverseString() {

		// 회문

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 2;
		for (int k = 0; k < n; k++) {
			System.out.println();
			String str = sc.nextLine();
			StringBuffer sb = new StringBuffer(str);
			String str_re = sb.reverse().toString();

//		System.out.println(str.length());

			if (str.equals(str_re)) {
//					System.out.println("회문입니다.");
				result = 0;
			} else {
				for (int i = 0; i < str.length(); i++) {
					StringBuffer sb_copy = new StringBuffer(sb);
					StringBuffer str_sb = sb_copy.deleteCharAt(i);
					String str_b = str_sb.toString();
					String str_br = str_sb.reverse().toString();
					if (str_b.equals(str_br)) {
//							System.out.println("절반회문입니다.");
						result = 1;
						break;
					}
				}
			}

			System.out.println(str + " " + result);

		}

	}

	public static void triangleArea() {
		// 좌표 3개가 주어짐
		// 3개로 삼각형의 넓이를 구해라
		Scanner sc = new Scanner(System.in);
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0, x3 = 0, y3 = 0;
		x1 = sc.nextInt();
		y1 = sc.nextInt();
		x2 = sc.nextInt();
		y2 = sc.nextInt();
		x3 = sc.nextInt();
		y3 = sc.nextInt();
		// 점 3개로 넓이 구하는 공식 사용
		double r1 = x1 * y2 + x2 * y3 + x3 * y1;
		double r2 = x2 * y1 + x3 * y2 + x1 * y3;
		double s = Math.abs((r1 - r2) / 2.0); // 절대값
		System.out.printf("%.2f", s);
	}

	public static void bubblesort() {

		// 정렬을 진행할 숫자들 입력, 해당 갯수에 맞게 수 입력
		// 오름차순 하시오
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] nums = new int[num];

		for (int i = 0; i < num; i++) {
			nums[i] = sc.nextInt();

			for (int j = 0; j < i; j++) {
				int temp = 0;
				if (nums[j] > nums[i]) {
					temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
//			System.out.println(Arrays.toString(nums));
		}
		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	public static void subString() {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		int a = sc.nextInt();
		int b = sc.nextInt();

		String str1 = str.substring(a - 1, b + a - 1);
		System.out.println(str1);

	}

	public static void square() {

		// 입력수가 갯수인 정사각형 만들기
		// 순서는 위에서 아래로
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = i; j < i + (num * num); j += num) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}

	public static void ASCII() {
		// aSC 코드
		// 임의의 값이 입력되면 ASCII 코드값(십진수 출력)
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println((int) ch);
	}

	public static void bitOperator() {
		// 두수를 입력받아 비트연산 해봄
		// 첫줄에 AND, 다음줄에 OR, 마지막줄에 XOR
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a & b);
		System.out.println(a | b);
		System.out.println(a ^ b);

	}

	public static void goodBrothers() {

		// 의좋은 형제
		// 1. 번갈아서 서로 가져다움
		// 2. 절반을 주되, 반으로 정확히 나눌수 없는경우 나머지도 같이 줌.
		// 3. n번째 날의 카운팅은?
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int days = sc.nextInt();
		boolean bl = true; // 누가 가져다 줄 횟수인지 T면 A가 줄차레, F면 B가 줄 차례

		for (int i = 0; i < days; i++) {
			if (bl) {
				int x = 0;
				if (A % 2 == 0) {
					x = A;
					A /= 2;
					B += (x / 2);
					bl = false;
				} else {
					x = A;
					A = A / 2;
					B += x / 2 + x % 2;
					bl = false;
				}

			} else {
				int x = 0;
				if (B % 2 == 0) {
					x = B;
					B /= 2;
					A += (x / 2);
					bl = true;
				} else {
					x = B;
					B = B / 2;
					A += x / 2 + x % 2;
					bl = true;
				}
			}

		}
		System.out.println(A + " " + B);
	}

	private static void adollorshop() {
		// 천원샵 거스름돈
		// 500원, 100원, 50원, 10원을 단위가 큰 동전 우선으로 거슬러줘라
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int num = 1000 - input;
		int won500 = 0;
		int won100 = 0;
		int won50 = 0;
		int won10 = 0;

		while (num != 0) {
			if (num / 500 != 0) {
				won500++;
				num -= 500;
//				System.out.println("500원");
				continue;
			} else if (num / 100 != 0) {
				won100++;
				num -= 100;
//				System.out.println("100원");
			} else if (num / 50 != 0) {
				won50++;
				num -= 50;
//				System.out.println("50원");
			} else if (num / 10 != 0) {
				won10++;
				num -= 10;
//				System.out.println("10원");
			}
		}
//		System.out.println("계산 끝");
//		System.out.printf("500원 : %d, 100원 : %d, 50원: %d, 10원:%d",won500,won100,won50,won10);

		System.out.printf("%d %d %d %d ", won500, won100, won50, won10);

	}

	private static void diseVolume() {
		// 주사위 부피구하기 // 실패 //
		// 정수 n이 주어짐
		// 각 변의 길이 n
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//	long volume = 0;
//	long sum = 0;

		long test = ((n * (n + 1)) / 2);
		long test_2 = (test * test);
		System.out.println(test_2 % 1000000007);

//	for (int i = 1; i <= n; i++) {
//		volume = i * i * i;
//
//		long x = volume;
////		System.out.println("각변길이"+i+"의 부피는"+volume);
//		sum += x;
//
//	}
	}

	private static void CountWord() {
		// 문자열 한줄이 주어졌을때 , 몇개의 단어가 존재하는지 계산해라.
		// 문자열을 앞뒤로 trim 하여 공백을 없애고, " "으로 스플릿.
		// 반복문을 돌리되, 공백이 두번 있을 경우를 생각해 trim을 한번 더 돌리고, 문자의 갯수가 0이되면패스.
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int count = 0;
		String[] strs = str.trim().split(" ");

		for (int i = 0; i < strs.length; i++) {
			String stx = strs[i].trim();
			if (stx.length() != 0) {
				count++;
			}
		}
		System.out.println(count);

		// 스트링 토크나이저 사용.
//		StringTokenizer st = new StringTokenizer(str, "  ");
//		System.out.println(st.countTokens());
//
//		while (st.hasMoreTokens()) {
////			System.out.println(st.nextToken());
//			count++;
//		}
//		System.out.println(count);
	}

	private static void pyramid() {

//		입력한 수가 피라미드의 층수가 된다고 생각하고 "*"로 된 피라미드 모양을 출력하라
//		입력 : 자연수 50이내
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = num - 1;
		for (int i = 0; i < num; i++) {
			for (int k = 0; k < x; k++) {
				System.out.print(" ");
			}

			x--;

			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	private static void countchar() {
		// 입력된 문자열 속에서 특정 문자 갯수 구하기
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		char[] chs = new char[str.length()];
		int count = 0;

		try {
			for (int i = 0; i < str.length(); i++) {
				chs[i] = str.charAt(i);

				if (ch == chs[i]) {
					count++;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(count);
	}
}
