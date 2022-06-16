package com.score4;

public class ScoreVO {//Value Object ���� DTO(����)

	private String hak;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	
	//�ʱ�ȭ: �޼ҵ� Ȥ�� ������
	//getter setter���� ������ �ؾ���	
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
	
	public int getTot() {
		return kor+eng+mat;
	}

	//�߿�
	@Override
	public String toString() {//�������̵�� toString�� ���� ���� ����� �ڵ�
		if(hak==null||hak.equals("")) {
			return null;
		}
		
		String str = String.format("%5s %6s %4d %4d %4d %4d %4.1f",
				hak,name,kor,eng,mat,getTot(),getTot()/3.0);
		
		return str;
	}
	
}
/*
//Getter Setter �޼ҵ�

public void setHak(String hak) {
	this.hak = hak;//�й��ʱ�ȭ �޼ҵ�
}

public String getHak() {
	return hak;
}

public void setName(String name) {
	this.name = name;//�̸��ʱ�ȭ �޼ҵ�
}

public String getName() {
	return name;
}

public void setKor(int kor) {//�ܺο��� �����͸� ������ set
	this.kor = kor;//�����ʱ�ȭ �޼ҵ�
}

public int getKor() {//�ܺο��� �����͸� ������ �ö� get
	return kor;
}

public void setEng(int eng) {
	this.eng = eng;//�����ʱ�ȭ �޼ҵ�
}

public int getEng() {
	return eng;
}

public void setMat(int mat) {
	this.mat = mat;//�����ʱ�ȭ �޼ҵ�
}

public int getMat() {
	return mat;
}
*/