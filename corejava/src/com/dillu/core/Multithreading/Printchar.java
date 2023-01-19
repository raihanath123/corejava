package com.dillu.core.Multithreading;

public class Printchar extends Thread {
	public void run()
	{
		System.out.println("Run metod of Print characters started");
		for(char c='a';c<='z';c++)
		{
			System.out.println(c);
		}
		System.out.println("Run method of Print characters ended");
	}

}
