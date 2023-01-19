package com.dillu.core.binding;

public class K {
	
	void test1()
	{
		System.out.println("test 1 in A");
		
	}
	static void test2()
	{
		System.out.println("test 2 in A");
		
		
	}
	}
class B extends K
{
  
  void test1()
  {
	  System.out.println("test 1 in B");
	  
	  
  }
  
 static void test2()
 {
	 System.out.println("test 2 in B");
 }
 
}
class C extends K
{
	void test1()
	{
		System.out.println("test 1 in C");
		
	}
	static void test2()
	{
		System.out.println("test 2 in C");
	
	}

}
