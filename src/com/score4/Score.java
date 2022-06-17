package com.score4;

public interface Score {

	public int input();//입 //throws IOE로 예외처리하는 경우도 많다
	public void print();//출
	public void deleteHak();//학생정보삭제
	public void searchHak();//학번검색
	public void searchName();//이름검색
	public void descSortTot();//총점 내림차순 정렬
	public void ascSortHak();//학번 오름차순 정렬

	
}