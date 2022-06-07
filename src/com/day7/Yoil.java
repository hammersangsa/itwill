package com.day7;

import java.util.Scanner;

public class Yoil {

	//����
	int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	int y, m, d, nalsu, i, week;
		
	//�Է�
	public void input() {
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Year?");
		y = sc.nextInt();
		}while(y<1);
			 
		if(y%4==0 && y%100 != 0 || y%400 == 0) {
			months[1] = 29;
		}
			
		do {
		System.out.println("Month?");
		m = sc.nextInt();
		}while(m<1||m>12);
			
		do {
		System.out.println("Day?");
		d = sc.nextInt();
		}while(d<1||d>months[m-1]);
			
		}	
	//����	
	public int week() {
		
		nalsu = (y-1)*365+(y-1)/4-(y-1)/100+(y-1)/400;
		
		for(i=0;i<m-1;i++) {
			nalsu += months[i];
		}	
			
			nalsu+=d;
			week = nalsu % 7;
		
			return week;
		}
	//���
	public void print(String Yoil) {
		String[] yoil = {"Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur"};
		System.out.printf("Year: %d Month: %d Day: %d %sday", y,m,d,yoil[week]);
	}
		
}