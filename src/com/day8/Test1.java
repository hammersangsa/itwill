package com.day8;//�� ���� ���� ���� Ŭ����
//private ������ �ʱ�ȭ�� method�� ���� ���� ������
import java.util.Scanner;
//this: Ŭ����, �ڱ��ڽ�(Circle), me �� �ڽ�
class Circle{
	
	private int r;//������ ����(ĸ��ȭ)
	//�ܺ� ���� �Ұ� �������̹Ƿ�
	//method�� ���� �ܺη� ����
	public void setData(int r) {//setData(int r,Circle this )
	//�Է�-set �������°� get
		this.r= r;
	}
	
	public double area() {
		return this.r* this.r*3.14;
	}
	
	public void write(double a) { //write(double a, Circle this)
		System.out.println("������: " + this.r);
		System.out.println("����: "+ a);
		
	}
	
}

//Test1 �� Circle�� �ƹ� ���� x
public class Test1 {

	public static void main(String[] args) {

		Circle ob = new Circle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������?");
		int r = sc.nextInt();
		
		//ob.r = 20;
		ob.setData(r);			//setData(r,ob)
		double a = ob.area(); //area(ob)
		ob.write(a); 		//whirte(a,ob)
		
	}

}
