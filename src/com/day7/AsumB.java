package com.day7;

import java.util.Scanner;

public class AsumB {
	//����
	int n, max, min;
	int sum;
	
	Scanner sc = new Scanner(System.in);
	
	//�Է�
	public void input() {
		System.out.println("�� ���� �Է��ϼ���");
		max = sc.nextInt();
		min = sc.nextInt();
	}
	
	//����
	public int Sum() {
		if (max < min) {
			int temp = min;
			min = max;
			max = temp; 
		}
		for (int i = min; i <= max; i++) {
			sum += i;
		}
		return sum;
	}
	
	//���
	public void print(int sum) {
		System.out.println(min + "���� " + max + "���� ���ϸ� " + sum + "�Դϴ�.");
	}
}
