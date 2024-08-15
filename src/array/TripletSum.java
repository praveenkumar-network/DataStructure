package array;

import java.util.HashSet;
import java.util.Set;

public class TripletSum {

	public static void main(String[] args) {
		int array[] = {1, 4, 45, 6, 10, 8  };
		int sum =22;
		
		for(int i =0 ; i < array.length ; i++) {
			Set<Integer> set = new HashSet<>(); 
			for(int j = i + 1 ; j < array.length ; j++) {
				int calculateSum = sum - ( array[i] + array[j] );
				if(set.contains(calculateSum)) {
					System.out.println(array[i] +" "+ array[j] +" "+calculateSum);
					break;
				}else {
					set.add(array[j]);
				}
				
			}
		}
	}

}
