package com.dillu.core.returnobject;

import java.util.Scanner;



public class Bookcreator {
	
	
	Book createNewBook()
	{
		
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Title");
	String t= sc.next();
	System.out.println("Enter the Author");
	String a=sc.next();
	System.out.println("Enter the Price");
	double p=sc.nextDouble();
	return new Book(t,a,p);
}
}




