package com.dillu.core.polymorphism;

public class Rider {
	
	void ride(Bike b)
	{
		System.out.println("Executing ride with bike arguments");
		b.start();
	}
   void ride(Pulser b)
   {
	   System.out.println("Excuting ride with Pulser arguments");
	   b.start(); //rp 
	   
	   
   }
}
