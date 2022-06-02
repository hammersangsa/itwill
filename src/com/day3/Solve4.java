/*4. 년도를 입력받고, 윤년인지 아닌지를 출력.
	예) 2010 입력시 -> 2010 => 평년
	    2012 입력시 -> 2012 => 윤년
 */
    
package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve4 {

	public static void main(String[] args) throws IOException {

		//선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int year = 0;
		
		//입력
		System.out.println("연도를 입력하세요");
		
		year = Integer.parseInt(br.readLine());
		
		String str;
		
		//연산
		str = year % 4==0 && year%100!=0 || year % 400 == 0 ? "윤년" : "평년";
		
		//출력
		System.out.println(year + "년은 " + str + "입니다.");
		
	}

}
