package com.health;

import java.util.Scanner;

public class Health {

	//Heap에 저장하고자 하는 하나의 큰 틀
	Scanner sc = new Scanner(System.in);
	
	int mem;
	//멤버 변수
	Info[] fo;
	//멤버의 정보를 보기위한 큰 틀

	public void set() {
	//기본 틀
		do {
			System.out.print("mem?");
			mem = sc.nextInt();
		}while(mem<1||mem>5);
		//멤버수 정의
		
		fo = new Info[mem];
		//멤버 수만큼 객체 생성
	}
	
	public void input() {
	//정보입력단계
		String[] record = {"key?", "kg?", "age?"};
		//기록해야하는 정보를 배열로 처리
		for(int i=0;i<mem;i++) {
			//반복
			fo[i] = new Info();
			System.out.print("name?");
			fo[i].name = sc.next();
		
			for(int j=0;j<3;j++) {
				//record의 내용을 반복
				System.out.println(record[j]);
				fo[i].info[j] = sc.nextDouble();
			}
			
			fo[i].cbmi = fo[i].info[1]/(fo[i].info[0]*fo[i].info[0])*10000;
		}
		
	}
	
	public void print() {
		
		for(int i=0;i<mem;i++) {
			System.out.printf("%6s", fo[i].name);
			
			for(int j=0;j<3;j++) {
				System.out.printf("\t%.1f", fo[i].info[j]);
			}
			
			System.out.printf("\t%.2f", fo[i].cbmi);
			
			if(18.5<=fo[i].cbmi && 22.9>=fo[i].cbmi)
				System.out.print(" Health");
			else
				System.out.print(" UnHealth");

		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}