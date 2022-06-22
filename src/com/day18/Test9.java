package com.day18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//bufferdrd로 읽어오기
public class Test9 {

	public static void main(String[] args) {

		try {
			
			FileInputStream fis = new FileInputStream("d:\\doc\\Test.txt");
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(fis));
			//ReadLine반환값=String
			String str;
			
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
			fis.close();
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
	}

}
