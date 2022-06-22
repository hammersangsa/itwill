package com.day18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.Hashtable;
import java.util.Iterator;

public class Test14 {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("d:\\doc\\out5.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//꺼내와야함//업캐스트 되어있으므로 hastable로 형변환(downcast)해야함.
		Hashtable<String, String> h =
				(Hashtable<String, String>)ois.readObject();
		
		Iterator<String> it = h.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			String value = h.get(key);
			System.out.println(key + ":" + value);
		}		
		
	}

}
