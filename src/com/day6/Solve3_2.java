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

public class Solve3_2 {

	public static void main(String[] args)throws IOException {
		
		//����
		Scanner sc = new Scanner(System.in);
		
		String[] str = {"����", "����", "��"};
		Random rd = new Random();
		int com, user;
		
		com = rd.nextInt(3);
		System.out.println(str[com]);
		
		do {
			System.out.print("1: ����, 2:����, 3:��");
			user = sc.nextInt()-1;
		}while(user<0||user>2);
		
		System.out.println("���: " + str[user] + " ��ǻ��: " + str[com] );
		
		String result = "";
		
		result = "���º� �Դϴ�.";
		
		if((user==1&&com==3) || (user>com && !(com==1 && user ==3)))
		result = "����� �̰���ϴ�.";
		
		if((com==1&&user==3) || (com>user && !(user==1 && com ==3)))
			result = "��ǻ�Ͱ� �̰���ϴ�.";
		
		System.out.println("���: " + result);
		
	}

}

/* if(com==user)
	result = "���º� �Դϴ�.";
else if((user+2%3))==com)
	result = "����� �̰���ϴ�.";
else
	result = "��ǻ�Ͱ� �̰���ϴ�.";

*/