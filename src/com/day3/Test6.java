package com.day3;

import java.util.Scanner;

//Scanner : �ܶ������� ������ ����� ����
//�⺻ �ܶ��� ����

public class Test6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String name;
		int kor, eng, mat, tot;
		
		System.out.print("�̸� ���� ���� ����?");//suzi 50 60 70
	
		//sc = new Scanner(sc.next()).useDelimiter("\\s*,\\s*");
		
		name = sc.next();
		kor = sc.nextInt();
		eng = sc.nextInt();
		mat = sc.nextInt();
		tot = kor + eng + mat;
		
		System.out.println(name + ":" + tot + "��");
		
		sc.close();
	}

}
