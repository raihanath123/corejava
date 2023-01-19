package com.dillu.core.Inheritance;

public class phone//super class or base class

{
	void on()
	{
		System.out.println("Phone onn...");
		
	}
	void off()
	{
		System.out.println("Phone off...");
		
	}
}
class Iphone12 extends phone//sub class or child class

{
	void takePhoto()
	{
		System.out.println("Take photo....");
	}
	void iosUpdate()
	{
		System.out.println("Ios update....");
	}
	
}
class SamsungGalaxy8
{
	void FaceSensor()
	{
	}
}



