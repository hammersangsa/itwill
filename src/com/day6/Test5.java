package com.day6;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {

		// 주민등록번호 구하는 방식

		Scanner sc = new Scanner(System.in);
		// index : 01234567890123
		// jumin : 900110-2053126
		// chk   : 234567 892345

		// 합=(9*2)+(0*3)+...+(2*5)
		// 합=11-합%11
		// 합=합%10
		// 합==6

		String jumin;
		int[] chk = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
		int i, tot, su;

		System.out.print("주민번호[xxxxxx-xxxxxxx]?");
		jumin = sc.next();

		if (jumin.length() != 14) {
			System.out.println("입력 오류!");
			return;// stop
		}

		tot = 0;
		// index : 01234567890123
		// jumin : 900110-2053126
		// chk : 234567 892345
		// 번호가 없는 다시와 마지막 검산하는 숫자는 빼서 12만 계산
		for (i = 0; i < 12; i++) {

			if (i >= 6) {// 뒷자리 비교
				tot += chk[i] * Integer.parseInt(jumin.substring(i + 1, i + 2));// 1값과 +2 값을 준이유는 다시를 계산해야하기 때문이다.
			} else {// 생년월일
				tot += chk[i] * Integer.parseInt(jumin.substring(i, i + 1));//+=은 누적해서 계산 한 값 부호
			}
		}
		
		su = 11 - tot % 11;
		su = su & 10;

		if (su == Integer.parseInt(jumin.substring(13))) {
			System.out.println("대한민국 국민입니다");
		} else {
			System.out.println("넌 누구냐?");
		}

	}

}

/*
 * String str = "seoul korea"; //index : 01234567890 이 만들어진다.
 * 
 * System.out.println(str.substring(0, 3));//3에서 1을 뺴야줘야 하기때문에 seo 까지 읽는다.
 * System.out.println(str.substring(6, 8));
 * System.out.println(str.substring(6);//6번째 부터 끝까지 출력 된다.
 */