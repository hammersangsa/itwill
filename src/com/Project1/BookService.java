package com.Project1;

public interface BookService {

	public void input(); //
	
	public void print();//전체정보 출력
	
	public void loan();//도서대출한다
	
	public void recommend1();//추천도서
	public void recommend2();//추천도서

	public void add();//도서추가
	
	public void delete1();//반납하기
	public void delete2();//도서삭제
	
	public void findTel();//번호검색

	public void list();//목록출력
	
	public boolean searchBook(String num);//도서목록을 검사
	
	public void munhak();//책목록
	
	public void art();//책목록
	
	public void sci();//책목록
	
	public void lang();//책목록

	public void booksell();
	
	

	
}
