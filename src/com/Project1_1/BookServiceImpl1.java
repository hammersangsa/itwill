package com.Project1_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BookServiceImpl1 implements BookService1 {

	private List<BookServiceVO1> lists = new ArrayList<>();

	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	String list;
	int count = 0;

	@Override
	public void input() {

		System.out.println("\n 회원등록");

		try {

			BookServiceVO1 vo = new BookServiceVO1(null, null, null);

			System.out.println("");
			System.out.println("****************************************");
			System.out.print("*   당신의 학년을 입력해 주세여 : ");
			vo.setGrade(sc.nextInt());

			System.out.print("*   당신의 이름을 입력해 주세여 : ");
			vo.setName(sc.next());

			System.out.print("*   회원번호 4자리를 입력해주세요 : ");
			vo.setTel(sc.next());

			lists.add(vo);

			System.out.println("****************************************");
			System.out.println("               등록완료!");

			return;
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public boolean searchBook(String tel) {

		return lists.contains(tel);
	}

	@Override
	public void print() {

		Iterator<BookServiceVO1> it = lists.iterator();

		while (it.hasNext()) {

			BookServiceVO1 vo = it.next();

			System.out.println(vo.toString());//

		}

	}

	@Override
	public void select() {

		System.out.println("\n회원 로그인");
		String name, num;

		try {
			System.out.println("이름?");
			name = sc.next();

			System.out.println("회원번호?");
			num = sc.next();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void recommend() {
	}

	@Override
	public void delete() {

		Iterator<BookServiceVO1> it = lists.iterator();

		System.out.println("");
		System.out.println("****************************************");
		System.out.print("*   삭제하실 회원님에 이름? ");
		String name = sc.next();
		System.out.println("****************************************");

		while (it.hasNext()) {

			BookServiceVO1 vo = it.next();

			if (name.equals(vo.getName())) {

				lists.remove(vo);//
				System.out.println("          삭제 완료");
				// it.remove();
				break;

			}
		}

	}

	@Override
	public void findTel() {

		System.out.println("****************************************");
		System.out.print("* 찾으실 회원의 번호는? ");
		String Tel = sc.next();
		System.out.println("****************************************");

		Iterator<BookServiceVO1> it = lists.iterator();

		while (it.hasNext()) {

			BookServiceVO1 vo = it.next();

			if (Tel.equals(vo.getTel())) {

				System.out.println(vo.toString());
			}
		}

	}
}
