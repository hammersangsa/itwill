package com.Project1;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class StudentVO {

	private String name;
	private String tel;
	private int grade;
	private boolean loan;

	
	private List<BookServiceVO> mylist = new ArrayList<BookServiceVO>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	public boolean isLoan() {
		return loan;
	}

	public void setLoan(boolean loan) {
		this.loan = loan;
	}
	
	public List<BookServiceVO> getMylist() {
		return mylist;
	}
	public void setMylist(BookServiceVO vo) {
		mylist.add(vo);
	}
	public void deleteMylist(BookServiceVO vo) {
		mylist.remove(vo);
	}
	
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		
		System.out.println("");
		String str = String.format(" ▩%d학년 | 이름: %3s | 회원번호:%4s▩", grade,name,tel);

		return str;
		
	}
	
	public void print3() {
		System.out.println("┎-----------------------------------┒");
		System.out.println("┃          대출 도서 목록           ┃");
		System.out.println("┞-----------------------------------┚");
		for( int i = 0; i < mylist.size(); i++ ) {
			System.out.println("┃" + mylist.get(i));
		}
		System.out.println(" ∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽∽");
	}
	
	
}

	
	
