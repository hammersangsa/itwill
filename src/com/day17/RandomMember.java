package com.day17;

import java.util.Random;
import java.util.Scanner;

class SelectMember extends Thread{
	
	Scanner sc = new Scanner(System.in);
	
	private int saram;
	private static String[] name = 
		{"������","�ȼ���","����","�輺��","���ٿ�",
		"������","�̵���","������","��ȫ��","������",
		"������","������","�ڼ���","������","��â��",
		"�����","������","�ڼ���","������","�ɹ���",
		"��ä��","�迵��","�Ƚÿ�","������","�ڼ���",
		"������","������"};
	
	@Override
	public void run() {
		Random rd = new Random();
		
		System.out.print("��ǥ�ڴ� ����Դϱ�???");//5
		saram = sc.nextInt();
	
		System.out.print("�����");
		for(int i=1;i<=7;i++) {
			System.out.print(".");
			
			try {
				Thread.sleep(100);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println();
		System.out.println("---------------------");
		System.out.println("��ǥ�� �����մϴ�!!!");
		int j=0;
		while(j<saram) {
			 name[j]= name[rd.nextInt(27)];
			
			for(int k=0;k<saram;k++) {
				if(name[j]==(name[k])) {
					j--;
				}
			}
			System.out.print((j+1) + "�� ��ǥ�� :" +name[j]  + "\n");
		}
		
	}
}

public class RandomMember {

	public static void main(String[] args) {
	
		Thread t = new Thread(new SelectMember());
		
		t.start();
		
		try {
			t.join();
		} catch (Exception e) {
			
		}
		
	}

}
