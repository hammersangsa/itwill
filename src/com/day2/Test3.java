
package com.day2;

public class Test3 {

	public static void main(String[] args) {

		int r = 10;
		float area,length;
		
		area = 10;
		System.out.println(area);
		
		//r = (int)20.0; //����ȯ
		//System.out.println(r);
		
		area = r * r * 3.14f; 
		//3.14��� 8byte�� double�� 4byte�� f(float)�� ���δ� 
		length = r * 2 * 3.14f;
		
		System.out.printf("������:%d, ����:%f\n" ,r,area);
		System.out.printf("������:%d, ����:%.1f\n" ,r,area);
		System.out.println("������:" + r + ", �ѷ�:" + length);

		
	}

}
