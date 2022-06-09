package com.score2;

import java.util.Scanner;

public class Score1 {
	
	Scanner sc = new Scanner(System.in);
	//공용
	int inwon;
	//세팅값의 전역변수 설정
	Record1[] rec;
	//Record1이라는 클래스 호출
	
	public void set() {
	//만들어야할 틀이 몇개냐?	
		do {
			System.out.println("Num?");
			inwon = sc.nextInt();
			
		}while(1>inwon||10<inwon);
		
		rec = new Record1[inwon];
		//rec라는 주소에 Record1의 클래스를 inwon수만큼 생성하겠다.
		//세팅완료
	}
	
	public void input() {
	//넣어야할 값은?
		
		String[] title = {"kor?", "eng?", "mat?"}; 
		
		for(int i=0;i<inwon;i++) {
			rec[i] = new Record1();
			System.out.println("Name?");
			rec[i].name = sc.next();
			
			for(int j=0;j<3;j++) {
				System.out.print(title[j]);
				rec[i].score[j] = sc.nextInt();
				rec[i].tot +=rec[i].score[j];
			}
			rec[i].avr = rec[i].tot/3;
		}
	}
	
	public void print(String pan) {
		
		for(int i=0;i<inwon;i++) {
			System.out.printf("%6s", rec[i].name);
			
			for(int j=0;j<3;j++) {
				if(rec[i].score[j]>=90) {
					pan = "A";
				}else if(rec[i].score[j]>=80) {
					pan = "B";
				}else if(rec[i].score[j]>=70) {
					pan = "C";
				}else if(rec[i].score[j]>=60) {
					pan = "D";
				}else
					pan = "E";
	
				System.out.printf("%4d(%s)", rec[i].score[j], pan);
			}
			
			System.out.printf("%4d", rec[i].tot);
			System.out.printf("%4d", rec[i].avr);

		}
	
	}
	
}
