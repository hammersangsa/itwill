package com.Project1;

// 두번째 대출할떄 책목록 누적되서 나오는거 -예술이랑 과학이랑 10개
// 두번째 사람 등록하고 대출할때 정보 없다고 종료되는거


import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BookServiceMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BookServiceImpl bs = new BookServiceImpl();

		int ch;
		System.out.println("	##:::::'##:'########:'##::::::::'######:::'#######::'##::::'##:'########:");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		
		System.out.println("	##:'##: ##: ##.....:: ##:::::::'##... ##:'##.... ##: ###::'###: ##.....::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println("	##: ##: ##: ##::::::: ##::::::: ##:::..:: ##:::: ##: ####'####: ##:::::::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println("	##: ##: ##: ######::: ##::::::: ##::::::: ##:::: ##: ## ### ##: ######:::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println("	##: ##: ##: ##...:::: ##::::::: ##::::::: ##:::: ##: ##. #: ##: ##...::::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println("	##: ##: ##: ##::::::: ##::::::: ##::: ##: ##:::: ##: ##:.:: ##: ##:::::::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println(" 	###. ###:: ########: ########:. ######::. #######:: ##:::: ##: ########:");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		System.out.println("	:...::...:::........::........:::......::::.......:::..:::::..::........::");
		try {
			Thread.sleep(400);
		} catch (Exception e) {

		}
		while (true) {

			do {
				System.out.println("");
				System.out.println("**************************************************************************************");
				System.out.println("*                                                                                    *");
				System.out.println("*                                                                                    *");
				System.out.println("*                                                                                    *");
				System.out.println("*                                 도서 대출 시스템                                   *");
				System.out.println("*                                                                                    *");
				System.out.println("*                                                                                    *");
				System.out.println("*                                                                                    *");
				System.out.println("*                                                                                    *");
				System.out.println("**************************************************************************************");
				System.out.println("");
				System.out.println("                        ┎-----------------------------┓");
				System.out.println("                        ┃            [메뉴]           ┃");
				System.out.println("                        ┞-----------------------------┩");
				System.out.print("                        ┃1.회원 정보 등록             ┃ \n                        ┃2.회원 검색                  ┃\n                        ┃3.대출하기                   ┃\n                        ┃4.반납하기                   ┃" + "\n                        ┃5.도서 등록                  ┃"
						+ "\n                        ┃6.도서 삭제                  ┃ \n                        ┃7.도서 추천                  ┃\n                        ┃8.전체 회원                  ┃\n                        ┃9.도서 판매                  ┃\n                        ┃10.종료                      ┃");
				System.out.print("\n                        ┗-----------------------------┚\n");
				System.out.print("                         원하시는 번호를 입력하세요:  ");
				ch = sc.nextInt();

				
			} while (ch < 1);

			switch (ch) {
			case 1: bs.input(); break;
			case 2: bs.findTel(); break;
			case 3: bs.loan(); break;
			case 4: bs.delete1(); break;
			case 5: bs.add(); bs.list(); break;
			case 6: bs.delete2(); bs.list(); break;
			case 7: 
				bs.recommend1();
				bs.start();
				try {
					bs.join();
				} catch (Exception e) {
					// TODO: handle exception }
				}
				bs.recommend2();
				break;
			
			case 8: bs.print(); break;
			case 9: bs.booksell(); break;
			default:
				System.out.println("");
				System.out.println("                             프로그램을 종료합니다.");
				System.exit(0);
			}
		}

	}
}

