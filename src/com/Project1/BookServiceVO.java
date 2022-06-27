package com.Project1;

public class BookServiceVO {

	private String name;
	private String tel;
	private int grade;
	private String[] list = new String [3];
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
	public String toString() {
		
		String str = String.format("%4d %5s %4d %4s",
				grade,name,tel,list);
		
		return str;
	}
}
