package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//년(y), 월(m), 일(d)
		//2022년 6월 2일 목요일
		//배열로 만년달력
				Scanner sc = new Scanner(System.in);
				
				int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
				
				int y, m, d, nalsu, i, week;
				
				do {
					System.out.print("년도?");//2022
					y = sc.nextInt();
				}while(y<1);
				
				//y년이 윤년인지 확인
				if(y%4==0 && y%100!=0 || y%400==0) {
					months[1] = 29;
				}
				
				do {
					System.out.print("월?");//6
					m = sc.nextInt();
				}while(m<1||m>12);
				
			
				do {
					System.out.println("일?");//목
					d = sc.nextInt();
				}while(d<1||d>months[m-1]);//ex)2월31일
				
			
				//1년1일 부터 (y-1)년 12월31일까지의 날수를 
				nalsu = (y-1)*365 + (y-1)/4-(y-1)/100+(y-1)/400;
				
				//int yy= (y-1)/4-(y-1)/100+(y-1)/400;
				//System.out.println(nalsu);
				//System.out.println(yy);
				
				//(m-1)월 까지의 날수
				//월(m)	:	1  2  3  4  5  6  7  8  9 10 11 12
				//months: {31,28,31,30,31,30,31,31,30,31,30,31};
				//intex :   0  1  2  3  4  5  6  7  8  9 10 11
				for(i=0;i<m-1;i++) {
					nalsu += months[i];
				}
				
				//System.out.println(nalsu);
				//m월1일의 날수를 구한다
				nalsu+=d; //nalsu= nalsu+1;
				
				week = nalsu % 7;
			
				String yoil[] = {"일", "월", "화", "수", "목", "금", "토"};
				
				System.out.printf("%d년 %d월 %d일 %s요일", y,m,d,yoil[week]);
				
				/*if(week==0) 
				System.out.println("일");
			if(week==1) 
				System.out.println("월");
			if(week==2) 
				System.out.println("화");
			if(week==3) 
				System.out.println("수");
			if(week==4) 
				System.out.println("목");
			if(week==5) 
				System.out.println("금");
			if(week==6) 
				System.out.println("토");
			*/
		
	}

}
