package com.score1;

import java.util.Scanner;

//�ν��Ͻ� ����
public class Score {

	int inwon;
	//�迭�� ����ϸ� �Ѱ��� �����Ͱ� �������� ��
	Scanner sc = new Scanner(System.in);
	//������ ����
	Record[] rec ;
	//Record ������ �����Ͱ� ����.
	//int���� �����Ϳ� a�� ���� ��ó��
	//Record ���¿� rec��� �����Ͱ� ����
	//rec���� String�� 1���� ���� ������ ���� �����Ͱ� ���尡��
	//�迭�� ����ϸ� �������� �����Ͱ� �������� ��
	
	//�迭 �ȿ� Ŭ������ �������
	//��� Heap �ȿ� �����Ͱ� ����Ǿ��ٰ� ȣ��Ǵ°��̴�.
	//Ŭ���� �ȿ� n���� ������ �־��
	//Ŭ������� Ʋ�� ����
	
	//�⺻ ��ȯ���� void�� �����ϰ� ����
	public void set() {
		//����
		
		do {
			System.out.print("�ο���?");//3
			inwon = sc.nextInt();
		}while(inwon<1||inwon>10);
		
		rec = new Record[inwon];
		//�迭�� ����
	}
	
	public void input() {
		
		String[] title = {"kor?", "eng?", "mat?"};
		
		
		for(int i=0;i<inwon;i++) {
		
			rec[i] = new Record();
			//new Record �� �ݺ��� ���� ���;���
			System.out.print("name?");//ds
			rec[i].name = sc.next();
			
			for(int j=0;j<3;j++) {
			
				System.out.print(title[j]);//30
				rec[i].score[j] = sc.nextInt();
				//title�̶�� �迭�� ���� �ݺ� ����
				
				rec[i].tot += rec[i].score[j];
			}
			
			rec[i].avr = rec[i].tot/3;

		}
		
	}
	
	private void ranking() {
		
		int i, j;
		//rank �ʱ�ȭ
		for(i=0;i<inwon;i++) {
			rec[i].rank = 1;
		}
		
		for(i=0;i<inwon-1;i++) {
			for(j=i+1;j<inwon;j++) {
				
				if(rec[i].tot>rec[j].tot)
					rec[j].rank++;
				else if(rec[i].tot<rec[j].tot)
					rec[i].rank++;
			}//i,j���� rec[i,j].tot�θ� ����
		}
		
	}
	
	public void print() {
		
	}
	
	
	
	
}
