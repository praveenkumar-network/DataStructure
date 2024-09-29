package scaler;

import java.util.HashMap;
import java.util.Map;

public class CountPairWithGivenSum {
	// https://www.youtube.com/watch?v=NC9r8D2QnHk
	public static void main(String[] args) {
		int array[] = {1,5,7,1};
		int sum = 6;
		
		System.out.println(CountPairWithGivenSum(array , sum));
	}
	
	private static int CountPairWithGivenSum(int array[] , int sum) {
		Map<Integer , Integer> map = new HashMap<>();
		int count = 0;
		for(int i = 0 ; i < array.length ; i++) {
			if( array[i] > sum) {
				continue;
			}
			int target = sum - array[i];
			count = count + map.getOrDefault(target, 0);
			map.put(array[i], map.getOrDefault(array[i], 0) + 1);
		}
		return count;
	}

}
