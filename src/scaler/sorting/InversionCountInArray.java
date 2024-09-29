package scaler.sorting;

import java.util.Arrays;

public class InversionCountInArray {
// https://www.youtube.com/watch?v=cdHEpbBVjRM
	// https://www.geeksforgeeks.org/inversion-count-in-array-using-merge-sort/
	public static void main(String[] args) {
		//int array[] = {7, 2, 6, 3};
		long array[] = {2,4,1,3,5};
		System.out.println("count : "+ mergeSort(array ,0 , array.length -1));
		Arrays.stream(array).forEach(o->System.out.print(o+" "));
		System.out.println();
		

	}
	 static long mergeSort(long array[] ,int left ,int right ){
		long count  = 0;
		if(left < right) {
			int mid = (left + right) / 2;
			count += mergeSort(array, left, mid);
			count += mergeSort(array, mid + 1, right);
			
			count += merge(array , left , mid ,  right);
		}
		return count;
	}
	 static long merge(long array[] ,int l ,int m , int r) {
		
		int leftLength = m - l + 1;
		int rightLength = r - m;
		long left[] = new long[leftLength];
		long right[] = new long[rightLength];
		
		for(int i = 0 ; i < leftLength ; i++) {
			left[i] = array[l + i];
		}
		for(int i = 0 ; i < rightLength ; i++) {
			right[i] = array[m + 1 + i];
		}
		
		long count = 0;
		int i = 0 , j = 0 , k = l ;
		while(i < leftLength && j < rightLength) {
			if(left[i] <= right[j]) {
				array[k++] = left[i++];
			}else {
				array[k++] = right[j++];
				count = count + (m - l + 1 - i);
				
			}
		}
		while(i < leftLength) {
			array[k++] = left[i++];
		}
		while(j < rightLength) {
			array[k++] = right[j++];
		}
		return count;
	}

}
