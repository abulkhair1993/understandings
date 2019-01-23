package com.practice.pattern;

public class DetailException {
	public static void main(String args[])
	{
		String str = new String("Abul");
	//	System.out.println("abul".hashCode()); 
		String[] s = str.split("u");
		for(String s1 : s)
		{
			System.out.println(s1);
		}
	}
	

}