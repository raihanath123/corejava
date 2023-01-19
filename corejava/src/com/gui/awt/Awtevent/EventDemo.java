package com.gui.awt.Awtevent;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo extends Frame implements ActionListener
{

	TextField t;
	Button b;
	//creating components
	public EventDemo()
	{
		t=new TextField();
		t.setBounds(60,50,150,30);
		b=new Button("Click here");
		b.setBounds(100,120,90,50);
		
		//Register listener
		b.addActionListener(this);
	
		add(b);
		add(t);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	//register listener
	 
	 public void actionPerformed(ActionEvent e)
	 {
	 
		t.setText("welcome to home");
	 }
	public static void main(String[] args)
	{
	
		new EventDemo();
		}
	public void actionperformed(ActionEvent e)
	{
		
	}
}
