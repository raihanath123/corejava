package com.dillu.core.comparableIn;
import java.util.Arrays;
public class BookTester 
{
public static void main(String[] args) {
	
	Book[]arr= {new Book("java",340),
			    new Book("php",210),
			    new Book("c",180),
			    new Book("android",450)};
	  Arrays.sort(arr);
	  for(Book c:arr)
	  {
		  System.out.println(c);
	}
}
}
