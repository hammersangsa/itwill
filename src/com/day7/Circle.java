package com.day7;

import java.util.Scanner;

public class Circle {

	//����
	int r;
	float area, length;
		
	//�Է�
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ���");
		r=sc.nextInt();
	}
	//����
	public float area() {
		
		return (r*r*3.14f);
	}
		
	public float length() {
			
		return (2*r*3.14f);

	}
	//���
	public void print(float area, float length) {
		System.out.println("����: " + area + "�ѷ�: " + length);
	}
		
}