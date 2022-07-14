/*
3. 1~3사이의 난수를 발생시켜 가위,바위,보 게임 프로그램 작성
1:가위, 2:바위, 3:보

예)
1:가위, 2:바위, 3:보 ?1
컴퓨터 :보 사람 :가위
당신이 이겼습니다
1<2<3<1
1:가위, 2:바위, 3:보 ?1
컴퓨터 :바위 사람 :가위
컴퓨터가 이겼습니다
 */

package com.day6;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Solve3 {

	public static void main(String[] args)throws IOException {
		
		//선언
		Scanner sc = new Scanner(System.in);
		
		String[] str = {"가위", "바위", "보"};
		Random rd = new Random();
		int com, user;
		
		com = rd.nextInt(3)+1;
		
		do {
			System.out.print("1: 가위, 2:바위, 3:보");
			user = sc.nextInt();
		}while(user<1||user>3);
		
		System.out.println("사람: " + str[user-1] + " 컴퓨터: " + str[com-1] );
		
		String result = "";
		
		result = "무승부 입니다.";
		
		if((user==1&&com==3) || (user>com && !(com==1 && user ==3)))
		result = "사람이 이겼습니다.";
		
		if((com==1&&user==3) || (com>user && !(user==1 && com ==3)))
			result = "컴퓨터가 이겼습니다.";
		
		System.out.println("결과: " + result);
		
	}

}

/* if(com==user)
	result = "무승부 입니다.";
else if((user+2%3))==com)
	result = "사람이 이겼습니다.";
else
	result = "컴퓨터가 이겼습니다.";

*/