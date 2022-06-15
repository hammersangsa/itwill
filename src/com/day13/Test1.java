package com.day13;

//Interface
//1.�߻�Ŭ������ �������� ���� �ְ� ���ǰ� ����
//2.final������ ������ �� �ִ�.
//3.�������̽��� �����Ϸ��� implements�� ����Ѵ�
//4.�ϳ� �̻��� �������̽��� implements�� Ŭ������
//�������̽��� ��� �޼ҵ带 ������ �ؾ��Ѵ�
//5.�������̽��� �ٸ� �������̽��� ��� ���� �� ������
//�̶��� extends�� ����Ѵ�
//6.Ŭ�����ʹ� �ٸ��� �������̽��� ���� ����� �����ϴ�

interface Fruit{
	
	String Won = "��";//Won(static), �����Ǿ��ִ�(public static final)
	//ȣ�� �� ��ü.Won
	int getPrice(); //public abstract �߻�Ŭ����
	public String getName(); //abstract
	
}

class FruitImpl implements Fruit{//�ٷ� �˾ƺ��Բ� Ŭ������ ����+impl

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "���";
	}
	
	public String getItems() {
		return "����";
	}
	
}





public class Test1 {

	public static void main(String[] args) {

		FruitImpl ob1 = new FruitImpl();
		
		System.out.println(ob1.getItems());
		System.out.println(ob1.getName());
		System.out.println(ob1.getPrice()+Fruit.Won);
		
		Fruit ob2 = ob1;
		
		System.out.println(ob2.getName());
		//System.out.println(ob2.getItems());�θ� �ڽ� �� ���X
		
	}

}
