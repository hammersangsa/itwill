package com.health3;

public interface Health {

	public void input();//입
	public void print();//출
	public void deleteNum();//회원정보삭제
	public void searchNum();//회원번호검색
	public void searchName();//회원이름검색
	public boolean searchNum(String num);
}
