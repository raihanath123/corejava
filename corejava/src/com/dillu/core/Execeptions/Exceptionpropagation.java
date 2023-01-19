package com.dillu.core.Execeptions;
//exception propagation

public class Exceptionpropagation 
{
	public static void main(String[] args) {
		System.out.println("Main Start");
		//try
		//{
			m1();
		//}
		//catch(Exception e)
		//{
			//System.out.println("exception handled in mainmethod");
		//}
		System.out.println("Main End");
	}
	static void m1()
	{
		System.out.println("m1 start");
		m2();
		System.out.println("m1 end");
	}
	static void m2()
	{
		System.out.println("m2 start");
		int a=10/0;
		System.out.println("m2 end");
	}
}
		