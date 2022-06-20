package com.naver;

public class InfoVO {

	private String id;
	private String pw;
	private String name;
	private String gender;
	private String birth;
	private String email;
	private String tel;
	
	public String getId() {
		return id;
	}
	public String setId(String id) {
		return this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public String setGender(String gender) {
		return this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public String setBirth(String birth) {
		return this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String toString() {
		if(id==null||id.equals("")) {
			return null;
		}
		
		String str = String.format("%4s, %4s, %4s, %4s, %4s, %4s, %4s",
				id, pw, name, gender, birth, email, tel);
		
		return str;
		
	}
	
}
