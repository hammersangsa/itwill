package com.day18;

import java.io.Serializable;

public class MyData implements Serializable {
//VO는 구현해야함
	private String name;
	private int score;
	
	public MyData(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String toString() {
		return name + ":" + score;
	}
	
}
