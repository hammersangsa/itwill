package com.score5;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.score5.ScoreVO;

public class ScoreImpl implements Score{

	private Map<String, ScoreVO> hMap = new TreeMap<>();

	Scanner sc = new Scanner(System.in);
	String hak;
	 
	
	@Override
	public void input() {
		
		System.out.print("�й���?");//key��
		hak = sc.next();
		
		if(searchHak(hak)) {//��ȯ���� boolean�̸� if�� ���
			System.out.println("��ϵ� �й��Դϴ�, �߰�����!!!");
			return;
		}
		ScoreVO vo = new ScoreVO();
		
		System.out.print("�̸���?");
		vo.setName(sc.next());
		
		System.out.print("����?");
		vo.setKor(sc.nextInt());
		
		System.out.print("����?");
		vo.setEng(sc.nextInt());
		
		System.out.print("����?");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);//�й��� �����ִ� �̸� ���� Ŭ������ ��

		System.out.println("�߰�����!!!");
	}

	@Override
	public boolean searchHak(String hak) {
	//�й��� ã�� �й��� �������� boolean�� ���� ã�� method
	//	if(hMap.containsKey(hak)) {
	//		return true;
	//	}
	//
	//	return false;
		return hMap.containsKey(hak);
	}

	@Override
	public void print() {
		//��¸޼ҵ�
		//<>�ڸ��� Ű���� �ڷ��� //set=key
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			System.out.println(hak + " " + vo.toString());
		}
		
	}

	@Override
	public void delete() {
		System.out.println("������ �й��� �Է����ּ���");
		String hak = sc.next();
		
		if(!searchHak(hak)) {
			System.out.println("��������!!!");
			return;
		}
		//�й��� �������� hak�� ������
		hMap.remove(hak);
		//�й��� �ش��ϴ� key,value�� ������
		System.out.println("�ش��й��� �����Ǿ����ϴ�");
			
	}

	@Override
	public void update() {
		System.out.print("������ �й�?");//222
		String hak = sc.next();
		//������ �� ��쿡�� Iterator�� ���°� �ƴ϶�
		//�й��� ���� ��쿡 �� ������ �Է��Ѵ�
		if(!searchHak(hak)) {
			System.out.println("��������!!!");
			return;
		}
		ScoreVO vo = hMap.get(hak); //�����ѹ��
//		���� �� ������ ���
//		ScoreVO pvo = hMap.get(hak);//�ش��й��� �̸��� ����� ���� 
//		//������ü��� �̸����� ����
//		//�й��� key�� ������
//		ScoreVO vo = new ScoreVO();
//		//value�� �� ��ü�� �����ض�
//		vo.setName(pvo.getName());//�� ��ü�� �̸��� �����ͼ� ����
		
		System.out.print("����?");
		vo.setKor(sc.nextInt());
		
		System.out.print("����?");
		vo.setEng(sc.nextInt());
		
		System.out.print("����?");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);//�й��� �����ִ� �̸� ���� Ŭ������ ��

		System.out.println("��������!!!");
				
		
		
	}

	@Override
	public void findHak() {
		System.out.print("ã�� �й�?");//222
		hak = sc.next();
		
		if(!searchHak(hak)) {
			System.out.println("ã�����Ͽ����ϴ�");
			return;
		}
		
		ScoreVO vo = hMap.get(hak);
		System.out.println(hak + " " + vo.toString());
		
	}

	@Override
	public void findName() {
		System.out.print("ã�� �̸�?");//222
		String name = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		boolean flag = false;
		//�ߺ��� �����͸� �̾Ƽ� �ϳ��� ǥ���ؾ��� ����
		//boolean�� ����Ͽ� ó���Ѵ�
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);

			if(name.equals(vo.getName())) {			
				System.out.println(hak + " " + vo.toString());
				flag = true;
			}
		
		}
		
		if(!flag) {
			System.out.println("�˻��� �����Ͽ����ϴ�");
		}else {
			System.out.println("�˻�����!!!");
		}
		
	}

}
