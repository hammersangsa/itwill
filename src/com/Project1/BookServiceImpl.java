package com.Project1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BookServiceImpl implements BookService {

	HashMap<String, BookServiceVO> hMap = new HashMap<String, BookServiceVO>();


	Scanner sc = new Scanner(System.in);
	
	@Override
	public void munhak() {
		HashMap<String, BookServiceVO> hMap = new HashMap<String, BookServiceVO>();
		hMap.put("m1",new BookServiceVO("m1", "소년이 온다 :한강 장편소설", "한강"));
		hMap.put("m2",new BookServiceVO("m2", "바깥은 여름 :김애란 소설", "김애란"));
		hMap.put("m3",new BookServiceVO("m3", "나미야 잡화점의 기적 :히가시노 게이고 장편소설", "히가시노 게이고"));
		hMap.put("m4",new BookServiceVO("m4", "채식주의자 :한강 연작소설", "한강"));
		hMap.put("m5",new BookServiceVO("m5", "여행의 이유 :김영하 산문", "김영하"));
		
		try {
			Iterator<String> list = hMap.keySet().iterator();
			while(list.hasNext()) {
				
				String num = list.next();
				BookServiceVO vo = hMap.get(num);
				
				System.out.print("번호:" + vo.getBookNum() + " ");
				System.out.print("제목:[" + vo.getBookName() + "] ");
				System.out.println("저자:" + vo.getAuthor());
			}
			
			System.out.print("\n대여할 책의 번호를 입력하세요: ");
			String key = sc.next();
			
			Iterator<String> list1 = hMap.keySet().iterator();
			while(list1.hasNext()) {
				
				String num = list1.next();
				BookServiceVO vo = hMap.get(key);
				
				if(vo.getBookNum().startsWith(key)) {
					if(vo.isLoan()) {
						System.out.println("대여중인 도서입니다");
						break;
					}
					vo.setStock(vo.getStock()-1);
					System.out.print("\n----------------------------\n");
					System.out.println("대출이 완료되었습니다.\n");
					vo.setLoan(true);
				}break;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	@Override
	public void art() {
		HashMap<String, BookServiceVO> hMap1 = new HashMap<String, BookServiceVO>();
		hMap1.put("a1",new BookServiceVO("a1", "방구석 미술관 :가볍고 편하게 시작하는 유쾌한 교양 미술", "조원재"));
		hMap1.put("a2",new BookServiceVO("a2", "(음악치료 전문가가 추천하는) 클래식 명곡 20選 :울림이 좋은 세계의 공연장", "임영제"));
		hMap1.put("a3",new BookServiceVO("a3", "아무튼, 노래", "이슬아"));
		hMap1.put("a4",new BookServiceVO("a4", "아무튼, 피아노", "김겨울"));
		hMap1.put("a5",new BookServiceVO("a5", "이건희 컬렉션 top 30 ,명화 편", "이윤정"));
		
		try {
			Iterator<String> list = hMap1.keySet().iterator();
			while(list.hasNext()) {
				
				String num = list.next();
				BookServiceVO vo = hMap1.get(num);
				
				System.out.print("번호:" + vo.getBookNum() + " ");
				System.out.print("제목:[" + vo.getBookName() + "] ");
				System.out.println("저자:" + vo.getAuthor());
			}
			
			System.out.print("\n대여할 책의 번호를 입력하세요: ");
			String key = sc.next();
			
			Iterator<String> list1 = hMap1.keySet().iterator();
			while(list1.hasNext()) {
				
				String num = list1.next();
				BookServiceVO vo = hMap1.get(key);
				
				if(vo.getBookNum().startsWith(key)) {
					if(vo.isLoan()) {
						System.out.println("대여중인 도서입니다");
						break;
					}
					vo.setStock(vo.getStock()-1);
					System.out.print("\n----------------------------\n");
					System.out.println("대출이 완료되었습니다.\n");
					vo.setLoan(true);
				}break;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	@Override
	public void sci() {
		HashMap<String, BookServiceVO> hMap2 = new HashMap<String, BookServiceVO>();
		hMap2.put("s1",new BookServiceVO("s1", "이기적 유전자", "리처드 도킨스"));
		hMap2.put("s2",new BookServiceVO("s2", "코스모스:특별판", "칼 세이건"));
		hMap2.put("s3",new BookServiceVO("s3", "부의 대이동 :금과 달러의 흐름으로 읽는 미래 투자 전략", "오건영"));
		hMap2.put("s4",new BookServiceVO("s4", "선량한 차별주의자", "김지혜" ));
		hMap2.put("s5",new BookServiceVO("s5", "부의 추월차선 :부자들이 말해 주지 않는 진정한 부를 얻는 방법", "엠제이 드마코" ));
	
		try {
			Iterator<String> list = hMap2.keySet().iterator();
			while(list.hasNext()) {
				
				String num = list.next();
				BookServiceVO vo = hMap2.get(num);
				
				System.out.print("번호:" + vo.getBookNum() + " ");
				System.out.print("제목:[" + vo.getBookName() + "] ");
				System.out.println("저자:" + vo.getAuthor());
			}
			
			System.out.print("\n대여할 책의 번호를 입력하세요: ");
			String key = sc.next();
			
			Iterator<String> list1 = hMap2.keySet().iterator();
			while(list1.hasNext()) {
				
				String num = list1.next();
				BookServiceVO vo = hMap2.get(key);
				
				if(vo.getBookNum().startsWith(key)) {
					if(vo.isLoan()) {
						System.out.println("대여중인 도서입니다");
						break;
					}
					vo.setStock(vo.getStock()-1);
					System.out.print("\n----------------------------\n");
					System.out.println("대출이 완료되었습니다.\n");
					vo.setLoan(true);
				}break;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void lang() {
		HashMap<String, BookServiceVO> hMap3 = new HashMap<String, BookServiceVO>();
		hMap3.put("l1",new BookServiceVO("l1", "거시기 머시기 :이어령의 말의 힘 글의 힘 책의 힘", "이어령"));
		hMap3.put("l2",new BookServiceVO("l2", "거의 모든 행동 표현의 영어 :영어의 반경이 넓어진다!", "서영조"));
		hMap3.put("l3",new BookServiceVO("l3", "거의 모든 숫자 표현의 영어 :알면 말의 격이 달라지는 숫자 표현들만 쏙쏙!", "Jonathan Davis"));
		hMap3.put("l4",new BookServiceVO("l4", "영어듣기 100일 완성 :영어회화를 위한 영어듣기 잘하는법과 리스닝 공부법", "김지혜" ));
		hMap3.put("l5",new BookServiceVO("l5", "The very hungry caterpillar", "by Eric Carle" ));
		
		try {
			Iterator<String> list = hMap3.keySet().iterator();
			while(list.hasNext()) {
				
				String num = list.next();
				BookServiceVO vo = hMap3.get(num);
				
				System.out.print("번호:" + vo.getBookNum() + " ");
				System.out.print("제목:[" + vo.getBookName() + "] ");
				System.out.println("저자:" + vo.getAuthor());
			}
			
			System.out.print("\n대여할 책의 번호를 입력하세요: ");
			String key = sc.next();
			
			Iterator<String> list1 = hMap3.keySet().iterator();
			while(list1.hasNext()) {
				
				String num = list1.next();
				BookServiceVO vo = hMap3.get(key);
				
				if(vo.getBookNum().startsWith(key)) {
					if(vo.isLoan()) {
						System.out.println("대여중인 도서입니다");
						break;
					}
					vo.setStock(vo.getStock()-1);
					System.out.print("\n----------------------------\n");
					System.out.println("대출이 완료되었습니다.\n");
					vo.setLoan(true);
				}break;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	
	@Override
	public void select() {
	int ch;
	System.out.println("도서의 장르를 선택해주세요...\n");
	do {
		System.out.print("1.문학 2.예술 3.과학 4.어학");
		System.out.print("\n----------------------------\n");
		System.out.print(": ");
		ch = sc.nextInt();
	}while(ch<1);
		
		switch(ch) {
			case 1: munhak(); break;
			case 2: art(); break;
			case 3: sci();break;
			case 4: lang();break;
			
			default: 
				System.out.println("다시입력해주세요");
				System.exit(0);
		}
		
	}
	
	@Override
	public void delete() {
		
		System.out.print("\n반납할 책의 번호를 입력해주세요: ");
		String dnum = sc.next();
		Iterator<String> list = hMap.keySet().iterator();
		
		while(list.hasNext()) {
			String num = list.next();
			BookServiceVO dvo = hMap.get(num);
			
			if(dnum.equals(dvo.getBookNum())) {
				if(!dvo.isLoan()) {
					System.out.print("\n----------------------------\n");
					System.out.println("대여중인 도서가 아닙니다.");
				}else {
					System.out.print("\n----------------------------\n");
					System.out.println("반납이 완료되었습니다.");
					dvo.setStock(dvo.getStock()+1);
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
