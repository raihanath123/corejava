package com.dillu.core.interfaceexample;

public interface Switch
{
   void on();
   void off();
   int a=25;
	


}
class Fan implements Switch
{
	
	public void on()
	{
		System.out.println("Fan on");
	}

	public void off()
	{
		System.out.println("Fan off");
	}
}
class Bulb implements Switch
{
	
	public void on()
	{
		System.out.println("Bulb on");
	}
	
	public void off()
	{
		System.out.println("Bulb off");
	}
}
