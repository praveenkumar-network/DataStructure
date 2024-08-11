package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DistanceFromNextGreaterElement {
//https://gemini.google.com/app/db7da5255265f1ac
	public static void main(String[] args) {
		int array[] = { 73, 74, 75, 71, 69, 72, 76, 73 };
		int ans[] = nextGreaterElement(array);
		Arrays.stream(ans).forEach(o-> System.out.print(o+" "));
			

	}
	private static  int[] nextGreaterElement(int array[]) {
		int ans[] = new int[array.length]; 
		Stack<Integer> stack  = new Stack<>();
		for(int i = array.length -1 ; i>=0 ; i--) {
			while(!stack.isEmpty() && array[i] >= array[stack.peek()]) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = 0;
			}else {
				ans[i] = stack.peek() - i;
			}
			stack.push(i);
		}
		return ans;
	}

}
