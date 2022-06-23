package com.day19;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//AWT(Abstract Window ToolKit) -> Swing -> FX

public class Test1 extends Frame implements WindowListener{

	private static final long serialVersionUID = 1L;

	public Test1() {
		
		
		setTitle("�ڹ� ������");
		setSize(500, 300);
		setBackground(new Color(255, 255, 100));
		//��rgb
		addWindowListener(this);
		//���� �����ض�
		setVisible(true);
		//�������
	}
	
	
	public static void main(String[] args) {

		new Test1();
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}


	@Override
	public void windowClosed(WindowEvent e) {
	}


	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

}
