package com.day18;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Test10 {

	public static void main(String[] args) {

		try {
			//br에 받은 값을 ps로 보내서 ps에서 out2로 보낸다
			FileOutputStream fos = new FileOutputStream("d:\\doc\\out2.txt");
			PrintStream ps = new PrintStream(fos);
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
			String str;
			//syso생략
			
			while((str = br.readLine())!=null) {
				ps.println(str);
			}
			ps.close();
			fos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
