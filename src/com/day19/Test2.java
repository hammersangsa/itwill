package com.day19;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//중요
public class Test2 extends Frame{

	public Test2() {
		
		setTitle("윈도우");
		setSize(500, 300);
		
		addWindowListener(new MyWindowAdapter());
		
		setVisible(true);
		
		
	}
	
	//내부 클래스
	class MyWindowAdapter extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {

		new Test2();
	}

}
