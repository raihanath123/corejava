package com.dillu.core.Arrayimplimantationlist;
//ArrayList Implimentation
public class Arrayimplimentationlist {

	Object[]arr=new Object[3];
	private int p=0;
	public void add(Object ele)
	{
		if(p>=arr.length)
		
			increase();
			arr[p++]=ele;
	}
	public void increase()
	{
		System.out.println("calling");
		int newsize=arr.length+(arr.length/2);
		Object[]newArr=new Object[newsize];
		for(int i=0;i<arr.length;i++)
		{
			newArr[i]=arr[i];
		}
		System.out.println(newArr.length);
		newArr=arr;
	}
	public Object get(int index)
	{
		if(index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		return arr[index];
	}
	public int size()
	{
		return p;
	}
	public String toString()
	{
		if(size()==0)
		return"[]";
		String s1="["+get(0);
		for(int i=1;i<size();i++)
		{
			s1=s1+","+get(i);
		}
			s1=s1+"]";
			return s1;
		}
		public void delete()
		{
		}
	
		
		
	}

