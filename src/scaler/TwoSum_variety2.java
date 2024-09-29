package scaler;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_variety2 {
// https://www.youtube.com/watch?v=UXDSeD9mN-k
	public static void main(String[] args) {
		int array[] = {1,5,7,1};
		int sum = 6;
		int ans[] = twoSum(array, sum);
		System.out.println(ans[0] +" "+ans[1]);

	}
	private static int[]  twoSum(int array[] , int sum) {
		Map<Integer , Integer> map = new HashMap<>();
		for(int i = 0 ;i < array.length ; i++) {
			if(array[i] > sum) {
				continue;
			}
			int target = sum - array[i];
			if(map.containsKey(target)) {
				map.put(array[i], i);
				return new int[] {i , map.get(target)};
			}else {
				map.put(array[i], i);
			}
		}
		return  new int[] {-1 , -1};
	}

}
