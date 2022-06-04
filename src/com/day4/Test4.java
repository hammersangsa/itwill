package com.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {

	public static void main(String[] args) throws IOException {

		// 수를 입력받아 1에서부터 수까지의 합계

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int su, sum = 0;
		char ch;

		while (true) {// 무한루프

			do {
				System.out.print("1~5000까지의 수를 입력해주세요");// 100e
				su = Integer.parseInt(br.readLine());
			} while (su < 1 || su > 5000);

			sum = 0;
			// 변수 중간 초기화
			for (int i = 1; i <= su; i++) {
				sum += i;
			}

			System.out.println("1~" + su + "까지의 합: " + sum);

			System.out.print("계속하시겠습니까? [Y/N]");// ye
			ch = (char) System.in.read();

			if (ch != 'y' && ch != 'Y') {
				System.out.println("프로그램을 종료합니다.");
				break;
				// break는 while, do~while, for, switch에서 사용 가능(벗어남)
			}

			System.in.skip(2);
			// ascii값 두개를 처리
		}

	}

}
