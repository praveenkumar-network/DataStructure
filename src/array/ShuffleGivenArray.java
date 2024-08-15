package array;

import java.util.Arrays;
import java.util.Random;

public class ShuffleGivenArray {
//https://www.digitalocean.com/community/tutorials/shuffle-array-java
	public static void main(String[] args) {
		int array[] = {1,2,3};
		for(int i = array.length -1 ; i > 0 ; i--) {
			int nextRandomNo = new Random().nextInt(array.length);
			swap(array , i , nextRandomNo);
		}
		Arrays.stream(array).forEach(o->System.out.print(o+" "));

	}
	private static void swap(int array[] ,int i ,int j) {
		int element = array[i];
		array[i] = array[j];
		array[j] = element;
	}

}
