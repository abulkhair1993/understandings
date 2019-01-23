package com.brackets.match;

public class BracketMatchDemo {
	static boolean result;

	public static void main(String[] args) {
		//String inputString= "{([123(){ABC}(Hello[Abul])]AB)}"; //not macted : {(]}
			String inputString= "{[(AB)]}";
			System.out.println(inputString);
			char orgArr[] = inputString.toCharArray();
			System.out.println(orgArr.length);
			int count = orgArr.length;
			System.out.println("count "+count);
			int curleyBopen = 0;
			int curleyBClose = 0;
			int bracketOpen = 0;
			int bracketClose = 0;
			int squareBOpen = 0;
			int squareBClose = 0;
			for(int i = 0;i<count;i++)
				{
					char tempChar = orgArr[i];				
					if(tempChar != ' ')
					{
						switch(tempChar)
						{
						case '{' : curleyBopen++; break;
						case '}' : curleyBClose++; break;
						case '(' : bracketOpen++; break;
						case ')' : bracketClose++; break;
						case '[' : squareBOpen++; break;
						case ']' : squareBClose++; break;
						}
					}
					
				}
			
			if(curleyBopen == curleyBClose && bracketOpen == bracketClose && squareBOpen == squareBClose)
			{
				System.out.println("Match found");
			}else
			{
				System.out.println("Match not found");
			}
			
	}
}


/*class CustomStack
{
	char[] chararray;
	int top = -1;
	public CustomStack()
	{
		chararray = new char[50];
	}
	public CustomStack(int size)
	{
		chararray = new char[size];
	}
	
	
	public void push(char value)
	{
		//need to write if char array will over flow
		if(top == -1)
		{
			top++;
			chararray[top] = value;
		}else
		{
			chararray[++top] = value;
		}
		
		//System.out.println("Added : "+ value);
		
		
	}
	
	public char pop()
	{
		if(top == -1)
		{
			return ' ';
		}
		char returnValue = chararray[top];
		top--;
		return returnValue;
	}
}

*/