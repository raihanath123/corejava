package com.dillu.core.ComparableIn;

public class Book implements comparable
{
   
	String title;
	int pages;
	
	public Book(String title,int pages)
	{
	
		super();
		this.title = title;
		this.pages = pages;
	}
	//@override
	public String toString()
	{
		return "Book [title=" + title + " , pages=" +pages+"]";
	
	}
	//@override
	public int compareTo(Object x)
	{
		Book b=(Book)x;
		return 0;
	}
}
