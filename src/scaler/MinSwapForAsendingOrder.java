package scaler;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MinSwapForAsendingOrder {
// https://www.geeksforgeeks.org/minimum-number-swaps-required-sort-array/
// https://www.youtube.com/watch?v=KA3pmKnHiIw
	public static void main(String[] args) {
		 int array[] =  {101, 758, 315, 730, 472, 619, 460, 479};
		 //int array[] =  {1, 5, 4, 3, 2};
		System.out.println(minSwap(array));
	}
	private static int  minSwap(int array[]) {
		int cloneArray[] = Arrays.copyOf(array, array.length);
		Arrays.sort(cloneArray);
		Map<Integer , Integer> map = new HashMap<>();
		for(int i = 0 ; i < cloneArray.length ; i++) {
			map.put(cloneArray[i], i);
		}
		int swapCount = 0;
		for(int i = 0 ; i < array.length ; ) {
			if(i == map.get(array[i])) {
				i++;
			}else {
				swap(array , i , map.get(array[i]));
				swapCount++;
			}
		}
		return swapCount;
	}
	private static void swap(int array[] , int i , int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	 
	

}
