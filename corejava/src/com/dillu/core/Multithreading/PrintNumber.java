package com.dillu.core.Multithreading;

public class PrintNumber {
	
	public static void main(String[] args) {
		
		System.out.println("Main started");
		Thread t1=new Printchar();
		t1.start();
		for(int i=1;i<=20;i++)
		{
			System.out.println(i);
		}
		System.out.println("main ended");
		}
	}


