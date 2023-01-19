package com.gui.awt.Awtevent;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Component  extends Frame implements ActionListener
{
	Label l1;
	Label l2;
//label CheckBox
	public Component()
	{
		
		Button b=new Button("Click Here");
		b.setBounds(100,120,200,50);
		l1=new Label("First name");
		l2=new Label("Second name");
		l1.setBounds(50,100,100,50);
		l2.setBounds(50,150,100,50 );
		
		b.addActionListener(this);
		
		add(l1);
		add(l2);
		add(b);
		
		   setSize(400,400);
		   setLayout(null);
		   setVisible(true);
	}
	public static void main(String[]args)
	{
		new Component();
	}
	public void actionPerformed(ActionEvent e)
	{
		
		
			l1.setText("haiii");
		
		
		
		
	

	}
	

}
	