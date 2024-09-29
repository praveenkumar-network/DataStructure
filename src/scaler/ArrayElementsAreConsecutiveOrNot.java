package scaler;

import java.util.HashSet;
import java.util.Set;

public class ArrayElementsAreConsecutiveOrNot {
	public static void main(String[] args) {
		int array[] = {100 ,101,105,104,103,102 ,110};
		System.out.println(ArrayElementsAreConsecutiveOrNot(array));

	}
	private static boolean ArrayElementsAreConsecutiveOrNot(int array[]) {
		int min = Integer.MAX_VALUE ;
		int max = Integer.MIN_VALUE ;
		int sum = 0;
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] < min) {
				min = array[i];
			}
			if(array[i] > max) {
				max = array[i];
			}
			
			sum = sum + array[i];
		}
		
		int naturalNoSumOfAllElement = max *( max + 1) / 2;
		int naturalNoSumTillMinElement = min *( min + 1) / 2;
		int diff = naturalNoSumOfAllElement - naturalNoSumTillMinElement + min;
		if(sum == diff && ((max - min + 1) == array.length)) {
			return true;
		}
		return false;
	}

}
