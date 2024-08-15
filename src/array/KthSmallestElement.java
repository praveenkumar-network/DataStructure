package array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {

	public static void main(String[] args) {
		int array[] = {5, 20, 10, 7, 1};
		int k = 2;
		k = k % array.length;
		Comparator<Integer> comparator = (o1 , o2)-> o2-o1;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(comparator);
				
		for(int i = 0 ; i < array.length ; i++) {
			pq.add(array[i]);
			if(pq.size() > k ) {
				pq.poll();
			}
		}
		
		System.out.println(pq.peek());

	}

}
