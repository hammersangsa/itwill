/*
2. 1~10사이의 난수를 발생시켜 발생시킨 난수를 3번안에 알아 맞추는 게임
   (3번안에 알아맞추지 못하면 발생된 난수를 출력)

예)
정수입력?[1번째기회] : 3
틀렸어요!!
정수입력?[2번째기회] : 5
틀렸어요!!
정수입력?[3번째기회] : 7
틀렸어요!!

정답은 2입니다

계속할래?[Y/N] : 
------------------------------
정수입력?[1번째기회] : 7
틀렸어요!!
정수입력?[2번째기회] : 4
틀렸어요!!
정수입력?[3번째기회] : 9
맞았어요!!

정답은 9입니다

계속할래?[Y/N] :
 */

package com.day6;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Solve2 {

	public static void main(String[] args) throws IOException {

		// 선언
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int i, j, su = 0, k = 0;
		int n = 0;
		char ch;

		while (true) {
			
			num[su] = rd.nextInt(10)+1 ;
			
			for (n = 0; n < 3; n++) {

				System.out.print("정수입력?[" + (n + 1) + "번째기회] : ");
				k = sc.nextInt();

				if (num[su] != k)
					System.out.println("오답입니다.");

				if (num[su] == k) {
					System.out.println("정답입니다!!");
					break;
				}
			}
			System.out.println("\n정답은" + num[su] + "입니다.");

			System.out.print("계속하시겠습니까? [Y/N]");
			ch = (char) System.in.read();

			if (ch != 'y' && ch != 'Y') {
				System.out.println("\n프로그램을 종료합니다");
				break;
			}
		}

	}

}
