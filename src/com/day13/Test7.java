package com.day13;

//4.���� Ŭ����(������,�͸���,Annonymous Ŭ����)

public class Test7 {

		public Object getTitle() {
			
			//String str = "������ Ŭ����";
			
			return new Object() {//Ŭ����Ȥ���������̽�//��Ŭ �޼ҵ�� ������ ����
				//return ���� ���� �ڸ��� ������ Ŭ����
				//�޸𸮿� �ö���� ���ÿ� ó���ǹǷ� �ӵ��� �������
				@Override
				public String toString() {
					return "������ Ŭ����";
				}
			};
		
		}
	public static void main(String[] args) {

		Test7 ob = new Test7();
		
		System.out.println(ob.getTitle());
		
	}

}
