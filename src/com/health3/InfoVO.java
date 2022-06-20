package com.health3;

public class InfoVO {

	private String name;
	private String health;
	private double key;
	private double kg;
	private double bmi;

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
	}
	public String getHealth() {
		if(18.5<=getBmi() && 22.9>=getBmi())
			System.out.print(" Health");
		else
			System.out.print(" UnHealth");
		return health;
		
	}
	public String toString() {
		
		String str = String.format("%5s, %5.2f, %5.2f, %5.2f, %4s",
				 name, key, kg, getBmi(), getHealth());
		
		return str;
		
	}
	
}
