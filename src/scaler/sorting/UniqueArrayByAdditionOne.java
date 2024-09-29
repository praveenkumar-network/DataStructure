package scaler.sorting;

import java.util.Arrays;
import java.util.Comparator;

public class UniqueArrayByAdditionOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer array[] = new Integer[] {2,4,5};
		Integer array[] = new Integer[] {5 , 4,1};
		System.out.println(uniqueArrayByIncrementingOne(array));

	}
	private static int uniqueArrayByIncrementingOne(Integer array[]) {
		Comparator<Integer> comparator = (o1 , o2)-> o1 - o2;
		Arrays.sort(array , comparator);
		
		int count = 0;
		for(int i = 0 ; i < array.length - 1 ; i++) {
			if(array[i] == array[i + 1]) {
				array[i + 1] = array[i + 1] + 1;
				count++;
			}
			
			if(array[i] > array[i + 1] ) {
				int different = array[i + 1] - array[i];
				different++;
				array[i + 1] = array[i + 1] + different;
				count = count + different;
						
			}
		}
		return  count;
	}

}
