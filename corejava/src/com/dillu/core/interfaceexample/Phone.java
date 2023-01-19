package com.dillu.core.interfaceexample;

 public class Phone 
 {
	 
   void on();
   void dial();
 }

	 
class Cameraphone
{
	void takePhoto()
	{
		System.out.println("Taking Photo ");
	}
	void on()
	{
		System.out.println("camera pone on");
	}
}
class Nokia extends Cameraphone implements Phone
{
	public void dial()
	{
		System.out.println("dialing number");
		
		
	}
	public void on()
	{
		System.out.println("Camera phone on");
	}
}
	

	 
	


