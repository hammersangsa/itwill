package com.score3;

import java.util.Scanner;

public class ScoreImpl implements Score{

	private int inwon;
	private Record[] rec;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void set() {
	
		do {
			System.out.println("인원 수?");//5
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		rec = new Record[inwon];
		
	}

	@Override
	public void input() {
		
		for(int i=0;i<inwon;i++) {
			
			rec[i] = new Record();
			
			System.out.println("학번?");
			rec[i].hak = sc.next();
			
			System.out.println("이름?");
			rec[i].name = sc.next();
			
			System.out.println("국어?");
			rec[i].kor = sc.nextInt();
			
			System.out.println("영어?");
			rec[i].eng = sc.nextInt();
			
			System.out.println("수학?");
			rec[i].mat = sc.nextInt();
			
			rec[i].tot = rec[i].kor + rec[i].eng + rec[i].mat;
			
			rec[i].avr = rec[i].tot / 3;
		}
		
	}

	private String panjung(int score) {
		
		String pan;
		
		switch(score/10) {
		
		case 10:
		
		case 9:
			pan = "A";break;
		case 8:
			pan = "B";break;
		case 7:
			pan = "C";break;
		case 6:
			pan = "D";break;
		default:
			pan = "E";break;
		}
		return pan;
		
		
		
	}
	
	@Override
	public void print() {
		
		for(int i=0;i<inwon;i++) {
			System.out.printf("%6s %6s %4d(%s) %4d(%s) %4d(%s) %4d %4d\n",
				rec[i].hak, rec[i].name, 
				rec[i].kor,panjung(rec[i].kor),
				rec[i].eng,panjung(rec[i].eng),
				rec[i].mat,panjung(rec[i].mat),
				rec[i].tot,rec[i].avr);
		
		}
	}

}
