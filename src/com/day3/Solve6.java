/*6. 이름과 3과목의 점수를 입력 받아 다음조건에 따라 출력
	-모든 과목의 점수가 40점 이상이고 평균이 60점 이상이면 합격
	-한과목이라도 40점 미만이고 평균이 60점 이상이면 과락
	-평균이 60점 미만이면 불합격
 	이름 ? 홍길동
	세과목 점수 ? 60 70 80
	이름 : 홍길동
	총점 : 210, 평균 : 70, 판정 :합격
 */

package com.day3;

import java.util.Scanner;

public class Solve6 {

	public static void main(String[] args) {

		//선언
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, avr, tot= 0;
		String name, result = "";
		
		//입력
		System.out.println("이름이 뭐에요???");
		name = sc.next();
		
		System.out.println("세 과목 점수는 어떻게 됩니까?");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		avr = (num1 + num2 + num3)/3;
		tot = (num1 + num2 + num3);
		
		//조건 및 연산
		if(num1>=40 && num2>=40 && num3>=40 && avr>=60) {
			result = "합격입니다, 축하드립니다!!!";
		}
		
		//else if 를 사용
		
		
		if(num1 < 40 || num2 < 40 || num3 < 40 && avr >= 60) {
			result = "과락입니다, 아쉽네요";
		}
		
		if(avr<60) {
			result = "불합격입니다, 죄송합니다";
		}
		
		//출력
		System.out.println("이름: " + name);
		System.out.println
		("총점: " + tot + ", 평균: " + avr + ", 결과: " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
