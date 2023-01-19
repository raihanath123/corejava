package com.gui.awt.Awtevent;
import java.awt.Button;
import java.awt.Frame;

public class BasicAwt extends Frame
{
	public BasicAwt() {
		Button b1=new Button("Click here");
		b1.setBounds(130,200,80,30);
		add(b1);
		setSize(300,300);
		setTitle("This is a Demo Frame");
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		BasicAwt b1=new BasicAwt();
	}
	}


