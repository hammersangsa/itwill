package com.Project1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class BookServiceImpl implements BookService {

	HashMap<String, BookServiceVO> hMap = new HashMap<String, BookServiceVO>();

	Scanner sc = new Scanner(System.in);

	@Override
	public void munhak() {
		HashMap<String, BookServiceVO> hMap = new HashMap<String, BookServiceVO>();
		hMap.put("m1", new BookServiceVO("m1", "�ҳ��� �´� :�Ѱ� ����Ҽ�", "�Ѱ�"));
		hMap.put("m2", new BookServiceVO("m2", "�ٱ��� ���� :��ֶ� �Ҽ�", "��ֶ�"));
		hMap.put("m3", new BookServiceVO("m3", "���̾� ��ȭ���� ���� :�����ó� ���̰� ����Ҽ�", "�����ó� ���̰�"));
		hMap.put("m4", new BookServiceVO("m4", "ä�������� :�Ѱ� ���ۼҼ�", "�Ѱ�"));
		hMap.put("m5", new BookServiceVO("m5", "������ ���� :�迵�� �깮", "�迵��"));

		try {
			Iterator<String> list = hMap.keySet().iterator();
			while (list.hasNext()) {

				String num = list.next();
				BookServiceVO vo = hMap.get(num);

				System.out.print("��ȣ:" + vo.getBookNum() + " ");
				System.out.print("����:[" + vo.getBookName() + "] ");
				System.out.println("����:" + vo.getAuthor());
			}

			System.out.print("\n�뿩�� å�� ��ȣ�� �Է��ϼ���: ");
			String key = sc.next();

			Iterator<String> list1 = hMap.keySet().iterator();
			while (list1.hasNext()) {

				String num = list1.next();
				BookServiceVO vo = hMap.get(num);

	   			if (vo.getBookNum().contains(key)) {
					if (vo.isLoan()) {
						System.out.println("�뿩���� �����Դϴ�");
						break;
					}
					vo.setStock(vo.getStock() - 1);
					System.out.print("\n----------------------------\n");
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
					vo.setLoan(true);
				}
				break;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void art() {
		HashMap<String, BookServiceVO> hMap1 = new HashMap<String, BookServiceVO>();
		hMap1.put("a1", new BookServiceVO("a1", "�汸�� �̼��� :������ ���ϰ� �����ϴ� ������ ���� �̼�", "������"));
		hMap1.put("a2", new BookServiceVO("a2", "(����ġ�� �������� ��õ�ϴ�) Ŭ���� ��� 20�� :�︲�� ���� ������ ������", "�ӿ���"));
		hMap1.put("a3", new BookServiceVO("a3", "�ƹ�ư, �뷡", "�̽���"));
		hMap1.put("a4", new BookServiceVO("a4", "�ƹ�ư, �ǾƳ�", "��ܿ�"));
		hMap1.put("a5", new BookServiceVO("a5", "�̰��� �÷��� top 30 ,��ȭ ��", "������"));

		try {
			Iterator<String> list = hMap1.keySet().iterator();
			while (list.hasNext()) {

				String num = list.next();
				BookServiceVO vo = hMap1.get(num);

				System.out.print("��ȣ:" + vo.getBookNum() + " ");
				System.out.print("����:[" + vo.getBookName() + "] ");
				System.out.println("����:" + vo.getAuthor());
			}

			System.out.print("\n�뿩�� å�� ��ȣ�� �Է��ϼ���: ");
			String key = sc.next();

			Iterator<String> list1 = hMap1.keySet().iterator();
			while (list1.hasNext()) {

				String num = list1.next();
				BookServiceVO vo = hMap1.get(key);

				if (vo.getBookNum().startsWith(key)) {
					if (vo.isLoan()) {
						System.out.println("�뿩���� �����Դϴ�");
						break;
					}
					vo.setStock(vo.getStock() - 1);
					System.out.print("\n----------------------------\n");
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
					vo.setLoan(true);
				}
				break;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	@Override
	public void sci() {
		HashMap<String, BookServiceVO> hMap2 = new HashMap<String, BookServiceVO>();
		hMap2.put("s1", new BookServiceVO("s1", "�̱��� ������", "��ó�� ��Ų��"));
		hMap2.put("s2", new BookServiceVO("s2", "�ڽ���:Ư����", "Į ���̰�"));
		hMap2.put("s3", new BookServiceVO("s3", "���� ���̵� :�ݰ� �޷��� �帧���� �д� �̷� ���� ����", "���ǿ�"));
		hMap2.put("s4", new BookServiceVO("s4", "������ ����������", "������"));
		hMap2.put("s5", new BookServiceVO("s5", "���� �߿����� :���ڵ��� ���� ���� �ʴ� ������ �θ� ��� ���", "������ �帶��"));

		try {
			Iterator<String> list = hMap2.keySet().iterator();
			while (list.hasNext()) {

				String num = list.next();
				BookServiceVO vo = hMap2.get(num);

				System.out.print("��ȣ:" + vo.getBookNum() + " ");
				System.out.print("����:[" + vo.getBookName() + "] ");
				System.out.println("����:" + vo.getAuthor());
			}

			System.out.print("\n�뿩�� å�� ��ȣ�� �Է��ϼ���: ");
			String key = sc.next();

			Iterator<String> list1 = hMap2.keySet().iterator();
			while (list1.hasNext()) {

				String num = list1.next();
				BookServiceVO vo = hMap2.get(key);

				if (vo.getBookNum().startsWith(key)) {
					if (vo.isLoan()) {
						System.out.println("�뿩���� �����Դϴ�");
						break;
					}
					vo.setStock(vo.getStock() - 1);
					System.out.print("\n----------------------------\n");
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
					vo.setLoan(true);
				}
				break;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void lang() {
		HashMap<String, BookServiceVO> hMap3 = new HashMap<String, BookServiceVO>();
		hMap3.put("l1", new BookServiceVO("l1", "�Žñ� �ӽñ� :�̾���� ���� �� ���� �� å�� ��", "�̾��"));
		hMap3.put("l2", new BookServiceVO("l2", "���� ��� �ൿ ǥ���� ���� :������ �ݰ��� �о�����!", "������"));
		hMap3.put("l3", new BookServiceVO("l3", "���� ��� ���� ǥ���� ���� :�˸� ���� ���� �޶����� ���� ǥ���鸸 ���!", "Jonathan Davis"));
		hMap3.put("l4", new BookServiceVO("l4", "������ 100�� �ϼ� :����ȸȭ�� ���� ������ ���ϴ¹��� ������ ���ι�", "������"));
		hMap3.put("l5", new BookServiceVO("l5", "The very hungry caterpillar", "by Eric Carle"));

		try {
			Iterator<String> list = hMap3.keySet().iterator();
			while (list.hasNext()) {

				String num = list.next();
				BookServiceVO vo = hMap3.get(num);

				System.out.print("��ȣ:" + vo.getBookNum() + " ");
				System.out.print("����:[" + vo.getBookName() + "] ");
				System.out.println("����:" + vo.getAuthor());
			}

			System.out.print("\n�뿩�� å�� ��ȣ�� �Է��ϼ���: ");
			String key = sc.next();

			Iterator<String> list1 = hMap3.keySet().iterator();
			while (list1.hasNext()) {

				String num = list1.next();
				BookServiceVO vo = hMap3.get(key);

				if (vo.getBookNum().startsWith(key)) {
					if (vo.isLoan()) {
						System.out.println("�뿩���� �����Դϴ�");
						break;
					}
					vo.setStock(vo.getStock() - 1);
					System.out.print("\n----------------------------\n");
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
					vo.setLoan(true);
				}
				break;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void select() {
		int ch;
		System.out.println("������ �帣�� �������ּ���...\n");
		do {
			System.out.print("1.���� 2.���� 3.���� 4.����");
			System.out.print("\n----------------------------\n");
			System.out.print(": ");
			ch = sc.nextInt();
		} while (ch < 1);

		switch (ch) {
		case 1:
			munhak();
			break;
		case 2:
			art();
			break;
		case 3:
			sci();
			break;
		case 4:
			lang();
			break;

		default:
			System.out.println("�ٽ��Է����ּ���");
			System.exit(0);
		}

	}

	@Override
	public void delete() {

		System.out.print("\n�ݳ��� å�� ��ȣ�� �Է����ּ���: ");
		String dnum = sc.next();
		Iterator<String> list = hMap.keySet().iterator();

		while (list.hasNext()) {
			String num = list.next();
			BookServiceVO dvo = hMap.get(num);

			if (dnum.equals(dvo.getBookNum())) {
				if (!dvo.isLoan()) {
					System.out.print("\n----------------------------\n");
					System.out.println("�뿩���� ������ �ƴմϴ�.");
				} else {
					System.out.print("\n----------------------------\n");
					System.out.println("�ݳ��� �Ϸ�Ǿ����ϴ�.");
					dvo.setStock(dvo.getStock() + 1);
					dvo.setLoan(false);
				}
			}
		}

	}

	@Override
	public void input() {
	}

	@Override
	public boolean searchBook(String list) {
		return false;
	}

	@Override
	public void print() {
	}

	@Override
	public void recommend() {
	}

	@Override
	public void findTel() {
	}

}
