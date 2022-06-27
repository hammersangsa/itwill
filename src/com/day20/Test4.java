package com.day20;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Test4 extends Frame implements ActionListener{

	private TextArea ta;
	private TextField tf;
	
	public Test4() {
		
		ta = new  TextArea();
		add(ta);
		
		tf = new TextField("https://");//url표시
		tf.addActionListener(this);
		add(tf,BorderLayout.NORTH);
		
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		setTitle("HTML Viewer");
		setSize(900, 600);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new Test4();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			String str;
			
			URL url = new URL(tf.getText());
			
			ta.setText("");
			//방법1
			//InputStream is = url.openStream();//stream열어라//빨대			
			//BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			//방법2
			URLConnection conn = url.openConnection();//빨대에 잠금 계량 기능 추가
			InputStream is = conn.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			
			while((str=br.readLine())!=null) {
				
				if(ta.getText().equals(null))
					ta.setText(str);
				else {
					ta.setText(ta.getText() + "\r\n" + str);
				}
			}
			//i=i+str
			is.close();
			
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
	}

}
