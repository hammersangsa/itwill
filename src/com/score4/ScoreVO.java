package com.score4;

public class ScoreVO {//Value Object 추후 DTO(전달)

	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	//초기화: 메소드 혹은 생성자
	//getter setter생성 무조건 해야함	
	public String getHak() {
		return hak;
	}

	public void setHak(String hak) {
		this.hak = hak;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}
	//중요
	@Override
	public String toString() {//오버라이드된 toString을 쓰면 간편 깔끔한 코딩
		if(hak==null||hak.equals("")) {
			return null;
		}
		
		String str = String.format("%5s %6s %4d %4d %4d %4d %4.1f",
				hak,name,kor,eng,mat,(kor+eng+mat),(kor+eng+mat)/3.0);
		
		return str;
	}
	
}
/*
//Getter Setter 메소드

public void setHak(String hak) {
	this.hak = hak;//학번초기화 메소드
}

public String getHak() {
	return hak;
}

public void setName(String name) {
	this.name = name;//이름초기화 메소드
}

public String getName() {
	return name;
}

public void setKor(int kor) {//외부에서 데이터를 넣을때 set
	this.kor = kor;//국어초기화 메소드
}

public int getKor() {//외부에서 데이터를 가지고 올때 get
	return kor;
}

public void setEng(int eng) {
	this.eng = eng;//영어초기화 메소드
}

public int getEng() {
	return eng;
}

public void setMat(int mat) {
	this.mat = mat;//수학초기화 메소드
}

public int getMat() {
	return mat;
}
*/