
package com.day2;

public class Test3 {

	public static void main(String[] args) {

		int r = 10;
		float area,length;
		
		area = 10;
		System.out.println(area);
		
		//r = (int)20.0; //형변환
		//System.out.println(r);
		
		area = r * r * 3.14f; 
		//3.14라는 8byte의 double을 4byte의 f(float)를 붙인다 
		length = r * 2 * 3.14f;
		
		System.out.printf("반지름:%d, 넓이:%f\n" ,r,area);
		System.out.printf("반지름:%d, 넓이:%.1f\n" ,r,area);
		System.out.println("반지름:" + r + ", 둘레:" + length);

		
	}

}
