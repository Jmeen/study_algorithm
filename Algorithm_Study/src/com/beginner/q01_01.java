package com.beginner;

public class q01_01 {

	public static void main(String[] args) {
		// 앞뒤가 같은 10진수 찾기
		// 10진수, 2진수, 8진수 그 어느것으로 표현하여도 대칭수 가 되는 수 중, 10진수의 10이상에서의 최소값을 구해보시오.
		// 예) 9(10진수) = 1001 (2진수) = 11(8진수)

		int num = 11;

		while (true) {

			String strNum = Integer.toString(num); // //10진수
			String binum = Integer.toBinaryString(num); // 2진수
			String octNum = Integer.toOctalString(num); // 8진수

			// String Buffer를 이용하면 String을 역으로 뒤집을 수 있다. String으로 다시 변환하려면 toSting을 붙이는걸
			// 잊지말자.
			String strNum_re = new StringBuffer(strNum).reverse().toString(); //
			String biNum_re = new StringBuffer(binum).reverse().toString(); //
			String octNum_re = new StringBuffer(octNum).reverse().toString();

			// 내용을 같에 하느건 equal이다!!!!!
			if ((binum.equals(biNum_re)) && (strNum.equals(strNum_re)) && (octNum.equals(octNum_re))) {
				System.out.println(num);
				break;
			}
			num++;
		}
		System.out.println("Find it!");
	}
}
