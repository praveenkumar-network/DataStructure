package array;

public class SnowPackProblem {
//https://www.youtube.com/watch?v=bBbs6YPA6yc
	public static void main(String[] args) {
		int array[] = { 0, 1, 3, 0 ,1 ,2 ,0 ,4 ,2 , 0 , 3, 0  };
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
		int maxSnowCollected = 0 ;
		for(int i = 0 ; i < array.length ;i++) {
			maxSnowCollected  +=  Math.min(right[i] ,  left[i]) - array[i];
		}
		System.out.println(maxSnowCollected);
	}

}
