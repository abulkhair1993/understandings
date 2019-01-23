package com.practice;

class Test extends Thread implements Runnable{
	public Test(String s)
	{
		super(s);
	}
	public void run()
	{
		System.out.println("Run ");
	}
	public void run(int i)
	{
		System.out.println("overload ");
	}
}
public class MyThread
{
	public static void main(String args[])
	{
		System.out.println("one ");
		Test t = new Test("jerk");
		t.start();
		System.out.println(t.currentThread().getName());
	}
}

