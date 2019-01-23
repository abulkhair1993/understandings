package com.oops.impl;

public class Airtel implements ISim {
	private String username;
	public Airtel(String username)
	{
		super();
		this.username=username;
	}
	@Override
	public void sms()
	{
		System.out.println("Airtel Sending sms to "+ username);
	}
	
	@Override
	public void calling()
	{
		System.out.println("Airtel is to "+ username);
	}
	
}


