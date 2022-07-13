package com.guest;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Guest {
	
	Scanner sc = new Scanner(System.in);
	GuestDAO dao = new GuestDAO();

	public void insert() {
		GuestDTO dto = new GuestDTO();
		
		System.out.print("���̵�?");dto.setId(sc.next());
		System.out.print("��й�ȣ?");dto.setPwd(sc.next());
		System.out.print("�̸�?");dto.setName(sc.next());
		
		int result = dao.insertData(dto);
		
		if(result!=0) {
			System.out.println("���� ����!!!");
		}else {
			System.out.println("���� ����!!!");
		}
	}
	
	public void write(String id) {
		GuestDTO dto = new GuestDTO();
		try {
			System.out.println("���̵�?");
			id = sc.next();
			
			if(id.equals(dto.getId())) {
				System.out.println("�ۼ��� ����?");
				dto.setContent(sc.next());
				int result = dao.writeData(dto);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void update() {
		GuestDTO dto = new GuestDTO();
		System.out.print("������ ���̵�?");dto.setId(sc.next());
		System.out.print("������ ����?");dto.setContent(sc.next());
		
		int result = dao.updateData(dto);
		
		if(result!=0) {
			System.out.println("���� ����!!!");
		}else {
			System.out.println("���� ����!!!");
		}
	}

	public void delete() {
		System.out.print("������ ���̵�?");String id = sc.next();
		
		int result = dao.deleteData(id);
		if(result!=0) {
			System.out.println("���� ����!!!");
		}else {
			System.out.println("���� ����!!!");
		}
	}
	
	public void selectAll() {
		List<GuestDTO> lists = dao.getList();
		
		Iterator<GuestDTO> it = lists.iterator();
		while(it.hasNext()) {
			GuestDTO dto = it.next();
			
			System.out.println(dto.toString());
			System.out.println(dto.toString1());
			
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
