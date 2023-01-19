package com.dillu.core.Aggregation;

public class Student {

	int rollNo;
	String name;
	Address adr;
	
	public Student (int rollNo,String name,Address adr)
	{
	
		super();
		this.rollNo =rollNo;
		this.name =name;
		this.adr =adr;
	}
	void dispaly()
	{
		System.out.println("Roll no= "+rollNo);
		System.out.println("Name = "+name);
		System.out.println("Address ="+adr);
	}
}
