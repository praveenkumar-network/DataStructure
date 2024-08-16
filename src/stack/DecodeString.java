package stack;

import java.util.Stack;

public class DecodeString {
//https://www.youtube.com/watch?v=bjprC1Pvu2Y&t=261s
	public static void main(String[] args) {
		String input = "3[a2[c]]";
		System.out.println(decodeString(input));
	}
	private static String decodeString(String input) {
		//String input = "3[a]2[bc]";
		
		Stack<StringBuilder> stringStack = new Stack<>();
		Stack<Integer> noStack = new Stack<>();
		int no = 0;
		StringBuilder currentString = new StringBuilder();
				
		for(int i = 0 ; i < input.length() ; i++) {
			if(Character.isDigit(input.charAt(i))) {
				no = Integer.parseInt(input.charAt(i)+"");
			}else if(input.charAt(i) == '[') {
				noStack.push(no);
				no = 0;
				stringStack.push(currentString);
				currentString = new StringBuilder();
				
			}else if(input.charAt(i) == ']') {
				StringBuilder temp = currentString;
				currentString = stringStack.pop();
				no = noStack.pop();
				while(no >0) {
					currentString.append(temp);
					no--;
				}
			}else {
				currentString.append(input.charAt(i));
			}
		}
		return currentString.toString();
	}

}
