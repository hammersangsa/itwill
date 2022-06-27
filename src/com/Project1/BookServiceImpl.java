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
	
	String munhak[] = {"소년이 온다 :한강 장편소설"
			,"바깥은 여름 :김애란 소설"
			,"나미야 잡화점의 기적 :히가시노 게이고 장편소설"
			,"채식주의자 :한강 연작소설"
			,"여행의 이유 :김영하 산문"};

	String art[] = {"방구석 미술관 :가볍고 편하게 시작하는 유쾌한 교양 미술"
			,"(음악치료 전문가가 추천하는) 클래식 명곡 20選 :울림이 좋은 세계의 공연장"
			,"아무튼, 노래"
			,"아무튼, 피아노"
			,"이건희 컬렉션 top 30 ,명화 편"};
	
	String sci[] = {"이기적 유전자"
			,"코스모스:특별판"
			,"부의 대이동 :금과 달러의 흐름으로 읽는 미래 투자 전략"
			,"선량한 차별주의자"
			,"부의 추월차선 :부자들이 말해 주지 않는 진정한 부를 얻는 방법"};
	
	String lang[] = {"거시기 머시기 :이어령의 말의 힘 글의 힘 책의 힘"
			, "거의 모든 행동 표현의 영어 :영어의 반경이 넓어진다!"
			, "거의 모든 숫자 표현의 영어 :알면 말의 격이 달라지는 숫자 표현들만 쏙쏙!"
			, "영어듣기 100일 완성 :영어회화를 위한 영어듣기 잘하는법과 리스닝 공부법"
			, "The very hungry caterpillar"};
	
	int ch;
		
	
	System.out.println("도서의 장르를 선택해주세요...\n");
	do {
		System.out.print("1.문학 2.예술 3.과학 4.어학");
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
				System.out.println("대출이 완료되었습니다.\n");
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
			System.out.println("다시입력해주세요");
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
