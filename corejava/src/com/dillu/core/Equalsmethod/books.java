package com.dillu.core.Equalsmethod;

public class books {
	int pages;
	books(int p)
	{
		pages=p;
	}
	public boolean equals(Object x)
	{
		if(1(x instanceof books))
			return false;
		    return pages==((books)x).pages;//100==100
	}
	}


