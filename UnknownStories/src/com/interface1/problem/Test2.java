package com.interface1.problem;

class A
{
	void m1(A a)
	{
		System.out.println("a");
	}
}
class B extends A
{
	void m1(B b)
	{
		System.out.println("b");
	}
}
class C extends B
{
	void m1(C c)
	{
		System.out.println("c");
	}
}


public class Test2 {

	public static void main(String[] args) {
		C obj = new C();
		obj.m1(new C());

	}

}
