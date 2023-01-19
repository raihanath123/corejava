package com.dillu.core.methodoverriding;
//method overriding
public class Animal {
	void move()
	{
		System.out.println("Animal Moving");
		
	}

}
class Dog extends Animal
{
}
class Cat extends Animal
{
	void move()
	{
		System.out.println("Cat Moving");
	}
}

