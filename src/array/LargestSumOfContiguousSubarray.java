package array;

public class LargestSumOfContiguousSubarray {
	//Illustration of Kadane’s Algorithm:
	// https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
	public static void main(String[] args) {
		int array[] = {-2,-3,4,-1,-2,1,5,-3};
		int max_so_far = Integer.MIN_VALUE , max_ending_here = 0;
		
		for(int i = 0; i < array.length ; i++) {
			max_ending_here = max_ending_here + array[i];
			max_so_far = Math.max(max_ending_here, max_so_far);
			if(max_ending_here < 0 ) {
				max_ending_here = 0;
			}
		}
		System.out.println(max_so_far);
	}

}
