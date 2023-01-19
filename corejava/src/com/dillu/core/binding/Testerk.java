package com.dillu.core.binding;

public class Testerk {
	
	public static void main(String[] args) {
		
		m1(new B());//A a1=new B-upcasting
		m1(new C());
	}
	static void m1(K k1)
	{
		k1.test1();//rp  late binding
		
		k1.test2();//compile  early binding
	}

}
