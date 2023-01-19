package com.dillu.core.downcasting;

public class dtester {
	public static void main(String[] args) {
		
		A1 a1=new B();//upcasting
	    B b1=(B)a1;//down casting
		b1.test1();
		b1.test2();
	}

}
