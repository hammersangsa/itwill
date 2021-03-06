package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		//오늘을 기준으로 1일후 2022년 6월 15일 수요일
		//년도?2022
		//월?6
		//일?14
		//며칠후?100
		//만난날: 2022년 6월 14일 화요일
		//100일 후 : ?ymdyoil
		
		//선언
		Calendar now = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		
		String[] yoil = {"일","월","화","수","목","금","토"};
		
		int y,m,d,i,w,nal;
		//입력
		do { 
			System.out.print("년도?");//2022
			y = sc.nextInt();
		}while(y<1);

		do {
			System.out.print("월?");//6
			m = sc.nextInt();
		}while(m<1||m>12);

		do {
			System.out.print("일?");//14
			d = sc.nextInt();
		}while(d<1||d>31);

		do {
			System.out.print("만난지 며칠 후?");//100
			nal = sc.nextInt();
		}while(nal<1);
		
		now.set(y,m-1,d);
		
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("만난날: %d년 %d월 %d일 %s요일\n",
				y,m,d,yoil[w-1]);
		
		now.add(Calendar.DATE,nal);
		
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("%d일 후: %d년 %d월 %d일 %s요일\n",
				nal,y,m,d,yoil[w-1]);
	}

}
/*int y, m, d, a, week;

//입력
do { 
	System.out.print("년도?");//2022
	y = sc.nextInt();
}while(y<1);

do {
	System.out.print("월?");//6
	m = sc.nextInt();
}while(m<1||m>12);

do {
	System.out.print("일?");//14
	d = sc.nextInt();
}while(d<1||d>31);

do {
	System.out.print("만난지 며칠 후?");//100
	a = sc.nextInt();
}while(a<1);


String[]w = {"일","월","화","수","목","금","토"};

cal.set(y, m-1, d);
week = cal.get(Calendar.DAY_OF_WEEK);
System.out.println("만난날: "+y+"년"+m+"월"+d+"일"+w[week-1]+"요일");

cal.add(d, a);

cal.set(y, m-1, d+a);
week = cal.get(Calendar.DAY_OF_WEEK);


System.out.println(a+"일 후: "+y+"년"+m+"월"+(d+a)+"일"+w[week-1]+"요일");
*/