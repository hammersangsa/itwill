package com.day12;

import java.util.Calendar;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		//만년달력
		Calendar cal = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		
		int y,m,i,week;
		
		do {
			System.out.print("년도?");
			y = sc.nextInt();
		}while(y<1);
		
		do {
			System.out.println("월?");
			m = sc.nextInt();
		}while(m<1||12<m);
		
		cal.set(y, m-1, 1);
		
		week = cal.get(Calendar.DAY_OF_WEEK);
		
		
		
		//출력
		String[] w = {"일","월","화","수","목","금","토"};
		
		//System.out.printf("%d-%d\\%s",y,m,w[week-1]);
		System.out.println("\n  일  월  화  수  목  금  토");
		System.out.println("------------------------------");
		
		for(i=1;i<week;i++) {
			System.out.println("   ");
		
		
			for(i=1;i<=cal.getActualMinimum(Calendar.DATE);i++) {
				
				System.out.printf("%4d", i);
				
				week++;
				
				if(week%7==1)
					System.out.println();
			
			}
			
			if(week%7!=1)
				System.out.println();
			
			System.out.println("-----------------------------");
		}
	}

}
