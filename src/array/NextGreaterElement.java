package array;

import java.util.Stack;

public class NextGreaterElement {
//https://www.youtube.com/watch?v=NXOOYYwpbg4
	//https://www.youtube.com/watch?v=8P3e34EgVyY
	public static void main(String[] args) {

		int array[] = { 11, 13, 21, 3 };
		//int array[] = {13 , 7, 6 , 12};
		Stack<Integer> stack = new Stack<>();
		int ans[] = new int[array.length];
		for(int i = array.length - 1 ; i >= 0 ; i--) {
			while(!stack.isEmpty() && array[i] > stack.peek()) {
				stack.pop();
			}
			if(stack.isEmpty()) {
				ans[i] = -1;
			}else {
				ans[i] = stack.peek();
			}
			stack.push(array[i]);
		}
		
		for(int i : ans) {
			System.out.print(i+" ");
		}
		
	}

}
