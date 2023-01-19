package com.dillu.core;


public class A 
{
	private static A obj;
	private A()
	{
		
	}
	public static A getInstance()
	{
		
		if(obj==null)
			obj=new A();
		return obj;
	}
	public static void main(String[] args)
	{
		A a1=A.getInstance();
		A a2=A.getInstance();
		
	System.out.println(a1);
	System.out.println(a2);
		
		
	}
	
}

