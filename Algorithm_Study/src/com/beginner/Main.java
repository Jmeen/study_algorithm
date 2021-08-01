package com.beginner;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
	}
	
	
	public static void square() {
		
		// 입력수가 갯수인 정사각형 만들기
		// 순서는 위에서 아래로
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = i; j < i + (num * num); j += num) {
				System.out.print(j+"\t");
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
