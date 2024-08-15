package array;

public class FirstMissingNumber {
//https://www.geeksforgeeks.org/find-the-first-missing-number/
	public static void main(String[] args) {
		int array[] = {4, 5, 10, 110, 1, 2, 6, 9 };
		
		int missingNo = firstPositiveMissingNo(array);
		System.out.println(missingNo);

	}
	private static int firstPositiveMissingNo(int array[]) {
		for(int i = 0 ; i < array.length ; i++) {
			int element = array[i];
			//this if condition is for negative no
			if(element >= 1 && element <= array.length) {
				int index = element - 1;
				if(array[index] != element) {
					swap(array ,  i , index);
					i--;
				}
			}
			
		}
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i] != i + 1 ) {
				return i+1;
			}
		} 
		//if all the element at their index than this condition will execute
		return array.length + 1;	
	}
	private static void swap(int array[] , int i , int j) {
		int element = array[i];
		array[i] = array[j];
		array[j] = element;
	}

}
