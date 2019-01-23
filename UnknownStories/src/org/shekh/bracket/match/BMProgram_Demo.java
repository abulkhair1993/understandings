package org.shekh.bracket.match;

public class BMProgram_Demo {

	public static void main(String[] args) {
		
		String str = "({[(])})";
		//String str = "{([123(){ABC}(Hello[Abul])]AB)}";
		char[] charArray = str.toCharArray();
		StringBuilder builderS = new StringBuilder();
		StringBuilder builderD = new StringBuilder();
		for (int i=0; i < charArray.length ; i++) {
			if(charArray[i] == '(' || charArray[i] == '[' || charArray[i] == '{' || charArray[i] == ')' || charArray[i] == '}' || charArray[i] == ']')
			builderS.append(charArray[i]);
		}
		System.out.println(builderS.toString());
		
		for(int i=0 ; i < builderS.length() ; i++){
			int len = builderD.length();
			if(builderS.charAt(i) == '(' || builderS.charAt(i) == '[' || builderS.charAt(i) == '{') {
				builderD.append(builderS.charAt(i));
			}else if(builderS.charAt(i) == ']' && builderD.charAt(len -1 ) == '[') {
				builderD.deleteCharAt(len -1);
			}else if(builderS.charAt(i) == '}' && builderD.charAt(len -1 ) == '{') {
				builderD.deleteCharAt(len -1);
			}else if(builderS.charAt(i) == ')' && builderD.charAt(len -1 ) == '(') {
				builderD.deleteCharAt(len -1);
			}
			
		}
		if(builderD.length() == 0){
			System.out.println("Matched");
		}else {
			System.out.println("Not Matched");
		}
		
	}

}
