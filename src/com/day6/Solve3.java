/*
3. 1~3������ ������ �߻����� ����,����,�� ���� ���α׷� �ۼ�
1:����, 2:����, 3:��

��)
1:����, 2:����, 3:�� ?1
��ǻ�� :�� ��� :����
����� �̰���ϴ�
1<2<3<1
1:����, 2:����, 3:�� ?1
��ǻ�� :���� ��� :����
��ǻ�Ͱ� �̰���ϴ�
 */

package com.day6;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Solve3 {

	public static void main(String[] args)throws IOException {
		
		//����
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] num = new int [3];
		int i, k , n=0;
		char ch;

	 	//�Է�
		System.out.print("1:����, 2:����, 3:�� "+"�߿��� ������.");
		k = sc.nextInt();
		
		//����
		num[n] = rd.nextInt(3)+1;
		while(true) {
			
		if(num[n]<k || (num[n]==3 && k==1)) {
				System.out.println("����� �̰��");
				System.out.println("��ǻ��: "+num[n] + "���: " + k);
				break;
			}
		if(num[n]>k || (num[n]==1 && k==3)) {
				System.out.println("����� ����");
				System.out.println("��ǻ��: "+num[n] + "���: " + k);
				break;
			}
		
			
		if(num[n]==k) {
				System.out.println("�����ϴ�");
			}
			
			
			

			System.out.print("�� �ҷ�? [Y/N]");
			ch = (char) System.in.read();

			if (ch != 'y' && ch != 'Y') {
				System.out.println("\n���α׷��� �����մϴ�");
				break;
			}
		}
		
	}

}
