package com.day6;


import com.day7.Yoil;

public class yoil {
	public static void main(String[] args) {
	Yoil y = new Yoil();
	
	y.input();
	int week = y.week();
	String[] yoil = {"Sun", "Mon", "Tues", "Wednes", "Thurs", "Fri", "Satur"};
	y.print(yoil[week]);
	}
}
