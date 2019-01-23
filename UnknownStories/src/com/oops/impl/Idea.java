package com.oops.impl;

public class Idea implements ISim , ISimVoiceAndCalling{
	private String username;
	public Idea(String username)
	{
		this.username = username;
	}
	@Override
	public void sms() {
		System.out.println("Idea is sending sms to "+username);
		
	}
	@Override
	public void calling() {
		System.out.println("Idea is calling to "+username);
		
	}
	@Override
	public void videoCalling() {
		System.out.println("Idea is video calling to "+username);
		
	}
	

}
