package com.practice.pattern;

import java.util.Scanner;
public class MaxSquare {
	
	public static void main(String[] args) {

		
		
		int [] arrInt ={1,0,0,1,0,1,1,1 , 0,1,1,1 , 0,1,1,1};
		for(int i = 1;i < arrInt.length; i++)
			{
				if(i % 4 ==0)
				{
					System.out.print(arrInt[i]+"\n");
				}else
				{
					System.out.print(arrInt[i]+" ");
				}
			}
		
	}

	
}
