package score5;

import java.util.Scanner;

public class ScoreMain {
	
	public static void main(String args[]) {
	
		Scanner sc = new Scanner(System.in);
		
		Score ob = new ScoreImpl();
		
		int ch;
		
		while(true) {
		
			do {
				System.out.print("1.입력 2.출력 3.삭제 4.수정 "
					+ "5.학번검색 6.이름검색 7.종료: ");
				ch = sc.nextInt();
			}while(ch<1);
			
			switch(ch) {
				case 1: ob.input();break;
				case 2: ob.print();break;
				case 3: ob.delete();break;
				case 4: ob.update();break;
				case 5: ob.findHak();break;
				case 6: ob.findName();break;
				default: 
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			}
		}
		
	}

}
	
		/*ScoreVO vo = new ScoreVO();
		
		//vo.set("111", "수지", 60, 70, 80);
		
		vo.setHak("a123");//학번만 초기화
		vo.setName("배수지");
		vo.setKor(90);
		vo.setEng(80);
		vo.setMat(70);
		
		System.out.println(vo.toString());
				
		System.out.println(vo.getHak());
		System.out.println(vo.getEng());
		*/
		
		
		/*
		ScoreVO vo1 = new ScoreVO("222", "ㅁㅁ", 80, 90, 100);
		
		System.out.println(vo1.toString());
		*/