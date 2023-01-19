package com.gui;

import java.awt.*;
import java.awt.event.*;
public class Test5 extends Frame {

 
//Simple Registration Form in Java AWT
	Label lblTitle,lblFName,lblLName,lblDob,lblGender,lblPlace,lblContactNumber;
	TextField txtFName,txtLName,txtDob,txtPlace,txtContactNumber;
	
	Checkbox checkMale, checkFemale;
	CheckboxGroup cbg;
	
	Button btnSubmit;
 
	public Test5() {
		super("User Registration Form");
		setSize(1000, 600);// w,h
		setLayout(null);
		setVisible(true);
		//Color formColor = new Color(53, 59, 72);
		//setBackground(formColor);
 
		Font titleFont = new Font("arial", Font.BOLD, 25);
		Font labelFont =new  Font("arial", Font.PLAIN, 18);
		Font textFont =new  Font("arial", Font.PLAIN, 15);
 
		lblTitle=new Label("Registration Form");  
		lblTitle.setBounds(250,40,300,50);
		lblTitle.setFont(titleFont);
		lblTitle.setForeground(Color.YELLOW);
		add(lblTitle);
 
		lblFName=new Label("FirstName");  
		lblFName.setBounds(250,100,150,30);
		lblFName.setFont(labelFont);  
		lblFName.setForeground(Color.WHITE);
		add(lblFName);
 
		txtLName=new TextField();
		txtLName.setBounds(400,100,400,30);
		txtLName.setFont(textFont);
		add(txtLName);
 
		lblLName=new Label("Last Name");  
		lblLName.setBounds(250,150,150,30);
		lblLName.setFont(labelFont); 
		lblLName.setForeground(Color.WHITE);
		add(lblLName);
 
		txtLName=new TextField();
		txtLName.setBounds(400,150,400,30);
		txtLName.setFont(textFont);
		add(txtLName);
 
		lblDob=new Label("Dob");  
		lblDob.setBounds(250,200,150,30);
		lblDob.setFont(labelFont);
		lblDob.setForeground(Color.WHITE);
		add(lblDob);
 
		txtDob=new TextField();
		txtDob.setBounds(400,200,400,30);
		txtDob.setFont(textFont);
		add(txtDob);
 
 
		lblGender=new Label("Gender");  
		lblGender.setBounds(250,250,150,30);
		lblGender.setFont(labelFont);
		lblGender.setForeground(Color.WHITE);
		add(lblGender);
 
		cbg = new CheckboxGroup();
 
		checkMale = new Checkbox("Male",cbg,true);
		checkMale.setBounds(400,250, 100, 30);
		checkMale.setFont(labelFont);
		checkMale.setForeground(Color.WHITE);
		add(checkMale);
 
		checkFemale = new Checkbox("Female",cbg,false);
		checkFemale.setBounds(500,250, 100, 30);
		checkFemale.setFont(labelFont);
		checkFemale.setForeground(Color.WHITE);
		add(checkFemale);
 
		cbg = new CheckboxGroup();
		 
		checkMale = new Checkbox("Male",cbg,true);
		checkMale.setBounds(400,250, 100, 30);
		checkMale.setFont(labelFont);
		checkMale.setForeground(Color.WHITE);
		add(checkMale);
 
		checkFemale = new Checkbox("Female",cbg,false);
		checkFemale.setBounds(500,250, 100, 30);
		checkFemale.setFont(labelFont);
		checkFemale.setForeground(Color.WHITE);
		add(checkFemale);
		
		
		txtPlace=new TextField();
		txtPlace.setBounds(400,100,400,30);
		txtPlace.setFont(textFont);
		add(txtPlace);
 
		lblPlace=new Label("Place");  
		lblPlace.setBounds(250,150,150,30);
		lblPlace.setFont(labelFont); 
		lblPlace.setForeground(Color.WHITE);
		add(lblPlace);
 
		
		txtContactNumber=new TextField();
		txtContactNumber.setBounds(400,100,400,30);
		txtContactNumber.setFont(textFont);
		add(txtContactNumber);
 
		lblContactNumber=new Label("ContactNumber");  
		lblContactNumber.setBounds(250,150,150,30);
		lblContactNumber.setFont(labelFont); 
		lblContactNumber.setForeground(Color.WHITE);
		add(lblContactNumber);
 
 
	
		
 

 
		
		btnSubmit=new Button("Submit");
		btnSubmit.setBounds(400,530,150,30);
		btnSubmit.setFont(labelFont);
		btnSubmit.setBackground(Color.BLUE);
		btnSubmit.setForeground(Color.WHITE);
		add(btnSubmit);
 
		// Close Button Code
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}
 
}
 


