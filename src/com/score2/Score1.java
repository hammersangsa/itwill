package com.score2;

import java.util.Scanner;

public class Score1 {
	
	Scanner sc = new Scanner(System.in);
	//����
	int inwon;
	//���ð��� �������� ����
	Record1[] rec;
	//Record1�̶�� Ŭ���� ȣ��
	
	public void set() {
	//�������� Ʋ�� ���?	
		do {
			System.out.println("Num?");
			inwon = sc.nextInt();
			
		}while(1>inwon||10<inwon);
		
		rec = new Record1[inwon];
		//rec��� �ּҿ� Record1�� Ŭ������ inwon����ŭ �����ϰڴ�.
		//���ÿϷ�
	}
	
	public void input() {
	//�־���� ����?
		
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
	
	private String panjung(int jumsu) {
		
		String pan;
		
		switch(jumsu/10) {
		
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
	
	
	
	
	
	public void print() {
		
		for(int i=0;i<inwon;i++) {
			System.out.printf("%6s", rec[i].name);
			
			for(int j=0;j<3;j++) {
				/*if(rec[i].score[j]>=90) {
					pan = "A";
				}else if(rec[i].score[j]>=80) {
					pan = "B";
				}else if(rec[i].score[j]>=70) {
					pan = "C";
				}else if(rec[i].score[j]>=60) {
					pan = "D";
				}else
					pan = "E";
			 */
				System.out.printf("%4d(%s)", rec[i].score[j], panjung(rec[i].score[j]));
			}//�ڵ� �ȿ��� �޼ҵ带 ȣ���Ͽ� ��밡��
			
			System.out.printf("%4d", rec[i].tot);
			System.out.printf("%4d", rec[i].avr);

		}
	
	}
	
}
