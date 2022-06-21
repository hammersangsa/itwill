package com.day17;

//Demon Thread
//�ٸ�������(�ַ�Main)�� ������ �ִ� ������� �ٸ������尡
//����Ǹ� ���󽺷��尡 �۾��� �Ϸ������ʾƵ� ����ȴ�.

class MyThread5 implements Runnable{
	
	@Override
	public void run() {
		for(int i=1;i<=20;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
				//������ �ٶ��� ������ trycatch
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	
}

public class Test5 {

	public static void main(String[] args) {
		//��ɸ� �ٻ� t�����带 �����Ű�°� �ƴ�
		//������� ������ �׾ ��������� ������
		//����ؼ� ���� ����� ���ÿ� ������ ����
		System.out.println("main ����...");
		
		Thread t1 = new Thread(new MyThread5());
		Thread t2 = new Thread(new MyThread5());
		Thread t3 = new Thread(new MyThread5());
		
		//Demon Thread
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			Thread.sleep(1000);//���� 1�� ��
		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			//���γ��������� ���� join
			t1.join();//main��! t1 ���������� ��ٷ�
			t2.join();//main��! t2 ���������� ��ٷ�
			t3.join();//main��! t3 ���������� ��ٷ�
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		System.out.println("main ����...");
	}

}
