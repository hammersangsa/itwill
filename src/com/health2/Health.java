package com.health2;

public interface Health {

	//구현할 인터페이스 내용들을 표현
	
	public double input();//입
	public void print();//출
	public void deleteNum();//회원정보삭제
	public void searchNum();//회원번호검색
	public void searchName();//회원이름검색
	public void ascSortBmi();//bmi 오름차순 정렬
	public void descSortKey();//키 내림차순 정렬
	public void descSortKg();//몸무게 내림차순 정렬
	public void ascSortNum();//회원번호 오름차순 정렬

}
