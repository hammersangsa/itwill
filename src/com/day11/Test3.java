package com.day11;

//StringBuffer : 동기화 작업 지원*속도가 느림 str 저장
//StringBUilder : 동기화 작업 미지원*속도가 빠름

public class Test3 {
	
	public void stringTime() {
		
		System.out.println("String...");
		
		//long start = System.currentTimeMillis();
		long start = System.nanoTime();
		
		String str = "A";
		for(int i=1;i<50000;i++) {
			str += "A";
			//A를 늘려나감
		}
		
		long end = System.nanoTime();
		
		System.out.println("실행시간: " + (end-start) + "ms");
		
	}
	
	public void stringBufferTime() {
		//자리에 A만 추가	
			System.out.println("StringBuffer...");
			//long start = System.currentTimeMillis();
			long start = System.nanoTime();
			
			StringBuffer str = new StringBuffer("A");
			for(int i=1;i<50000;i++) {
				str.append("A");//어펜드=누적하겠다
				
			}
			
			long end = System.nanoTime();
			
			System.out.println("실행시간: " + (end-start) + "ms");
			
		}
	
	public void stringBuilderTime() {
			
			System.out.println("StringBuilder...");
			
			//long start = System.currentTimeMillis();
			long start = System.nanoTime();
			
			StringBuilder str = new StringBuilder("A");
			for(int i=1;i<50000;i++) {
				str.append("A");				
			}
			
			long end = System.nanoTime();
			
			System.out.println("실행시간: " + (end-start) + "ms");
			
		}
	public static void main(String[] args) {

		Test3 ob = new Test3();
		
		ob.stringTime();
		ob.stringBufferTime();
		ob.stringBuilderTime();
		
		
	}

}
