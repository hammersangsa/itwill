package com.day12;

import java.util.Calendar;
import java.util.GregorianCalendar;

//Calendar
//new date = ��¥�� ������


public class Test1 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		//class��ü
		//Calendar now1 = new GregorianCalendar();
		//upcast
		
		int y = now.get(Calendar.YEAR);//��
		int m = now.get(Calendar.MONTH) + 1;//��-�迭�� ����(0~11)
		//set ���ÿ� -1
		int d = now.get(Calendar.DATE);//��
		int w = now.get(Calendar.DAY_OF_WEEK);//���� ��(1~7;1=�Ͽ���)
		
		String[] week = {"��","��","ȭ","��","��","��","��"};
		
		System.out.println(y + "-" + m + "-" + d + "\\" + week[w-1]);
		
		//����
		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(startDay + ":" + endDay);
		
		//���� ��¥�� �ð�
		System.out.printf("%tF %tT\n",now,now);
		System.out.printf("%tF\n",now);
		System.out.printf("%tT\n",now);
		System.out.printf("%1$tF %1$tT\n",now);
		//1$�μ� �ϳ��� 2������ ��� %�ڿ� ���
		
		now.set(2023, 10-1, 10);
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y + "-" + m + "-" + d + "\\" + week[w-1]);		
		
	}

}
