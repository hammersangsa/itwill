package com.health;

import java.util.Scanner;

public class Health {

	//Heap�� �����ϰ��� �ϴ� �ϳ��� ū Ʋ
	Scanner sc = new Scanner(System.in);
	
	int mem;
	//��� ����
	Info[] fo;
	//����� ������ �������� ū Ʋ

	public void set() {
	//�⺻ Ʋ
		do {
			System.out.print("mem?");
			mem = sc.nextInt();
		}while(mem<1||mem>5);
		//����� ����
		
		fo = new Info[mem];
		//��� ����ŭ ��ü ����
	}
	
	public void input() {
	//�����Է´ܰ�
		String[] record = {"key?", "kg?", "age?"};
		//����ؾ��ϴ� ������ �迭�� ó��
		for(int i=0;i<mem;i++) {
			//�ݺ�
			fo[i] = new Info();
			System.out.print("name?");
			fo[i].name = sc.next();
		
			for(int j=0;j<3;j++) {
				//record�� ������ �ݺ�
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