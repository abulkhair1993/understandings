/*
 * This program tries to counts max and min number of 1's from string 
 * 
 * */

package com.practice;

public class MaxAndMinOnes {
	public static void main(String args[])
	{
		String input = "01111011111111111100000000001100000000000011111111111111111111111111111110111111111111111";
		String[] arr = input.split("0");
		int high = 0;
		int low = 10000;
		for (int i = 0;i<arr.length; i++)
		{
			if(null != arr[i] && arr[i] != "" && arr[i].contains("1"))
			{
				if(null != arr[i])
				{
					int temp = arr[i].length();
					
					if(temp > high)
					{
						high = temp;
					}
					if(temp < low)
					{
						low = temp;
					}
				}
			}
		}
		System.out.println("highest " +high);
		System.out.println("low " +low);
		
		boolean flag = false;
		if(!flag)
		System.out.println("A");
		else
			System.out.println("B");
		
	}

}
