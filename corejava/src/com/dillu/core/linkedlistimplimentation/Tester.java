package com.dillu.core.linkedlistimplimentation;

public class Tester
{

	public static void main(String[] args)
	{
		
		Mylinkedlist m1=new Mylinkedlist();
		m1.add(25);
		m1.add(350);
		m1.add("java");
		m1.add("python");
		System.out.println(m1);
		System.out.println(m1.get(3));
		System.out.println(m1.size());
	}
	}

