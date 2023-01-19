package com.gui.awt.Awtevent;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.net.UnknownHostException;
public class Components extends Frame implements ItemListener
{



	
		//label CheckBox
		Label l1;
		public Components()
		{
			Label l1=new Label();
			l1.setAlignment(Label.CENTER);
			l1.setSize(400,100);
			Checkbox c1=new Checkbox("php");
	        c1.setBounds(100,100,50,50);
	        Checkbox c2=new Checkbox("java",true);
	        c2.setBounds(100,150,50,50);
	        
	        add(c1);
	        add(c2);
	        add(l1);
	        
	        c1.addItemListener(this);
	        c2.addItemListener(this);
	        
	           setSize(400,400);
	           setLayout(null);
	           setVisible(true);
		}
	    public static  void main(String[]args)
	    {
	    	new Components();
	    }
	       public void ItemStateChanged(ItemEvent e)
	       {
	    	   String var;
	    	   if(e.getStateChange()==1)
	    	    var="Checked";
	    	   else
	    	   {
	    		   var="Unchecked";
	    		   l1.setText("java CheckBox");
	    	   }
	    }
	}
