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
		Random rd = new Random();
		int[] num = new int [3];
		int i, k , n=0;
		char ch;

	 	//입력
		System.out.print("1:가위, 2:바위, 3:보 "+"중에서 고르세요.");
		k = sc.nextInt();
		
		//난수
		num[n] = rd.nextInt(3)+1;
		while(true) {
			
		if(num[n]<k || (num[n]==3 && k==1)) {
				System.out.println("당신이 이겼어");
				System.out.println("컴퓨터: "+num[n] + "당신: " + k);
				break;
			}
		if(num[n]>k || (num[n]==1 && k==3)) {
				System.out.println("당신이 졌어");
				System.out.println("컴퓨터: "+num[n] + "당신: " + k);
				break;
			}
		
			
		if(num[n]==k) {
				System.out.println("비겼습니다");
			}
			
			
			

			System.out.print("또 할래? [Y/N]");
			ch = (char) System.in.read();

			if (ch != 'y' && ch != 'Y') {
				System.out.println("\n프로그램을 종료합니다");
				break;
			}
		}
		
	}

}
