/*2.�� ���� ������ �Է� �ް�, 
 ū ���ڿ� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
	��) 20, 30 �Է½� -> ū ���� 30, ���� ���� 20
*/

package com.day3;

import java.util.Scanner;

public class Solve2 {

	public static void main(String[] args) {

		//����
		Scanner sc = new Scanner(System.in);
		int num1, num2, temp;
		
		//�Է�
		System.out.printf("���� �ΰ��� �Է��ϼ���.");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		//����
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		//���
		System.out.println("ū ����: " + num1 + " ���� ����: " + num2);
		
	}

}
