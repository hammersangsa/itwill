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
		Calendar now = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		
		String[] yoil = {"��","��","ȭ","��","��","��","��"};
		
		int y,m,d,i,w,nal;
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
			nal = sc.nextInt();
		}while(nal<1);
		
		now.set(y,m-1,d);
		
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("������: %d�� %d�� %d�� %s����\n",
				y,m,d,yoil[w-1]);
		
		now.add(Calendar.DATE,nal);
		
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d�� ��: %d�� %d�� %d�� %s����\n",
				nal,y,m,d,yoil[w-1]);
	}

}
/*int y, m, d, a, week;

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

cal.add(d, a);

cal.set(y, m-1, d+a);
week = cal.get(Calendar.DAY_OF_WEEK);


System.out.println(a+"�� ��: "+y+"��"+m+"��"+(d+a)+"��"+w[week-1]+"����");
*/