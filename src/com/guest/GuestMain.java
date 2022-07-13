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
				System.out.print("1.회원가입 2.방명록작성 3.방명록수정 4.삭제 " +
						"5.전체 출력 6.아이디검색 7.종료: ");
				
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
