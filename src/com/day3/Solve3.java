/*3. �� ���� ������ �Է� �ް�, 
  ���� ū ���ڿ� ���� ���� ���ڸ� �����ؼ� ���.(if�� �̿�)
	��) 20, 30, 40, 50 �Է½� -> ���� ū ���� 50, ���� ���� ���� 20
 */
package com.day3;

import java.util.Scanner;

public class Solve3 {

	public static void main(String[] args) {
		
		//����
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4, temp;
		
		//�Է�
		System.out.println("���� �װ� ����");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		num4 = sc.nextInt();
		
		//����
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if(num3 < num4) {
			temp = num3;
			num3 = num4;
			num4 = temp;
		}
		
		if(num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		if(num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		if(num2 < num3) {
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		
		//���
		System.out.println("Max: " + num1 + " Min: " + num4 );
	}

}
//max �� min�� ���� Ǯ�� ����