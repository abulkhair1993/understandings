package com.adaptor.design;

public class AppleAdaptor extends Apple {
	private Orange orange;
	public AppleAdaptor(Orange orange)
	{
		this.orange =  orange;
	}
	
	public void getAColor(String str)
	{
		orange.getOColor(str);
	}
}
