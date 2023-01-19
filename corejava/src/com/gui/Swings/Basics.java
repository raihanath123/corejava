package com.gui.Swings;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Basics {
	
	public static void main(String[]args)
	{
		JFrame f=new JFrame();
		JButton bt=new JButton("Click here");
		bt.setBounds(120, 100,120,50);
		f.add(bt);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	

}
