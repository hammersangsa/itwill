package com.day13;

interface Test{
	
	public int total();
	public void write();
	
}

class TestImpl implements Test{
	
	private String hak,name;
	private int kor,eng;
	
	public TestImpl() {}
	
	public TestImpl(String hak, String name, int kor, int eng) {
		this.name = name;
		this.hak = hak;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void set(String hak, String name, int kor, int eng) {
		this.name = name;
		this.hak = hak;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	@Override
	public int total() {
		return kor+eng;
	}
	@Override
	public void write() {
	
		System.out.println(hak + ":" + name + ":" + total());//mtomȣ��
	}

	@Override
	public boolean equals(Object ob) { //TestImpl ob1.equals(ob2) TestImpl
		//TestImpl�� Object�� upcast�� ����
		boolean flag = false;//boolean �⺻�� false
		
		if(ob instanceof TestImpl) {
			
			TestImpl t = (TestImpl)ob;
			//�ٽ� downcast t = ob2
			if(this.hak.equals(t.hak)&&name.equals(t.name)) {
				//ob1��ob2�� �������
				//ob1.equals�� true�� return
				flag = true;
			}
			
		}
		return flag;
	}//ob instanceof�� ���� ������ ���� �Ȱ��� �ξ��⶧��
	
}

public class Test2 {
	
	public static void main(String args[])	{
		//Inter        //class 
		//Interface�� �޼ҵ�θ� ��ü ������ ������ ���� ǥ���ϴ� ���� �Ϲ���
		Test ob1 = new TestImpl("1111", "�����", 80, 90);//�ڽ� ��ü�� �θ� ����(interface����)
		Test ob2 = new TestImpl("1111", "�����", 100, 100);
		
		if(ob1.equals(ob2))//Object�� equals ���� TestImpl�� equals
			System.out.println("ob1�� ob2�� ���� �ι�O..");
		else
			System.out.println("ob1�� ob2�� ���� �ι�X..");
		
		ob1.write();
		ob2.write();
	}
}
