package com.Project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookServiceImpl implements BookService {

	private List<BookServiceVO> lists = new ArrayList<>();

	Scanner sc = new Scanner(System.in);
	
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
	public void select() {
	
	String munhak[] = {"�ҳ��� �´� :�Ѱ� ����Ҽ�"
			,"�ٱ��� ���� :��ֶ� �Ҽ�"
			,"���̾� ��ȭ���� ���� :�����ó� ���̰� ����Ҽ�"
			,"ä�������� :�Ѱ� ���ۼҼ�"
			,"������ ���� :�迵�� �깮"};

	String art[] = {"�汸�� �̼��� :������ ���ϰ� �����ϴ� ������ ���� �̼�"
			,"(����ġ�� �������� ��õ�ϴ�) Ŭ���� ��� 20�� :�︲�� ���� ������ ������"
			,"�ƹ�ư, �뷡"
			,"�ƹ�ư, �ǾƳ�"
			,"�̰��� �÷��� top 30 ,��ȭ ��"};
	
	String sci[] = {"�̱��� ������"
			,"�ڽ���:Ư����"
			,"���� ���̵� :�ݰ� �޷��� �帧���� �д� �̷� ���� ����"
			,"������ ����������"
			,"���� �߿����� :���ڵ��� ���� ���� �ʴ� ������ �θ� ��� ���"};
	
	String lang[] = {"�Žñ� �ӽñ� :�̾���� ���� �� ���� �� å�� ��"
			, "���� ��� �ൿ ǥ���� ���� :������ �ݰ��� �о�����!"
			, "���� ��� ���� ǥ���� ���� :�˸� ���� ���� �޶����� ���� ǥ���鸸 ���!"
			, "������ 100�� �ϼ� :����ȸȭ�� ���� ������ ���ϴ¹��� ������ ���ι�"
			, "The very hungry caterpillar"};
	
	int ch;
		
	
	System.out.println("������ �帣�� �������ּ���...\n");
	do {
		System.out.print("1.���� 2.���� 3.���� 4.����");
		System.out.print("\n----------------------------\n");
		System.out.print(": ");
		ch = sc.nextInt();
	}while(ch<1);
		
	switch(ch) {
		case 1: 
			for (int i = 0; i < munhak.length; i++) {
				System.out.println((i+1)+"."+munhak[i]); 
			}
				System.out.print("\n-----------------\n");
				System.out.print(": ");
				ch = sc.nextInt();
				
				
		
		
		
				System.out.print("\n----------------------------\n");
				System.out.println("������ �Ϸ�Ǿ����ϴ�.\n");
			break;
		case 2:
			for (int i = 0; i < art.length; i++) {
				System.out.println((i+1)+"."+art[i]); 
			}
			break;
		case 3: 
			for (int i = 0; i < sci.length; i++) {
			System.out.println((i+1)+"."+sci[i]); 
			}
			break;
		case 4:
			for (int i = 0; i < lang.length; i++) {
			System.out.println((i+1)+"."+lang[i]); 
			}
			break;
		
		default: 
			System.out.println("�ٽ��Է����ּ���");
			System.exit(0);
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	@Override
	public void recommend() {
	}

	@Override
	public void delete() {
	}

	@Override
	public void findTel() {
	}
	
	
	
}
