/*1.������ �Է� �޾Ƽ� ¦��, Ȧ���� �����ؼ� ���.
	��) 3 �Է½� -> 3 => Ȧ��
	��) 4 �Է½� -> 4 => ¦��
*/

package com.day3;

import java.util.Scanner;

public class Solve1 {

	public static void main(String[] args) {

		//����
		Scanner sc = new Scanner(System.in);
		int num = 0;
		String str = "";
		
		//�Է�
		System.out.print("���ڸ� �Է����ּ���.");
		num = sc.nextInt();
		
		//����		
		if(num%2==0) {
			str = "even";
		}else {
			str = "odd";
		}
		//���
		System.out.print(num + " is " + str );
	}

}
