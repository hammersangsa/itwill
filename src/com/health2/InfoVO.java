package com.health2;

public class InfoVO {
	//Value Object�μ� ��������

	private String num;
	private String name;
	private String health;
	private double key;
	private double kg;
	private double bmi;
	
	//getter setter�� �̰���
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
	//ü���������� �ڽ��� ������(kg)�� Ű�� ����(m)���� ���� ���Դϴ�.
	}
	public String getHealth() {
	//bmi�� �������� �ǰ��� üũ�մϴ�
		if(18.5<=getBmi() && 22.9>=getBmi())
			System.out.print(" Health");
		else
			System.out.print(" UnHealth");
		return health;
		
	}
	
	//�������̵� �� toString�޼ҵ� ����Ͽ� ��»���
	public String toString() {
		if(num==null||num.equals("")) {
			return null;
		}
		
		String str = String.format("%4s, %5s, %5.2f, %5.2f, %5.2f, %4s",
				num, name, key, kg, getBmi(), getHealth());
		return str;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
