package com.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

	public static void main(String[] args) throws IOException {
		//선언
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		//입력
		System.out.println("수식[3+5]");//12+56
		String str =  br.readLine();
		
		str = str.replaceAll("\\s", "");//i=i+1
		//모든 공백들을 null로 처리
		
		//String[] op = {"+","-","*","/"};
		//for(String o : op) {
		//위 두줄을 요약한 아래의 한줄로 표현가능
		for(String op : new String[] {"+","-","*","/"}) {	
			//012345
			//123+56, pos는 3값
			int pos = str.indexOf(op);
			
			if(pos>-1) {
			//문자추출=substring	
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
				//class안에 메소드를 만들었을 때 
				System.out.println(s);
				//차이점: syso는 그자리에서 바로 출력하는거지만
				//String.format은 변수와 같이 주소를 저장해뒀다가 호출해서 씀
				//format static으로 만들어진 class method
			}
			
		}
		
	}

}
