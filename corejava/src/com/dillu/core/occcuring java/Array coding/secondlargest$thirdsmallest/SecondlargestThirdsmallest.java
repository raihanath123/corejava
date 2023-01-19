package com.dillu;

public class SecondlargestThirdsmallest {
	public static void main(String[] args) {
		
		int a[]={5,8,12,7,6,2,4};
		
		int k=2;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
				if(i==k-1)
				{
					System.out.println(k+"largest element is"+a[i]);
					
				}
			}
				System.out.println("sorted array");
				for(int i=0;i<a.length-1;i++)
					
				{
					System.out.println(a[i]+"");
				}
				int m=3;
				for(int i=0;i<a.length-1;i++)
				{
					for(int j=i+1;j<a.length;j++)
					{
						if(a[i]>a[j])
						{
							int temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
						if(i==m-1)
						{
							System.out.println(m+"smallest element is"+a[i]);
							
						}
					}
						System.out.println("sorted array");
						for(int i=0;i<a.length-1;i++)
							
						{
							System.out.println(a[i]+"");
						}
			}
		}
	


