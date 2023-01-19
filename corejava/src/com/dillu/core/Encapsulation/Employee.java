package com.dillu.core.Encapsulation;

public class Employee 
{
	private String name;
	private int age;
	private double salary;
	//setter
	
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
		
	}
	//getters
	public String getName()
	
	{
		return name;
	}
	public int getAge() 
	{
		return age;
	}
	public double getSalary()
	{
		return salary;
	}

}
