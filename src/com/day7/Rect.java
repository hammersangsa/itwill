package com.day7;

import java.util.Scanner;

//��ǹ�
public class Rect {
//��Ƽ�� ����

	int w, h; // ��������,instance����
	// ���������� �ڵ����� int�� �ʱⰪ 0�� ������
	// ������ ���������� �ʱ�ȭ�� �ؾ���.

	public void input() {
		// void �ڸ����� property�μ� ��ȯ�� �ڸ��� �´�.
		// input(�Ű����� �ڸ�)

		Scanner sc = new Scanner(System.in);
		// ��ĳ�ʶ�� Ŭ������ sc�� ���� ���� //system.in=������
		// int w,h; //��������(local)

		System.out.print("����?");
		w = sc.nextInt();

		System.out.print("����?");
		h = sc.nextInt();

		// return;�� void�� ��������ν� ����

	}

	// ���� ���ϱ�
	public int area() {

		int result;

		result = w * h;

		return result;
		// int�� ���·� ȣ���� ������ �ǵ��ư�
		// ��ȯ���� ���� ������ �ʿ��� ex) int a

	}

	// �ѷ�
	public int length() {

		return (w + h) * 2;
		// �����ϸ� �����ϰ� return������ �ٷ� ���
		// ���� �� ����� ���

	}

	// ���
	public void print(int a, int l) {

		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
		System.out.println("�ѷ�: " + l);

	}

}
