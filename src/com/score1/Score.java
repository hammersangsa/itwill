package com.score1;

import java.util.Scanner;

//�ν��Ͻ� ����
public class Score {
	Scanner sc = new Scanner(System.in);
	//������ ����
	
	int inwon;//protected ���� ������ ������ private���� ������
	//public�� ���� ���� ����
	//�迭�� ����ϸ� �Ѱ��� �����Ͱ� �������� ��
	
	Record[] rec ;
	//Record ������ �����Ͱ� ����.
	//int���� �����Ϳ� a�� ���� ��ó��
	//Record ���¿� rec��� �ڷ��������Ͱ� ����
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
		
		String[] title = {"kor?", "eng?", "mat?"};//�迭�� ���� �ݺ��� ���
		
		
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
	
	private void ranking() {//������ ����/������� ��밡��
		
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
		
		ranking();//method���� method�� ȣ���� �� �ִ�.
		//=print �ȿ��� private�� ranking method�� ȣ��
		
		for(int i=0;i<inwon;i++) {
			System.out.printf("%6s", rec[i].name);
			
			for(int j=0;j<3;j++) {
				System.out.printf("%4d", rec[i].score[j]);
			}
			
			System.out.printf("%4d", rec[i].tot);
			System.out.printf("%4d", rec[i].avr);
			System.out.printf("%4d\n", rec[i].rank);

		}
		
	}
	
	
	
	
}
