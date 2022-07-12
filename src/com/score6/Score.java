package com.score6;

import java.util.Scanner;

public class Score {

	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();
	//�Է� �� dao�� ��ü ���� �� dto�� ����
	public void insert() {
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("�й�?");dto.setHak(sc.next());
		System.out.print("�̸�?");dto.setName(sc.next());
		System.out.print("����?");dto.setKor(sc.nextInt());
		System.out.print("����?");dto.setEng(sc.nextInt());
		System.out.print("����?");dto.setMat(sc.nextInt());
		
		int result = dao.insertData(dto);
		
		if(result!=0) {
			System.out.println("�߰� ����!!!");
		}else {
			System.out.println("�߰� ����!!!");
		}
	}
	//����
	public void update() {
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("������ �й�?");dto.setHak(sc.next());
		System.out.print("����?");dto.setKor(sc.nextInt());
		System.out.print("����?");dto.setEng(sc.nextInt());
		System.out.print("����?");dto.setMat(sc.nextInt());
		
		int result = dao.updateData(dto);
		
		if(result!=0) {
			System.out.println("���� ����!!!");
		}else {
			System.out.println("���� ����!!!");
		}
		
	}
	
	//����
	public void delete() {
		ScoreDTO dto = new ScoreDTO();
		System.out.print("������ �й�?");dto.setHak(sc.next());
		
		int result = dao.deleteData(dto);
		if(result!=0) {
			System.out.println("���� ����!!!");
		}else {
			System.out.println("���� ����!!!");
		}
	}
}
