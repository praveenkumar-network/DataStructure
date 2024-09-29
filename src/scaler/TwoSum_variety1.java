package scaler;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_variety1 {
// https://www.youtube.com/watch?v=UXDSeD9mN-k
	public static void main(String[] args) {
		int array[] = {1,5,7,1};
		int sum = 6;
		System.out.println(twoSum(array, sum));

	}
	private static boolean twoSum(int array[] , int sum) {
		Map<Integer , Integer> map = new HashMap<>();
		for(int i = 0 ;i < array.length ; i++) {
			if(array[i] > sum) {
				continue;
			}
			int target = sum - array[i];
			if(map.containsKey(target)) {
				map.put(array[i], 1);
				System.out.println(array[i] +" "+map.get(target));
				return true;
			}else {
				map.put(array[i], 1);
			}
		}
		return false;
	}

}
