package com.Project1_1;
import com.Project1.BookServiceVO;;
public class BookServiceVO1 extends BookServiceVO{
	
	public BookServiceVO1(String bookNum, String bookName, String author) {
		super(bookNum, bookName, author);
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String tel;
	private int grade;
	private String[] list = new String[3];

	
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

	public String[] getList() {
		return list;
	}

	public void setList(String[] list) {
		this.list = list;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString(){

		System.out.println("");
		String str = String.format("%4d 학년 이름 : %1s 회원번호 : %4s ",
				grade, name, tel);
		toString1();

		return str;

	}
}
