/*6. �̸��� 3������ ������ �Է� �޾� �������ǿ� ���� ���
	-��� ������ ������ 40�� �̻��̰� ����� 60�� �̻��̸� �հ�
	-�Ѱ����̶� 40�� �̸��̰� ����� 60�� �̻��̸� ����
	-����� 60�� �̸��̸� ���հ�
 	�̸� ? ȫ�浿
	������ ���� ? 60 70 80
	�̸� : ȫ�浿
	���� : 210, ��� : 70, ���� :�հ�
 */

package com.day3;

import java.util.Scanner;

public class Solve6 {

	public static void main(String[] args) {

		//����
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, avr, tot= 0;
		String name, result = "";
		
		//�Է�
		System.out.println("�̸��� ������???");
		name = sc.next();
		
		System.out.println("�� ���� ������ ��� �˴ϱ�?");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		avr = (num1 + num2 + num3)/3;
		tot = (num1 + num2 + num3);
		
		//���� �� ����
		if(num1>=40 && num2>=40 && num3>=40 && avr>=60) {
			result = "�հ��Դϴ�, ���ϵ帳�ϴ�!!!";
		}
		
		//else if �� ���
		
		
		if(num1 < 40 || num2 < 40 || num3 < 40 && avr >= 60) {
			result = "�����Դϴ�, �ƽ��׿�";
		}
		
		if(avr<60) {
			result = "���հ��Դϴ�, �˼��մϴ�";
		}
		
		//���
		System.out.println("�̸�: " + name);
		System.out.println
		("����: " + tot + ", ���: " + avr + ", ���: " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
