package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingIntervals {
// https://www.youtube.com/watch?v=wcklHq0qs4g
// https://www.youtube.com/watch?v=zCLjBkLzK_s
	public static void main(String[] args) {
		int array[][] = {{1,3},{2,4},{6,8},{9,10}};
		//int array[][] ={{6,8},{1,9},{2,4},{4,7}};
		array = overLapping(array);
		for(int arr[] : array) {
			System.out.println(arr[0]+" "+arr[1]);
		}

	}
	private static int[][] overLapping(int array[][]){

		Comparator<int[]> c = (interval1 , interval2)-> interval1[0] - interval2[0] ;
		Arrays.sort(array , c );
		int firstArray[] = array[0];
		int currentstart = firstArray[0];
		int currentEnd = firstArray[1];
		List<int[]> ans = new ArrayList<>();
		
		for(int i = 1 ; i < array.length ; i++) {
			int localArray[] = array[i]; 
			int nextStart = localArray[0]; 
			int nextEnd = localArray[1];
			if(currentEnd >= nextStart) {
				currentEnd = Math.max(currentEnd, nextEnd);
			}else {
				int arr[] = new int[2];
				arr[0] = currentstart;
				arr[1] = currentEnd;
				ans.add(arr);
				currentstart = localArray[0];
				currentEnd = localArray[1];
			}
		}
		int arr[] = new int[2];
		arr[0] = currentstart;
		arr[1] = currentEnd;
		ans.add(arr);
		return ans.toArray(new int[ans.size()][]);
	}

}
