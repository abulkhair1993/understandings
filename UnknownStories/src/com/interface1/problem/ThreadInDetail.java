package com.interface1.problem;

class Parent {
	int val;
	/*private void retro()
	{
		System.out.println("without param");
	}
	private void retro(int a)
	{
		System.out.println("with param");
	}*/
	public static void m1()
	{
		System.out.println("parent m1");
	}
	
	double cal(byte x , double y)
	{
		return (short) x/y*2;
	}
}

class Child extends Parent
{
	public static void m1()
	{
		System.out.println("child m1");
	}
	/*private void retro(int i)
	{
		System.out.println("overloading");
	}*/
}
public class ThreadInDetail
{
	public static int a;
	public static void main(String args[])
	{
		modify(a);
		System.out.println(a);
	}
	public static void modify(int a)
	{
		a++;
	}

	/**
	 * output
	 * 0
	 * true
     * 1
	 * false
	 * ThredIndetails running...
	 */
	private static void loopConcept() {
		boolean flag;int i=0;
		do
		{
			flag = false;
			System.out.println(i++);
			flag = i<2;
			System.out.println(flag);
			continue;
		}while((flag) ? true : false);
		System.out.println("ThredIndetails running...");
	}
}