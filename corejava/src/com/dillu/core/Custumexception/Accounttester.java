package com.dillu.core.Custumexception;
import java.util.Scanner;
public class Accounttester {
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  Account a1=new Account(5000);
	  do
	  {
		  System.out.println("1---->Check Balance ");
		  System.out.println("2----->Cash Withdraw");
		  System.out.println("3----->Pin Change");
		  int ch=sc.nextInt();
		  switch(ch){
		  
			  case 1:
				  a1.getBlance();
				  break;
			  case 2:
				  System.out.println("Enter the amount");
				  double d=sc.nextDouble();
				  try
				  {
					  a1.withdraw(d);
				  }
				  catch(Exception e)
				  {
					  System.out.println("Withdraw failure");
				  }
				 
				  break;
				  
			  case 3:
				  a1.pinChange();
				  break;
				  
			default:
				System.out.println("invalid option");
		  }
		   System.out.println("Do you want to continue");
		   System.out.println("0----->Continue   1---->Exit");
		   d=sc.nextInt();
	  }while(d==0)
	  {
		  System.out.println("---->Thank You<----");
				  
		  }
	  }
  }

