package com.gui.awt.Awtevent;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class Test implements ActionListener{

	public Test()
	{
		Frame f=new Frame("Choice Demo");
		Label l1=new Label();
		l1.setAlignment(Label.CENTER);
		l1.setSize(400, 100);
		Button b1=new Button("Show here");
        b1.setBounds(200,100,50,25);
        Choice c1=new Choice();
        c1.add("java");
        c1.add("Spring");
        c1.add("Hiberante");
        c1.add("SpringBoot");
        c1.add("Maven");

        b1.addActionListener(this);
        
        f.add(l1);
        f.add(b1);
        f.add(c1);
        
        
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
	}
	public static void main(String[] args) {
		new Test();
	}
	   public void actionPerformed(ActionEvent e)
	   {
		  
		String sel="Selected Item "+c1.getItem(c1.getSelectedIndex());
          
		l1.setText(sel);	   
	   }
	
	}
