package scaler;

public class minSwapToBring_k_ElementTogether {
// https://www.youtube.com/watch?v=yXjVfeWzyAM
	public static void main(String[] args) {
		int array[] = { 2,7,9,5,8,7,4};
		int k = 6;
		System.out.println(minSwap(array, k));

	}
	private static int minSwap(int array[] , int k) {
		int slidingWindowLength = 0;
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] <= k) {
				slidingWindowLength++;
			}
		}
		
		int unwantedElementCountIndWindow = 0;
		for(int i = 0 ; i < slidingWindowLength ;i++) {
			if(array[i] > k) {
				unwantedElementCountIndWindow++;
			}
		}
		
		int ans = unwantedElementCountIndWindow;
		for(int l = 0 , r = slidingWindowLength ;  r < array.length ; r++ , l++) {
			if(array[r] > k) {
				unwantedElementCountIndWindow++;
			}
			if(array[l] > k) {
				unwantedElementCountIndWindow--;
			}
			ans = Math.min(ans, unwantedElementCountIndWindow);
		}
		return ans;
	}

}
