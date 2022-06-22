//중요!!! 프로젝트 시 사용
package com.day18;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Hashtable;

//"객체의 직렬화"
//메모리의 생성된 클래스의 변수의 현재 상태(2진수로 되있는)를 그대로 보존해서
//파일에 저장하거나 네트워크를 통해 전달하는 기능
//데이터의 종류에 상관없이 연속성을 제공할 수 있다
//implements Serializable 구현(메소드가 없다)
//Collection은 윗줄이 이미 구현되어있다.

//하이버네이트
public class Test13 {

	public static void main(String[] args)throws Exception{

		Hashtable<String, String> h = new Hashtable<>();
		
		h.put("1", "배수지");
		h.put("2", "유인나");
		h.put("3", "정인선");
		//출력할 파일
		FileOutputStream fos = new FileOutputStream("d:\\doc\\out5.txt");
		//저장할 능력을 가진
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		//파일을 2진수로 저장
		oos.writeObject(h);
		oos.close();
		fos.close();
	
		System.out.println("파일저장성공!!!");
		
	}

}
