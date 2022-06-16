package com.health2;

public class InfoVO {
	//Value Object로서 변수설정

	private String num;
	private String name;
	private String health;
	private double key;
	private double kg;
	private double bmi;
	
	//getter setter는 이곳에
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getKey() {
		return key;
	}
	public void setKey(double key) {
		this.key = key;
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	public double getBmi() {
		return kg/(key*key*0.0001);
	//체질량지수는 자신의 몸무게(kg)를 키의 제곱(m)으로 나눈 값입니다.
	}
	public String getHealth() {
	//bmi를 기준으로 건강을 체크합니다
		if(18.5<=getBmi() && 22.9>=getBmi())
			System.out.print(" Health");
		else
			System.out.print(" UnHealth");
		return health;
		
	}
	
	//오버라이드 된 toString메소드 사용하여 출력생성
	public String toString() {
		if(num==null||num.equals("")) {
			return null;
		}
		
		String str = String.format("%4s, %5s, %5.2f, %5.2f, %5.2f, %4s",
				num, name, key, kg, getBmi(), getHealth());
		return str;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
