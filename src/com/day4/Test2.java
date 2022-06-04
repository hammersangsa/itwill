package com.day4;

import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {

		// 수를 입력받아 1에서부터 수까지의 합계

		Scanner sc = new Scanner(System.in);

		int su, sum = 0;
		char ch;

		while (true) {// 무한루프

			do {
				System.out.print("1~5000까지의 수를 입력해주세요");// 1000
				su = sc.nextInt();
			} while (su < 1 || su > 5000);

			sum = 0;
			// 변수 중간 초기화
			for (int i = 1; i <= su; i++) {

				sum += i;

			}

			System.out.println("1~" + su + "까지의 합: " + sum);

			System.out.print("계속하시겠습니까? [Y/N]");// y,Y,n,N,1,A,아니
			ch = (char) System.in.read();

			if (ch != 'y' && ch != 'Y') {
				// 양쪽이 부정이면 앰퍼샌드사용
				System.out.println("프로그램을 종료합니다.");

				break;
				// break는 while, do~while, for, switch에서 사용 가능(벗어남)
			}

		}

	}

}
