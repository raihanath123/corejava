package com.dillu.core.returnobject;

public class Book {
	
	
	
	//How to return an object from method


	     String title;
	     String author;
	     double price;
	     Book(String t,String a,double p)
	     {
	    	 title=t;
	    	 author=a;
	    	 price=p;
	     }
	     void display()
	     {
	    	 System.out.println("Title="+title);
	    	 System.out.println("Author="+author);
	    	 System.out.println("Price="+price);
	     }
		}


