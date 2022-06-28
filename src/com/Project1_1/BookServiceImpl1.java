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

		System.out.println("\n ȸ�����");

		try {

			BookServiceVO1 vo = new BookServiceVO1(null, null, null);

			System.out.println("");
			System.out.println("****************************************");
			System.out.print("*   ����� �г��� �Է��� �ּ��� : ");
			vo.setGrade(sc.nextInt());

			System.out.print("*   ����� �̸��� �Է��� �ּ��� : ");
			vo.setName(sc.next());

			System.out.print("*   ȸ����ȣ 4�ڸ��� �Է����ּ��� : ");
			vo.setTel(sc.next());

			lists.add(vo);

			System.out.println("****************************************");
			System.out.println("               ��ϿϷ�!");

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

		System.out.println("\nȸ�� �α���");
		String name, num;

		try {
			System.out.println("�̸�?");
			name = sc.next();

			System.out.println("ȸ����ȣ?");
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
		System.out.print("*   �����Ͻ� ȸ���Կ� �̸�? ");
		String name = sc.next();
		System.out.println("****************************************");

		while (it.hasNext()) {

			BookServiceVO1 vo = it.next();

			if (name.equals(vo.getName())) {

				lists.remove(vo);//
				System.out.println("          ���� �Ϸ�");
				// it.remove();
				break;

			}
		}

	}

	@Override
	public void findTel() {

		System.out.println("****************************************");
		System.out.print("* ã���� ȸ���� ��ȣ��? ");
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
