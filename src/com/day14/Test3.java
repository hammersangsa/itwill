package com.day14;

import java.util.Vector;

class Test{
	String name;
	int age;
}


public class Test3 {

	public static void main(String[] args) {

		Vector<Test> v = new Vector<>();
		
		Test ob = new Test();
		ob.name = "����";
		ob.age = 27;
		v.add(ob);//������ �߰� add
		
		ob = new Test();// ���ο� ��ü�� �������� ������
		//���� ��ü�� ������� ������ �ȴ�.
		//�ְ���� ��ü ��ŭ �߰��ؾ���
		ob.name = "�γ�";
		ob.age = 42;
		v.add(ob);//������ �߰� add
		
		for(Test t : v) {//name�� �ƴ� Test�� ������ ���̹Ƿ� t:v
			System.out.println(t.name + ":" + t.age);
		}

	}

}
