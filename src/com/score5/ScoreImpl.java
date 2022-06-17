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
		
		System.out.print("학번은?");//key값
		hak = sc.next();
		
		if(searchHak(hak)) {//반환값이 boolean이면 if문 사용
			System.out.println("등록된 학번입니다, 추가실패!!!");
			return;
		}
		ScoreVO vo = new ScoreVO();
		
		System.out.print("이름은?");
		vo.setName(sc.next());
		
		System.out.print("국어?");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어?");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학?");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);//학번과 묶여있는 이름 점수 클래스가 들어감

		System.out.println("추가성공!!!");
	}

	@Override
	public boolean searchHak(String hak) {
	//학번이 찾는 학번과 동일한지 boolean을 통해 찾는 method
	//	if(hMap.containsKey(hak)) {
	//		return true;
	//	}
	//
	//	return false;
		return hMap.containsKey(hak);
	}

	@Override
	public void print() {
		//출력메소드
		//<>자리는 키값의 자료형 //set=key
		Iterator<String> it = hMap.keySet().iterator();
		
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);
			
			System.out.println(hak + " " + vo.toString());
		}
		
	}

	@Override
	public void delete() {
		System.out.println("삭제할 학번을 입력해주세요");
		String hak = sc.next();
		
		if(!searchHak(hak)) {
			System.out.println("삭제실패!!!");
			return;
		}
		//학번이 전역변수 hak과 같으면
		hMap.remove(hak);
		//학번에 해당하는 key,value를 지워라
		System.out.println("해당학번이 삭제되었습니다");
			
	}

	@Override
	public void update() {
		System.out.print("수정할 학번?");//222
		String hak = sc.next();
		//수정을 할 경우에는 Iterator를 쓰는게 아니라
		//학번이 같은 경우에 새 정보를 입력한다
		if(!searchHak(hak)) {
			System.out.println("수정실패!!!");
			return;
		}
		ScoreVO vo = hMap.get(hak); //간편한방법
//		조금 더 복잡한 방법
//		ScoreVO pvo = hMap.get(hak);//해당학번의 이름을 남기기 위해 
//		//이전객체라는 이름으로 생성
//		//학번이 key와 같으면
//		ScoreVO vo = new ScoreVO();
//		//value를 새 객체로 생성해라
//		vo.setName(pvo.getName());//전 객체의 이름을 가져와서 설정
		
		System.out.print("국어?");
		vo.setKor(sc.nextInt());
		
		System.out.print("영어?");
		vo.setEng(sc.nextInt());
		
		System.out.print("수학?");
		vo.setMat(sc.nextInt());
		
		hMap.put(hak, vo);//학번과 묶여있는 이름 점수 클래스가 들어감

		System.out.println("수정성공!!!");
				
		
		
	}

	@Override
	public void findHak() {
		System.out.print("찾을 학번?");//222
		hak = sc.next();
		
		if(!searchHak(hak)) {
			System.out.println("찾지못하였습니다");
			return;
		}
		
		ScoreVO vo = hMap.get(hak);
		System.out.println(hak + " " + vo.toString());
		
	}

	@Override
	public void findName() {
		System.out.print("찾을 이름?");//222
		String name = sc.next();
		
		Iterator<String> it = hMap.keySet().iterator();
		
		boolean flag = false;
		//중복된 데이터를 뽑아서 하나로 표시해야할 때는
		//boolean을 사용하여 처리한다
		while(it.hasNext()) {
			
			String hak = it.next();
			ScoreVO vo = hMap.get(hak);

			if(name.equals(vo.getName())) {			
				System.out.println(hak + " " + vo.toString());
				flag = true;
			}
		
		}
		
		if(!flag) {
			System.out.println("검색에 실패하였습니다");
		}else {
			System.out.println("검색성공!!!");
		}
		
	}

}
