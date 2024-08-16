package stack;

import java.util.Stack;

public class ValidParentheses {
	// https://www.youtube.com/watch?v=CNOoP25NpfQ&t=619s
	public static void main(String[] args) {
		
		String input = "[(])";
		System.out.println(checkValidParentheses(input));

	}
	private static boolean checkValidParentheses(String input) {
		if(input.length() % 2 != 0) {
			return false;
		}
		Stack<Character> stack = new Stack<>();
		for(int i = 0 ; i < input.length() ; i++) {
			if(input.charAt(i) == '{' || input.charAt(i) == '(' ||input.charAt(i) == '[') {
				stack.push(input.charAt(i));
			}else{
				if(stack.isEmpty()) {
					return false;
				}
				if(input.charAt(i) == '}' && stack.peek() != '{'){
					return false;
				}else if(input.charAt(i) == ')' && stack.peek() != '(') {
					return false;
				}else if(input.charAt(i) == ']' && stack.peek() != '[') {
					return false;
				}else {
					stack.pop();
				}
			}
			
		}
		return stack.isEmpty()? true : false;
	}

}
