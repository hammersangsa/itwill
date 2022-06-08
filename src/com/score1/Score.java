package com.score1;

import java.util.Scanner;

//인스턴스 변수
public class Score {

	int inwon;
	//배열을 사용하면 한개의 데이터가 여러곳에 들어감
	Scanner sc = new Scanner(System.in);
	//복도로 꺼냄
	Record[] rec ;
	//Record 형태의 데이터가 들어간다.
	//int형의 데이터에 a가 들어가는 것처럼
	//Record 형태에 rec라는 데이터가 들어간다
	//rec에는 String값 1개와 같은 여러개 값의 데이터가 저장가능
	//배열을 사용하면 여러개의 데이터가 여러곳에 들어감
	
	//배열 안에 클래스를 집어넣음
	//사실 Heap 안에 데이터가 저장되었다가 호출되는것이다.
	//클래스 안에 n개의 데이터 넣어둠
	//클래스라는 틀을 제작
	
	//기본 반환값은 void로 설정하고 시작
	public void set() {
		//선언
		
		do {
			System.out.print("인원수?");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		rec = new Record[inwon];
		//배열을 생성
	}
	
	public void input() {
		
		String[] title = {"kor?", "eng?", "mat?"};
		
		
		for(int i=0;i<inwon;i++) {
		
			rec[i] = new Record();
			//new Record 도 반복문 내로 들어와야함
			System.out.print("name?");//ds
			rec[i].name = sc.next();
			
			for(int j=0;j<3;j++) {
			
				System.out.print(title[j]);//30
				rec[i].score[j] = sc.nextInt();
				//title이라는 배열을 통해 반복 가능
				
				rec[i].tot += rec[i].score[j];
			}
			
			rec[i].avr = rec[i].tot/3;

		}
		
	}
	
	private void ranking() {
		
		int i, j;
		//rank 초기화
		for(i=0;i<inwon;i++) {
			rec[i].rank = 1;
		}
		
		for(i=0;i<inwon-1;i++) {
			for(j=i+1;j<inwon;j++) {
				
				if(rec[i].tot>rec[j].tot)
					rec[j].rank++;
				else if(rec[i].tot<rec[j].tot)
					rec[i].rank++;
			}//i,j에서 rec[i,j].tot로만 변함
		}
		
	}
	
	public void print() {
		
	}
	
	
	
	
}
