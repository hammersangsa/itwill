package com.day5;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//��(y), ��(m), ��(d)
		//2022�� 6�� 2�� �����
		//�迭�� ����޷�
				Scanner sc = new Scanner(System.in);
				
				int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
				
				int y, m, d, nalsu, i, week;
				
				do {
					System.out.print("�⵵?");//2022
					y = sc.nextInt();
				}while(y<1);
				
				//y���� �������� Ȯ��
				if(y%4==0 && y%100!=0 || y%400==0) {
					months[1] = 29;
				}
				
				do {
					System.out.print("��?");//6
					m = sc.nextInt();
				}while(m<1||m>12);
				
			
				do {
					System.out.println("��?");//��
					d = sc.nextInt();
				}while(d<1||d>months[m-1]);//ex)2��31��
				
				//1��1�� ���� (y-1)�� 12��31�ϱ����� ������ 
				nalsu = (y-1)*365 + (y-1)/4-(y-1)/100+(y-1)/400;
				
				//int yy= (y-1)/4-(y-1)/100+(y-1)/400;
				//System.out.println(nalsu);
				//System.out.println(yy);
				
				//(m-1)�� ������ ����
				//��(m)	:	1  2  3  4  5  6  7  8  9 10 11 12
				//months: {31,28,31,30,31,30,31,31,30,31,30,31};
				//intex :   0  1  2  3  4  5  6  7  8  9 10 11
				for(i=0;i<m-1;i++) {
					nalsu += months[i];
				}
				
				//System.out.println(nalsu);
				//m��1���� ������ ���Ѵ�
				nalsu+=d; //nalsu= nalsu+1;
				
				week = nalsu % 7;
			
				String yoil[] = {"��", "��", "ȭ", "��", "��", "��", "��"};
				
				System.out.printf("%d�� %d�� %d�� %s����", y,m,d,yoil[week]);
			
				/*if(week==0) 
				System.out.println("��");
			if(week==1) 
				System.out.println("��");
			if(week==2) 
				System.out.println("ȭ");
			if(week==3) 
				System.out.println("��");
			if(week==4) 
				System.out.println("��");
			if(week==5) 
				System.out.println("��");
			if(week==6) 
				System.out.println("��");
			*/
		
	}

}
