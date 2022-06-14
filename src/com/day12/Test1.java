package com.day12;

import java.util.Calendar;
import java.util.GregorianCalendar;

//Calendar
//new date = 날짜만 가져옴


public class Test1 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();
		//class객체
		//Calendar now1 = new GregorianCalendar();
		//upcast
		
		int y = now.get(Calendar.YEAR);//년
		int m = now.get(Calendar.MONTH) + 1;//월-배열로 저장(0~11)
		//set 사용시엔 -1
		int d = now.get(Calendar.DATE);//일
		int w = now.get(Calendar.DAY_OF_WEEK);//주의 수(1~7;1=일요일)
		
		String[] week = {"일","월","화","수","목","금","토"};
		
		System.out.println(y + "-" + m + "-" + d + "\\" + week[w-1]);
		
		//말일
		int startDay = now.getActualMinimum(Calendar.DATE);
		int endDay = now.getActualMaximum(Calendar.DATE);
		
		System.out.println(startDay + ":" + endDay);
		
		//현재 날짜와 시간
		System.out.printf("%tF %tT\n",now,now);
		System.out.printf("%tF\n",now);
		System.out.printf("%tT\n",now);
		System.out.printf("%1$tF %1$tT\n",now);
		//1$인수 하나로 2개값에 사용 %뒤에 사용
		
		now.set(2023, 10-1, 10);
		y = now.get(Calendar.YEAR);
		m = now.get(Calendar.MONTH) + 1;
		d = now.get(Calendar.DATE);
		w = now.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(y + "-" + m + "-" + d + "\\" + week[w-1]);		
		
	}

}
