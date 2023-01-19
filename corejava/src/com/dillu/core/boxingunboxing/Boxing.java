package com.dillu.core.boxingunboxing;

public class Boxing {
	public static void main(String[] args) {
		
		int i=10;
		Integer s=new Integer(i);//Boxing
		System.out.println(s);
		int k=s.intValue();//unboxing
	
		Double l=new Double(25.5);//boxing
		System.out.println(l.doubleValue());//unboxing
		//autoBoxing &autoUnboxing
		Integer d=25;//Autoboxing  int---->IntegerautoBoxing--->Object AutoUpcasting.
		int h=(int)d;//AutoUnboxing object--->Downcasting---Integer----Autounboxing----int;
	     Boolean b=false;
	     System.out.println(b);
	}

}
