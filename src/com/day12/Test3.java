package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//������ �������� 1���� 2022�� 6�� 15�� ������
		//�⵵?2022
		//��?6
		//��?14
		//��ĥ��?100
		//������: 2022�� 6�� 14�� ȭ����
		//100�� �� : ?ymdyoil
		
		//����
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int y, m, d, a, week;

		//�Է�
		do { 
			System.out.print("�⵵?");//2022
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.print("��?");//6
			m = sc.nextInt();
		}while(m<1||m>12);
		
		do {
			System.out.print("��?");//14
			d = sc.nextInt();
		}while(d<1||d>31);

		do {
			System.out.print("������ ��ĥ ��?");//100
			a = sc.nextInt();
		}while(a<1);
		
		String[]w = {"��","��","ȭ","��","��","��","��"};

		cal.set(y, m-1, d);
		week = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("������: "+y+"��"+m+"��"+d+"��"+w[week-1]+"����");
		
		
		System.out.println(a+"�� ��: "+y+"��"+m+"��"+(d)+"��"+w[week-1]+"����");
		
	}

}
