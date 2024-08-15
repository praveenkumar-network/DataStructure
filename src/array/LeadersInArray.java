package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInArray {
//https://www.youtube.com/watch?v=cHrH9CQ8pmY
	public static void main(String[] args) {
		int array[] = {16,17,4,3,5,2};
		Object[] ans = LeaderInArray(array);
		Arrays.stream(ans).forEach(o -> System.out.print(o+" "));

	}
	private static Object[] LeaderInArray(int array[]) {
		List<Integer> list = new ArrayList<>();
		int max = 0;
		for(int i = array.length -1 ; i >=0 ; i--) {
			if(array[i] > max) {
				max = array[i];
				list.add(0,array[i]);
			}
			
		}
		return list.toArray();
	}

}
