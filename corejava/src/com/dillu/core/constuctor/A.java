
package com.dillu.core.constuctor;
//constructor chaining
public class A extends Object
{
	public A()
	{
		System.out.println("constructor of class A");
	}
}
class B extends A
{
	
	public  B(int s)
	{
		System.out.println("constructor of class B"); 
	}
}
class C extends B
{
	public C()
	{
		super(10);
		System.out.println("constuctor of class c");
	
	}
}
		
	

