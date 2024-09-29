package scaler;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
// https://www.youtube.com/watch?v=d_c0MShvsdk
	public static void main(String[] args) {
		int array[] = {100 , 4 , 200 , 1 , 3 ,2};
		System.out.println(longestConsecitiveSequenceCount(array));

	}
	private static int longestConsecitiveSequenceCount(int array[]) {
		Set<Integer> set = new HashSet<>();
		for(int element : array){
			set.add(element);
		}
		
		int count = 0;
		for(int i = 0 ; i < array.length ; i++) {
			if(!set.contains(array[i] - 1 )) {
				int searchObj = array[i];
				while(set.contains(searchObj)) {
					searchObj = searchObj + 1;
				}
				count = Math.max(count, searchObj - array[i]);
			}
		}
		return count;
	}

}
