package com.dillu.core.interfaceexample;

public class interfacetester {
	
	public static void main(String[] args) 
	{
		
	
	
	Switch s =new Fan();//upcasting
	s.on();
	s.off();
	Switch b =new Bulb();
	b.on();
	b.off();

}
}
