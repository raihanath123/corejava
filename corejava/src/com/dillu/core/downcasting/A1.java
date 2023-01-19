package com.dillu.core.downcasting;

public class A1 {
	void test1()
	{
		System.out.println("test 1 in A");
	}

}
class B extends A1
{
   void  test2()
   {
   System.out.println("test 2 in B");
   }
   
}
class C extends A1
{
	void test3()
	{
		System.out.println("test  3 in C ");
}
}

