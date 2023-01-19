package com.dillu.core.Inheritance;

public class Employee {
	
	void m1()
	{
		
	}

	public static void main(String[] args) {
		
		PartimeJob p1=new PartimeJob();
		p1.m1();
	}
}
class Student
{
	void m1()
	{
	}
	
}
class PartimeJob extends Student,Employee
{
	//diamond problem
}
	

               object
       employee                student
                   PartimeJob