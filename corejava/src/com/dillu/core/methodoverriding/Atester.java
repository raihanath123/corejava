package com.dillu.core.methodoverriding;

public class Atester {

	public static void main(String[] args) {
		B b1=new B();
		b1.m1();
		b1.m2();
		C c1=new C();
		c1.m1();
		c1.m2();
	}
}
