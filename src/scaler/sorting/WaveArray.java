package scaler.sorting;

import java.util.Arrays;

public class WaveArray {
	// https://www.youtube.com/watch?v=eezEHXS20jQ
	public static void main(String[] args) {
		int array[] = {1,2,3,4,5,6};
		for(int i = 0 ; i < array.length - 1 ; i=i+2) {
			int temp = array[i];
			array[i] = array[i +1];
			array[i + 1] = temp;
		}
		Arrays.stream(array).forEach(o->System.out.print(o+" "));
	}

}
