package com.Project1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class BookServiceImpl extends Thread implements BookService {
	Scanner sc = new Scanner(System.in);

	TreeMap<String, BookServiceVO> tMap = new TreeMap<String, BookServiceVO>();
	List<StudentVO> lists = new ArrayList<>();
	String bnum;

	@Override
	public void input() {
		System.out.println("\n             [ȸ�����]");

		try {

			StudentVO vo = new StudentVO();

			System.out.println("****************************************");
			System.out.print("*   ����� �г��� �Է��� �ּ��� : ");
			vo.setGrade(sc.nextInt());

			System.out.print("*   ����� �̸��� �Է��� �ּ��� : ");
			vo.setName(sc.next());

			System.out.print("*   ȸ����ȣ 4�ڸ��� �Է����ּ��� : ");
			vo.setTel(sc.next());

			lists.add(vo);

			System.out.println("****************************************");
			System.out.println("               ��ϿϷ�!\n");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void munhak() {
		tMap.put("m1", new BookServiceVO("�ҳ��� �´� :�Ѱ� ����Ҽ�", "�Ѱ�"));
		tMap.put("m2", new BookServiceVO("�ٱ��� ���� :��ֶ� �Ҽ�", "��ֶ�"));
		tMap.put("m3", new BookServiceVO("���̾� ��ȭ���� ���� :�����ó� ���̰� ����Ҽ�", "�����ó� ���̰�"));
		tMap.put("m4", new BookServiceVO("ä�������� :�Ѱ� ���ۼҼ�", "�Ѱ�"));
		tMap.put("m5", new BookServiceVO("������ ���� :�迵�� �깮", "�迵��"));
	}

	@Override
	public void art() {
		tMap.put("a1", new BookServiceVO("�汸�� �̼��� :������ ���ϰ� �����ϴ� ������ ���� �̼�", "������"));
		tMap.put("a2", new BookServiceVO("(����ġ�� �������� ��õ�ϴ�) Ŭ���� ��� 20�� :�︲�� ���� ������ ������", "�ӿ���"));
		tMap.put("a3", new BookServiceVO("�ƹ�ư, �뷡", "�̽���"));
		tMap.put("a4", new BookServiceVO("�ƹ�ư, �ǾƳ�", "��ܿ�"));
		tMap.put("a5", new BookServiceVO("�̰��� �÷��� top 30 ,��ȭ ��", "������"));
	}

	@Override
	public void sci() {
		tMap.put("s1", new BookServiceVO("�̱��� ������", "��ó�� ��Ų��"));
		tMap.put("s2", new BookServiceVO("�ڽ���:Ư����", "Į ���̰�"));
		tMap.put("s3", new BookServiceVO("���� ���̵� :�ݰ� �޷��� �帧���� �д� �̷� ���� ����", "���ǿ�"));
		tMap.put("s4", new BookServiceVO("������ ����������", "������"));
		tMap.put("s5", new BookServiceVO("���� �߿����� :���ڵ��� ���� ���� �ʴ� ������ �θ� ��� ���", "������ �帶��"));
	}

	@Override
	public void lang() {
		tMap.put("l1", new BookServiceVO("�Žñ� �ӽñ� :�̾���� ���� �� ���� �� å�� ��", "�̾��"));
		tMap.put("l2", new BookServiceVO("���� ��� �ൿ ǥ���� ���� :������ �ݰ��� �о�����!", "������"));
		tMap.put("l3", new BookServiceVO("���� ��� ���� ǥ���� ���� :�˸� ���� ���� �޶����� ���� ǥ���鸸 ���!", "Jonathan Davis"));
		tMap.put("l4", new BookServiceVO("������ 100�� �ϼ� :����ȸȭ�� ���� ������ ���ϴ¹��� ������ ���ι�", "������"));
		tMap.put("l5", new BookServiceVO("The very hungry caterpillar", "by Eric Carle"));
	}

	@Override
	public void loan() {
		try {
			System.out.print("������ ��ȣ 4�ڸ��� �Է����ּ���. ");
			String tel = sc.next();
			System.out.println();

			System.out.println("�������� ������ �������ּ���.��\n");
			munhak();
			art();
			sci();
			lang();

			Iterator<String> list = tMap.keySet().iterator();
			while (list.hasNext()) {

				String num = list.next();
				BookServiceVO vo = tMap.get(num);

				System.out.print("��ȣ: " + num + "  ");
				System.out.print("����: [ " + vo.getBookName() + " ] ");
				System.out.println("����: " + vo.getAuthor());
			}

			System.out.print("\n�뿩�� å�� ��ȣ�� �Է��ϼ���: ");
			bnum = sc.next();

			BookServiceVO vo = tMap.get(bnum);

			loop1: for (int k = 0; k < lists.size(); k++) {

				if (tel.equals(lists.get(k).getTel())) {
					StudentVO sv = lists.get(k);

					for (int i = 0; i < lists.size(); i++) {

						for (int j = 0; j < lists.get(i).getMylist().size(); j++) {

							if (vo.getAuthor().equals(lists.get(i).getMylist().get(j).getAuthor())) {
								System.out.print("\n--------------------------------\n");
								System.out.println("�뿩���Դϴ�");
								break loop1;
							}
						}
					}
					sv.setMylist(vo);

					System.out.print("\n--------------------------------\n");
					System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");

				}
			}
			
			

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void delete() {
		
		try {
			System.out.print("������ ��ȣ 4�ڸ��� �Է����ּ���. ");
			String tel = sc.next();

			System.out.print("\n�ݳ��� å�� ��ȣ�� �Է����ּ���: ");
			bnum = sc.next();

			loop2: for (int k = 0; k < lists.size(); k++) {
				BookServiceVO v4 = tMap.get(bnum);

				if (tel.equals(lists.get(k).getTel())) {
					StudentVO sv1 = lists.get(k);
					
					for (int i = 0; i < lists.size(); i++) {

						for (int j = 0; j < lists.get(i).getMylist().size(); j++) {

							if (v4.getAuthor().equals(lists.get(i).getMylist().get(j).getAuthor())) {

								sv1.deleteMylist(v4);
								System.out.print("\n--------------------------------\n");
								System.out.println("�ݳ��� �Ϸ�Ǿ����ϴ�.");
								break loop2;
							}
						}
					}
					System.out.print("\n----------------------------\n");
					System.out.println("�뿩���� ������ �ƴմϴ�.");

				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
		
	}

	@Override
	public boolean searchBook(String list) {
		return false;
	}

	@Override
	public void print() {

		Iterator<StudentVO> it = lists.iterator();

		while (it.hasNext()) {

			StudentVO vo = it.next();
			System.out.println(vo.toString());
			vo.print3();
		}
	}

	@Override
	public void findTel() {

		System.out.println("****************************************");
		System.out.print("* ã���� ȸ���� ��ȣ��? ");
		String Tel = sc.next();
		System.out.println("****************************************");

		Iterator<StudentVO> it = lists.iterator();

		while (it.hasNext()) {

			StudentVO vo = it.next();

			if (Tel.equals(vo.getTel())) {

				System.out.println(vo.toString());
			}
		}
	}

	@Override
	public void run() {
		for (int i = 1; i <= 6; i++) {
			System.out.println("���������������������");
			try {
				Thread.sleep(300);
			} catch (Exception e) {

			}
		}
	}

	String[] result = new String[2];
	BookServiceVO vo2 = new BookServiceVO();
	List<BookServiceVO> bookl = new ArrayList<>();
	int n;

	@Override
	public void recommend1() {

		do {
			System.out.println("�����ִ� �о߸� �������ּ���");
			System.out.println("----------------------------------------");
			System.out.print("1.�ι�  | 2.����  | 3.����  | 4.���� ");
			n = sc.nextInt();
			System.out.println("----------------------------------------");

			if (n == 1) {
				munhak();
			} else if (n == 2) {
				sci();
			} else if (n == 3) {
				art();
			} else if (n == 4) {
				lang();
			}

		} while (n < 1 || n > 4);
		System.out.println("\n������ �˻����Դϴ�.\n");
	}

	@Override
	public void recommend2() {
		System.out.println();
		System.out.println("\n<��õ ���� ����Դϴ�.>");

		for (int i = 0; i < 2; i++) {
			int x = (int) (Math.random() * 5);

			result[i] = (String) (tMap.keySet().toArray())[x]; // Ű����

			for (int j = 0; j < i; j++) {
				if (result[i] == result[j]) {
					i--;
					break;
				}
			}
			vo2 = (tMap.get(result[i])); // �� ��ȯ
			bookl.add(vo2);
		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------");
		System.out.println("-->" + bookl);

		System.out.println(
				"-----------------------------------------------------------------------------------------------------------------------------");
	}

	@Override
	public void add() {
		
		System.out.print("å ��ȣ�� �Է����ּ���\n");
		System.out.print("ex)���� �帣: m0");
		System.out.print("ex)���� �帣: a0");
		System.out.print("ex)���� �帣: s0");
		System.out.print("ex)���� �帣: l0");
	
		
		String num = sc.next();
		
		if(searchBook(num)) {//��ȯ���� boolean�̸� if�� ���
			System.out.println("��ϵ� ��ȣ�Դϴ�, �߰�����!!!\n");
		return;
		}
	
		BookServiceVO vo = new BookServiceVO();
		
		System.out.print("å ������ �Է����ּ���\n");
		vo.setBookName(sc.next());
		
		System.out.print("���ڸ� �Է����ּ���\n");
		vo.setAuthor(sc.next());

		tMap.put(num, vo);
	
		System.out.println("�߰�����!!!\n");
		
	}

	@Override
	public void list() {
	}
}