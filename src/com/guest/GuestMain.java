package com.guest;

import java.util.Scanner;

import com.db.DBConn;

public class GuestMain {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int ch;
		
		Guest ob = new Guest();
		
		while(true) {
			
			do {
				System.out.print("1.ȸ������ 2.�����ۼ� 3.���ϼ��� 4.���� " +
						"5.��ü ��� 6.���̵�˻� 7.����: ");
				
				ch=sc.nextInt();
			}while(ch<1||ch>6);
			
			switch(ch) {
			case 1: ob.insert();break;
			case 2: ob.write(null);break;
			case 3: ob.update();break; 
			case 4: ob.delete();break;
			case 5: ob.selectAll();break;
			default:
				DBConn.close();
				System.exit(0);
			}
			
		}
	}

}
