package com.dillu.core.methodoverriding;

public class A {

       void m1()
       {
	System.out.println("m1 in A");
       }
      void m2()
      {
    	  System.out.println("m2 in A");
      }
}
class B extends A
{
	void m1()
	{
		System.out.println("m1 in B");
	}
}
class C extends B
{
	void m2()
	{
		System.out.println("m2 in C");
	}
}


