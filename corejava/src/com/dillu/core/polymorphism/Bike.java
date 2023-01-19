package com.dillu.core.polymorphism;

public class Bike {
	
	void start()
	{
		System.out.println("bike start");
	}

}
class Pulser extends Bike{
	
	void start()
	{

	System.out.println("pulser start");
}
}
