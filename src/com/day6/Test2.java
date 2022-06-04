package com.day6;

import java.util.Random;

public class Test2 {

	public static void main(String[] args) {

		// 1~45까지의 수중 6개의 "난수"를 발생시켜 크기순으로 정렬

		Random rd = new Random();// 랜덤이라는 클래스 객체 생성

		int[] num = new int[6];

		int i, j, temp, n;

		n = 0;

		while (n < 6) {

			num[n] = rd.nextInt(45) + 1;

			for (i = 0; i < n; i++) {

				if (num[i] == num[n])// == 같다 라는뜻 {
					n--;// -
				break;
			}

			n++;

		} // 순서없이 나열된 숫자를 정렬 시켜줌
		for (i = 0; i < num.length - 1; i++) {

			for (j = i + 1; j < num.length; j++) {

				if (num[i] > num[j]) {

					temp = num[i];
					num[i] = num[j];
					num[j] = temp;

				}

			}

		}
		System.out.print("로또 번호 :");
        //45개의 숫자 중에 랜덤으로 숫자를 뽑아내는 for문과 출력문
		for (int su : num) {
			
			System.out.printf("%4d", su);
		}

	}

}
