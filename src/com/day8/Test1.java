package com.day8;//한 파일 내의 여러 클래스
//private 변수를 초기화할 method로 가장 많이 쓰여짐
import java.util.Scanner;
//this: 클래스, 자기자신(Circle), me 나 자신
class Circle{
	
	private int r;//정보의 은닉(캡슐화)
	//외부 접근 불가 반지름이므로
	//method를 통해 외부로 반출
	public void setData(int r) {//setData(int r,Circle this )
	//입력-set 가져오는것 get
		this.r= r;
	}
	
	public double area() {
		return this.r* this.r*3.14;
	}
	
	public void write(double a) { //write(double a, Circle this)
		System.out.println("반지름: " + this.r);
		System.out.println("넓이: "+ a);
		
	}
	
}

//Test1 과 Circle은 아무 관계 x
public class Test1 {

	public static void main(String[] args) {

		Circle ob = new Circle();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름?");
		int r = sc.nextInt();
		
		//ob.r = 20;
		ob.setData(r);			//setData(r,ob)
		double a = ob.area(); //area(ob)
		ob.write(a); 		//whirte(a,ob)
		
	}

}
