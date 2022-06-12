package com.day9;

//Overload�� ���Ǹ� �� ��������.
/*Overload
 *OVerloading
 *method�� �ߺ� ����
 *����: �ϳ��� class���� method�� �̸��� ����������
 *�Ű������� ������ �ٸ��ų� �ڷ����� �ٸ���
 *�ٸ� �޼ҵ�� �ν��Ѵ�
 */
class Rect {
	// Rect class����
	private int w, h;

	// ���� ������ ���� w, h ����
	public void set(int w, int h) {
		// w�� h�� ����
		// private int�� �������� ���� ���
		this.w = w;
		this.h = h;
	}// Rect class�� w=this.w

	public int area() {
		return w * h;
	}

	public int length() {
		return (w + h) * 2;
	}

	public void print(int a, int l) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
		System.out.println("�ѷ�: " + l);
	}

	public void print() {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
	}

	public void print(int a) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("����: " + a);
	}

	public void print(double l) {
		System.out.println("����: " + w);
		System.out.println("����: " + h);
		System.out.println("�ѷ�: " + l);
	}// �ڷ����� �ٸ��⿡ print�� ���� ����
}

public class Test1 {

	public static void main(String[] args) {

		Rect ob = new Rect();

		ob.set(10, 20);

		int area = ob.area();
		int length = ob.length();

		ob.print();
		System.out.println("-----------------");
		ob.print(area);
		System.out.println("-----------------");
		ob.print(area, length);
		System.out.println("-----------------");
		ob.print((double) length);
	}

}
