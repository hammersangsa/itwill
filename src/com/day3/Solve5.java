/*5.단가 15,800원짜리 상품을 일정 수량 이상 구입시 할인을 해줍니다.
	할인율은 다음과 같습니다.
	10개 이상 -> 10%
	20개 이상 -> 15%
	30개 이상 -> 20%
	판매금액을 계산해봅니다.
	예) 구입수량 15개인 경우 -> 구입수량: 15개, 판매총금액: 213300원
 */

package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve5 {

	public static void main(String[] args) throws IOException {

		//선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int cost, dc, ea, tot;
		
		//입력
		System.out.print("몇개 사가게!!!");
		ea = Integer.parseInt(br.readLine());
		cost = 15800;
		
		//조건 및 연산
		if(ea>=30) {
			dc = 80;
		}else if(ea>=20) {
			dc = 85;
		}else if(ea>=10) {
			dc = 90;
		}else {
			dc = 0;
		}
		
		tot = cost * ea * dc / 100 ;
		
		//출력
		System.out.println(tot + "원만 주고 가!!");
		
	}

}
