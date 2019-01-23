package com.adaptor.design;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
		Apple a1 = new Apple();
		a1.getAColor("red");
		
		Orange orange = new Orange();
		AppleAdaptor appleAdaptor =new AppleAdaptor(orange);
		appleAdaptor.getAColor("green");
		String[] fruits={"apple","banana","cherry"};
		java.util.List<String> list = Arrays.asList(fruits);
		java.util.ArrayList<String> l = new java.util.ArrayList<String>(list);
		System.out.println(list);
		Set s =new HashSet<>(list);
		System.out.println(s);
		l.add("apple");
		s.add("banana");
		System.out.println(l);
		System.out.println(s);
		
		
		
	}

}
