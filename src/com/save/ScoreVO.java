package com.save;

import java.io.Serializable;

public class ScoreVO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String birth;
	private int score;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	@Override
	public String toString() {//오버라이드된 toString을 쓰면 간편 깔끔한 코딩
		if(name==null||name.equals("")) {
			return null;
		}
		
		return String.format("%4s %4s %4d", name, birth, score);
		
	}
	
}
