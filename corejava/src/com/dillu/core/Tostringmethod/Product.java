package com.dillu.core.Tostringmethod;

public class Product {
	String names;
	int price;
	public Product (String names ,int price)
	{
		this.names="soap";
		this.price=10;
		
	}
	public String toString()
	{
		return "Product[name="+names+",price="+price+"]";
		}

}
