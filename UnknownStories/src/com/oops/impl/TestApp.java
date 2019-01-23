package com.oops.impl;

import java.io.IOException;

public class TestApp {
	public static void main(String args[])
	{
		System.out.println("Main");
			Child c = new Child(12);
			Parent p = new Parent();
			//p.action(p);
			c.action(null);
			
			
	}
}



class Parent
{
	/*public Parent(int a)
	{
		System.out.println("parent ");
	}*/
	
	/*public void action(String s)
	{
		System.out.println("String will invoke : "+s);
	}*/
	
	public void action(int s) throws Exception 
	{
		System.out.println("Int will invoke "+ s);
	}
	
	public void action(double d)
	{
		System.out.println("double will invoke "+ d);
	}
	public void action(Object d)
	{
		System.out.println("Object will invoke "+ d);
	}
}

class Child extends Parent
{
	public Child(int a)
	{
		//super(a);
		System.out.println("Child.. ");
	}
	
	public void action(String c)
	{
		if(c==null)
		{
			throw new NullPointerException("Null pointer exception occured");
		}
	}
}
