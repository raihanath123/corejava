package com.dillu.core.Abstraction;

public class Vechicletester {
	
	public static void main(String[] args) {
		
		Bicycle b1=new Bicycle();
		b1.changeGear(2);
		b1.speedUp(3);
		b1.applyBrake(1);
		System.out.println("Bicycle Printing");
		b1.display();
		
		Bike b2=new Bike();
		b2.changeGear(3);
		b1.speedUp(4);
		b2.applyBrake(7);
		System.out.println("Bike Printing");
		b2.display();
		
	}

}
