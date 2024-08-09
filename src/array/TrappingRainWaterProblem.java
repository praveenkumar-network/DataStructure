package array;

public class TrappingRainWaterProblem {

	public static void main(String[] args) {
		int array[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		
		int left[] = new int[array.length];
		int right[] = new int[array.length];
		
		left[0] = array[0];
		
		for(int i = 1 ; i < array.length ; i++) {
			left[i] = Math.max(array[i], left[i - 1]);
		}
		
		right[array.length -1] = array[array.length -1];
		for(int j = array.length -2 ; j >= 0 ; j--) {
			right[j] = Math.max(array[j], right[j + 1]);
		}
		int maxWaterCollected = 0 ;
		for(int i = 0 ; i < array.length ;i++) {
			maxWaterCollected  +=  Math.min(right[i] ,  left[i]) - array[i];
		}
		System.out.println(maxWaterCollected);
	}

}
