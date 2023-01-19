package com.dillu;

public class Binarysearch6 {
	public static void main(String[] args) {
		
		int  a[]= {2,3,4,5,6,7,8,9,12,23};
		int srch=6;
		int l=0;
		int h=a.length-1;
		int m=(l+h/2);
		while(l<=h)
		{
			if(a[m]==srch)
			{
				System.out.println("element is at"  +m+"index position");
				break;
			}
			else if(a[m]<srch)
			{
				l=m+1;
			}
			else
			{
				h=m-1;
			}
			m=(l+h)/2;
		}
		if(l>h)
		{
			System.out.println("element is not found");
		
			}
		}
	}


