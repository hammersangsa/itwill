/*5.�ܰ� 15,800��¥�� ��ǰ�� ���� ���� �̻� ���Խ� ������ ���ݴϴ�.
	�������� ������ �����ϴ�.
	10�� �̻� -> 10%
	20�� �̻� -> 15%
	30�� �̻� -> 20%
	�Ǹűݾ��� ����غ��ϴ�.
	��) ���Լ��� 15���� ��� -> ���Լ���: 15��, �Ǹ��ѱݾ�: 213300��
 */

package com.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve5 {

	public static void main(String[] args) throws IOException {

		//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int cost, dc, ea, tot;
		
		//�Է�
		System.out.print("� �簡��!!!");
		ea = Integer.parseInt(br.readLine());
		cost = 15800;
		
		//���� �� ����
		if(ea>=30) {
			dc = 80;
		}else if(ea>=20) {
			dc = 85;
		}else if(ea>=10) {
			dc = 90;
		}else {
			dc = 0;
		}
		
		tot = cost * ea * dc / 100 ;
		
		//���
		System.out.println(tot + "���� �ְ� ��!!");
		
	}

}
