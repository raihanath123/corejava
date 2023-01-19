package com.dillu.core.Abstraction;

public interface Vechicle
{
      void changeGear(int g);
      void speedUp(int s);
      void applayBrake(int a);
}
class Bicycle implements Vechicle
{
	int speed;
	int gear;
	public void changeGear(int g)
	{
		gear=g;
	}
	public void speedUp(int s)
	{
		speed=s+speed;
	}
	public void applyBrake(int a)
	{
		speed=speed-a;
	}
	void display()
	{
		System.out.println("Speed="+speed+"gear="+gear);
	}
}
class Bike implements Vechicle
{
	int speed=4;
	int gear;
	public void changeGear(int g)
	{
		gear=g;
	}
	public void speedUp(int s)
	{
		speed=s+speed;
	}
	public void applyBrake(int a)
	{
		speed=speed-a;
	}
	void display()
	{
	System.out.println("speed="+speed+"gear="+gear);
	}
}