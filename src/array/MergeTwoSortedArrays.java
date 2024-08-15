package array;

public class MergeTwoSortedArrays {
//https://www.geeksforgeeks.org/merge-two-sorted-arrays/
	public static void main(String[] args) {
		//int array1[] = {1,2, 4,5};
		//int array2[] = {3,4,6,7,8,9};
		int array1[] = {5, 8, 9};
		int array2[] = {4, 7, 8};
		int ans[] = new int[array1.length + array2.length];
		
		int k = 0 ;
		int i =0 ;
		int j =0 ;
		while(i < array1.length && j < array2.length ) {
			if(array1[i] < array2[j]) {
				ans[k] = array1[i];
						i++;
						k++;
			}else {
				ans[k] = array2[j];
				j++;
				k++;
			}
				
		}
	
		while(i < array1.length) {
			ans[k] = array1[i];
			i++;
			k++;
		}
		
		while(j < array2.length) {
				ans[k] = array2[j];
			j++;
			k++;
		}
		for(int m = 0 ; m < ans.length ; m++) {
			System.out.print(ans[m] +" ");
		}

	}

}
