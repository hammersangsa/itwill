package com.naver;

@SuppressWarnings("serial")
public class OperationAuthenticatior extends Exception{

	public void idInputFormat(String str)throws Exception{
		
		if(str.length()<8||str.length()>15) {
			throw new Exception("ID는 8~15자 이내어야 합니다.");
		}	
		
		int num = 0, eng = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch>='0' &&ch<='9') {
				num++;
			}else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')) {
				eng++;
			}
			
		}
		if(num==0||eng==0) {
			throw new Exception("영문자와 숫자 혼용만 가능합니다");
		}
	}
	
	public void pwInputCorrect(String num1, String num2)throws Exception{
		
		if(!num1.equals(num2)) {
			throw new Exception("비밀번호가 일치하지않습니다");
		}
	}
	
	public void genderCorrect(String gender)throws Exception{
		
		if(!gender.equals("m") && !gender.equals("f")) {
			throw new Exception("성별이 올바르지않습니다");
		}
	}
	
}
