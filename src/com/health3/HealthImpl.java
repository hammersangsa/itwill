package com.health3;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;



public class HealthImpl implements Health {

	private Map<String, InfoVO> hMap = new TreeMap<>();
	
	Scanner sc =new Scanner(System.in);
	String num;
	
	@Override
	public void input() {
		
		System.out.print("��ȣ��?");//key��
		num = sc.next();
		
		if(searchNum(num)) {//��ȯ���� boolean�̸� if�� ���
			System.out.println("��ϵ� ��ȣ�Դϴ�, �߰�����!!!");
		return;
		}
	
		InfoVO vo = new InfoVO();
		
		System.out.print("�̸��� �Է����ּ���...");
		vo.setName(sc.next());
		
		System.out.print("Ű�� �Է����ּ���...");
		vo.setKey(sc.nextDouble());
		
		System.out.print("�����Ը� �Է����ּ���...");
		vo.setKg(sc.nextDouble());
		
		hMap.put(num, vo);
	
		System.out.println("�߰�����!!!");

	}
	
	@Override
	public void print() {
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String hak = it.next();
			InfoVO vo = hMap.get(num);
			
			System.out.println(hak + " " + vo.toString());
		}
		
	}

	@Override
	public void deleteNum() {
		System.out.println("������ �й��� �Է����ּ���");
		String num = sc.next();
		
		if(!searchNum(num)) {
			System.out.println("��������!!!");
			return;
		}
		hMap.remove(num);
		System.out.println("�ش��й��� �����Ǿ����ϴ�");
	}

	public void searchNum() {
		System.out.print("ã�� �й�?");//222
		num = sc.next();
		
		if(!searchNum(num)) {
			System.out.println("ã�����Ͽ����ϴ�");
			return;
		}
		
		InfoVO vo = hMap.get(num);
		System.out.println(num + " " + vo.toString());
		
	}

	@Override
	public void searchName() {
		System.out.print("ã�� �̸�?");//222
		String name = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		boolean flag = false;
		//�ߺ��� �����͸� �̾Ƽ� �ϳ��� ǥ���ؾ��� ����
		//boolean�� ����Ͽ� ó���Ѵ�
		while(it.hasNext()) {
			
			String num = it.next();
			InfoVO vo = hMap.get(num);

			if(name.equals(vo.getName())) {			
				System.out.println(num + " " + vo.toString());
				flag = true;
			}
			if(!flag) {
				System.out.println("�˻��� �����Ͽ����ϴ�");
			}else {
				System.out.println("�˻�����!!!");
			}
			
		}
	}

	@Override
	public boolean searchNum(String num) {
		return hMap.containsKey(num);
	}

}
