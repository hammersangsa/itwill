package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {
		//����
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//�Է�
		System.out.println("����[3+5]");//12+56
		String str =  br.readLine();
		
		str = str.replaceAll("\\s", "");//i=i+1
		//��� ������� null�� ó��
		
		//String[] op = {"+","-","*","/"};
		//for(String o : op) {
		//�� ������ ����� �Ʒ��� ���ٷ� ǥ������
		for(String op : new String[] {"+","-","*","/"}) {	
			//012345
			//123+56, pos�� 3��
			int pos = str.indexOf(op);
			
			if(pos>-1) {
			//��������=substring	
				int num1 = Integer.parseInt(str.substring(0,pos));//123
				int num2 = Integer.parseInt(str.substring(pos+1));//56
				
				int result = 0;
				char oper = str.charAt(pos);//+ pos=3
				
				switch(oper) {
				
				case '+':
					result = num1 + num2; break;
				case '-':
					result = num1 - num2; break;
				case '*':
					result = num1 * num2; break;
				case '/':
					result = num1 / num2; break;
				}
				
				//System.out.printf("%d %c %d = %d", num1, oper, num2, result);
				String s = String.format("%d %c %d = %d", num1, oper, num2, result);
				//class�ȿ� �޼ҵ带 ������� �� 
				System.out.println(s);
				//������: syso�� ���ڸ����� �ٷ� ����ϴ°�����
				//String.format�� ������ ���� �ּҸ� �����ص״ٰ� ȣ���ؼ� ��
				//format static���� ������� class method
			}
			
		}
		
	}

}
