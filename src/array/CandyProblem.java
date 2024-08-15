package array;

import java.util.Arrays;

public class CandyProblem {
//https://www.youtube.com/watch?v=PzBYQA6FshA&t=774s
//https://www.geeksforgeeks.org/minimum-number-of-candies-required-to-distribute-among-children-based-on-given-conditions/
	public static void main(String[] args) {
		 int array[] = { 1, 3 ,2 ,6 ,4 , 9 , 2 , 1 };
		 int leftArray[] = new int[array.length];
		 int rightArray[] = new int[array.length];
		 
		 Arrays.fill(leftArray, 1);
		 Arrays.fill(rightArray, 1);
		 
		 for(int i = 1 ; i < array.length ; i++) {
			if(array[i] > array[i - 1]) {
				leftArray[i] = leftArray[i - 1] + 1;
			}
		 }
		 
		 for(int i = array.length - 2 ; i >= 0 ; i--) {
				if(array[i] > array[i + 1]) {
					rightArray[i] = rightArray[i + 1] + 1;
				}
			 }
		 
		 int sum = 0 ;
		 for(int i = 0 ; i < array.length ; i++) {
			 sum = sum + Math.max(leftArray[i], rightArray[i]);
		 }
		 System.out.println(sum);

	}

}
