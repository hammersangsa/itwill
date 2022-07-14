package com.guest;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Guest {
	
	Scanner sc = new Scanner(System.in);
	GuestDAO dao = new GuestDAO();

	public void insert() {
		GuestDTO dto = new GuestDTO();
		
		System.out.print("아이디?");dto.setId(sc.next());
		System.out.print("비밀번호?");dto.setPwd(sc.next());
		System.out.print("이름?");dto.setName(sc.next());
		
		int result = dao.insertData(dto);
		
		if(result!=0) {
			System.out.println("가입 성공!!!");
		}else {
			System.out.println("가입 실패!!!");
		}
	}
	
	public void write(String id) {
		GuestDTO dto = new GuestDTO();
		try {
			System.out.println("아이디?");
			id = sc.next();
			
				System.out.println("작성할 내용?");
				dto.setContent(sc.next());
				System.out.println("작성 날짜?");
				dto.setCreated(sc.next());
				
				int result = dao.writeData(dto);
			
				if(result!=0) {
					System.out.println("작성 성공!!!");
				}else {
					System.out.println("작성 실패!!!");
				}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void update() {
		GuestDTO dto = new GuestDTO();
		System.out.print("수정할 아이디?");dto.setId(sc.next());
		System.out.print("수정할 내용?");dto.setContent(sc.next());
		
		int result = dao.updateData(dto);
		
		if(result!=0) {
			System.out.println("수정 성공!!!");
		}else {
			System.out.println("수정 실패!!!");
		}
	}

	public void delete() {
		System.out.print("삭제할 아이디?");String id = sc.next();
		
		int result = dao.deleteData(id);
		if(result!=0) {
			System.out.println("삭제 성공!!!");
		}else {
			System.out.println("삭제 실패!!!");
		}
	}
	
	public void selectAll() {
		List<GuestDTO> lists = dao.getList();
		
		Iterator<GuestDTO> it = lists.iterator();
		while(it.hasNext()) {
			GuestDTO dto = it.next();
			
			System.out.println(dto.toString());
			
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
}
