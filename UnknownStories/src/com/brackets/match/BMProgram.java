package com.brackets.match;

public class BMProgram {

	public static void main(String[] args) {

		//String input = "[[as()]]";
		String input = "{([123(){ABC}(Hello[Abul])]AB)}";
		char[] arr = input.toCharArray();
		int count = arr.length;

		StringBuilder builder = new StringBuilder();
		//builder.append("[[as()]]");
		
		for (int i = 0; i < count; i++) {
			if (arr[i] == '['){
				builder.append(arr[i]);
				System.out.println(builder.toString());
			}
			else if (arr[i] == '{'){
				builder.append(arr[i]);
				System.out.println(builder.toString());
			}	
			else if (arr[i] == '('){
				builder.append(arr[i]);
				System.out.println(builder.toString());
			}
			else if (arr[i] == ']') {
				System.out.println("A" + builder.charAt(builder.length() -1));
				System.out.println(" L" + builder.length());
				if(builder.charAt(builder.length() -1) == arr[i]){
					builder.deleteCharAt(builder.length() -1);
					
					System.out.println(builder.toString());
				}
			} else if (arr[i] == '}') {
				System.out.println("A" + builder.charAt(builder.length() -1));
				System.out.println(" L" + builder.length());
				if(builder.charAt(builder.i) == arr[i]){
					builder.deleteCharAt(builder.length() -1);
					
					System.out.println(builder.toString());
				}
			} else if (arr[i] == ')') {
				System.out.println("A" + builder.charAt(builder.length() -1));
				System.out.println(" L" + builder.length());
				if(builder.charAt(builder.length() -1) == arr[i]){
					builder.deleteCharAt(builder.length() -1);
					
					System.out.println(builder.toString());
				}
			}

		}
		System.out.println(builder.toString());
	}

}
