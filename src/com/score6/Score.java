package com.score6;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Score {

	Scanner sc = new Scanner(System.in);
	ScoreDAO dao = new ScoreDAO();
	List<ScoreDTO> lists = null;
	//입력 후 dao에 객체 작업 후 dto로 전달
	public void insert() {
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("학번?");dto.setHak(sc.next());
		System.out.print("이름?");dto.setName(sc.next());
		System.out.print("국어?");dto.setKor(sc.nextInt());
		System.out.print("영어?");dto.setEng(sc.nextInt());
		System.out.print("수학?");dto.setMat(sc.nextInt());
		
		int result = dao.insertData(dto);
		
		if(result!=0) {
			System.out.println("추가 성공!!!");
		}else {
			System.out.println("추가 실패!!!");
		}
	}
	//수정
	public void update() {
		ScoreDTO dto = new ScoreDTO();
		
		System.out.print("수정할 학번?");dto.setHak(sc.next());
		System.out.print("국어?");dto.setKor(sc.nextInt());
		System.out.print("영어?");dto.setEng(sc.nextInt());
		System.out.print("수학?");dto.setMat(sc.nextInt());
		
		int result = dao.updateData(dto);
		
		if(result!=0) {
			System.out.println("수정 성공!!!");
		}else {
			System.out.println("수정 실패!!!");
		}
		
	}
	
	//삭제
	public void delete() {
		System.out.print("삭제할 학번?");String hak = sc.next();
		
		int result = dao.deleteData(hak);
		if(result!=0) {
			System.out.println("삭제 성공!!!");
		}else {
			System.out.println("삭제 실패!!!");
		}
	}
	
	//전체 출력
	public void selectAll() {
		//dao의 list를 가져와서 lists에 넣음
		lists = dao.getList();
		print();
	}
	
	public void print() {
		
		Iterator<ScoreDTO> it = lists.iterator();
		while(it.hasNext()) {
			ScoreDTO dto = it.next();
			
			if(dto.getRank()==0)
				System.out.println(dto.toString());
			else
				System.out.println(dto.toString() + "  " + dto.getRank());
		}
		
	}	
	
	//이름 검색
	public void searchName() {
		System.out.print("검색할 이름?");
		String name = sc.next();
	
		lists = dao.getList(name);
		print();
			
	}
	//학번 검색
	public void searchHak() {
		
		System.out.print("검색할 학번?");
		String hak = sc.next();
		
		ScoreDTO dto = dao.getLists(hak);
		
		if(dto!=null) {
			System.out.println(dto.toString());	
		}else {
			System.out.println("찾는 학번이 없습니다");
		}
	}
	
}
