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
		System.out.println("\n             [회원등록]");

		try {

			StudentVO vo = new StudentVO();

			System.out.println("****************************************");
			System.out.print("*   당신의 학년을 입력해 주세요 : ");
			vo.setGrade(sc.nextInt());

			System.out.print("*   당신의 이름을 입력해 주세요 : ");
			vo.setName(sc.next());

			System.out.print("*   회원번호 4자리를 입력해주세요 : ");
			vo.setTel(sc.next());

			lists.add(vo);

			System.out.println("****************************************");
			System.out.println("               등록완료!\n");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void munhak() {
		tMap.put("m1", new BookServiceVO("소년이 온다 :한강 장편소설", "한강"));
		tMap.put("m2", new BookServiceVO("바깥은 여름 :김애란 소설", "김애란"));
		tMap.put("m3", new BookServiceVO("나미야 잡화점의 기적 :히가시노 게이고 장편소설", "히가시노 게이고"));
		tMap.put("m4", new BookServiceVO("채식주의자 :한강 연작소설", "한강"));
		tMap.put("m5", new BookServiceVO("여행의 이유 :김영하 산문", "김영하"));
	}

	@Override
	public void art() {
		tMap.put("a1", new BookServiceVO("방구석 미술관 :가볍고 편하게 시작하는 유쾌한 교양 미술", "조원재"));
		tMap.put("a2", new BookServiceVO("(음악치료 전문가가 추천하는) 클래식 명곡 20選 :울림이 좋은 세계의 공연장", "임영제"));
		tMap.put("a3", new BookServiceVO("아무튼, 노래", "이슬아"));
		tMap.put("a4", new BookServiceVO("아무튼, 피아노", "김겨울"));
		tMap.put("a5", new BookServiceVO("이건희 컬렉션 top 30 ,명화 편", "이윤정"));
	}

	@Override
	public void sci() {
		tMap.put("s1", new BookServiceVO("이기적 유전자", "리처드 도킨스"));
		tMap.put("s2", new BookServiceVO("코스모스:특별판", "칼 세이건"));
		tMap.put("s3", new BookServiceVO("부의 대이동 :금과 달러의 흐름으로 읽는 미래 투자 전략", "오건영"));
		tMap.put("s4", new BookServiceVO("선량한 차별주의자", "김지혜"));
		tMap.put("s5", new BookServiceVO("부의 추월차선 :부자들이 말해 주지 않는 진정한 부를 얻는 방법", "엠제이 드마코"));
	}

	@Override
	public void lang() {
		tMap.put("l1", new BookServiceVO("거시기 머시기 :이어령의 말의 힘 글의 힘 책의 힘", "이어령"));
		tMap.put("l2", new BookServiceVO("거의 모든 행동 표현의 영어 :영어의 반경이 넓어진다!", "서영조"));
		tMap.put("l3", new BookServiceVO("거의 모든 숫자 표현의 영어 :알면 말의 격이 달라지는 숫자 표현들만 쏙쏙!", "Jonathan Davis"));
		tMap.put("l4", new BookServiceVO("영어듣기 100일 완성 :영어회화를 위한 영어듣기 잘하는법과 리스닝 공부법", "김지혜"));
		tMap.put("l5", new BookServiceVO("The very hungry caterpillar", "by Eric Carle"));
	}

	@Override
	public void loan() {
		try {
			System.out.print("귀하의 번호 4자리를 입력해주세요. ");
			String tel = sc.next();
			System.out.println();

			System.out.println("【대출할 도서를 선택해주세요.】\n");
			munhak();
			art();
			sci();
			lang();

			Iterator<String> list = tMap.keySet().iterator();
			while (list.hasNext()) {

				String num = list.next();
				BookServiceVO vo = tMap.get(num);

				System.out.print("번호: " + num + "  ");
				System.out.print("제목: [ " + vo.getBookName() + " ] ");
				System.out.println("저자: " + vo.getAuthor());
			}

			System.out.print("\n대여할 책의 번호를 입력하세요: ");
			bnum = sc.next();

			BookServiceVO vo = tMap.get(bnum);

			loop1: for (int k = 0; k < lists.size(); k++) {

				if (tel.equals(lists.get(k).getTel())) {
					StudentVO sv = lists.get(k);

					for (int i = 0; i < lists.size(); i++) {

						for (int j = 0; j < lists.get(i).getMylist().size(); j++) {

							if (vo.getAuthor().equals(lists.get(i).getMylist().get(j).getAuthor())) {
								System.out.print("\n--------------------------------\n");
								System.out.println("대여중입니다");
								break loop1;
							}
						}
					}
					sv.setMylist(vo);

					System.out.print("\n--------------------------------\n");
					System.out.println("대출이 완료되었습니다.\n");

				}
			}
			
			

		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	@Override
	public void delete() {
		
		try {
			System.out.print("귀하의 번호 4자리를 입력해주세요. ");
			String tel = sc.next();

			System.out.print("\n반납할 책의 번호를 입력해주세요: ");
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
								System.out.println("반납이 완료되었습니다.");
								break loop2;
							}
						}
					}
					System.out.print("\n----------------------------\n");
					System.out.println("대여중인 도서가 아닙니다.");

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
		System.out.print("* 찾으실 회원의 번호는? ");
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
			System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
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
			System.out.println("관심있는 분야를 선택해주세요");
			System.out.println("----------------------------------------");
			System.out.print("1.인문  | 2.과학  | 3.예술  | 4.어학 ");
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
		System.out.println("\n도서를 검색중입니다.\n");
	}

	@Override
	public void recommend2() {
		System.out.println();
		System.out.println("\n<추천 도서 목록입니다.>");

		for (int i = 0; i < 2; i++) {
			int x = (int) (Math.random() * 5);

			result[i] = (String) (tMap.keySet().toArray())[x]; // 키값만

			for (int j = 0; j < i; j++) {
				if (result[i] == result[j]) {
					i--;
					break;
				}
			}
			vo2 = (tMap.get(result[i])); // 값 반환
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
		
		System.out.print("책 번호를 입력해주세요\n");
		System.out.print("ex)문학 장르: m0");
		System.out.print("ex)예술 장르: a0");
		System.out.print("ex)과학 장르: s0");
		System.out.print("ex)어학 장르: l0");
	
		
		String num = sc.next();
		
		if(searchBook(num)) {//반환값이 boolean이면 if문 사용
			System.out.println("등록된 번호입니다, 추가실패!!!\n");
		return;
		}
	
		BookServiceVO vo = new BookServiceVO();
		
		System.out.print("책 제목을 입력해주세요\n");
		vo.setBookName(sc.next());
		
		System.out.print("저자를 입력해주세요\n");
		vo.setAuthor(sc.next());

		tMap.put(num, vo);
	
		System.out.println("추가성공!!!\n");
		
	}

	@Override
	public void list() {
	}
}