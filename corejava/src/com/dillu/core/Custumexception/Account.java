package com.dillu.core.Custumexception;

public class Account {

	double balance;
	public Account(double balance)
	{
		super();
		this.balance=balance;
	}
	public void withdraw(double amt) throws InsuffientBalanceException
	{
		if(balance>amt)
		{
			System.out.println("Shortage of"+(amt-balance)+" Rs");
			throw new InsuffientBalanceException();
		}
		else
			
		{
			balance-=amt;
			System.out.println("Withdraw Sucess");
		}
	}
	public void getBlance()
	{
		System.out.println("Current Balance="+balance);
	}
    public void pinChange()
    {
    	System.out.println("Enter your old pin");
    }
	}

