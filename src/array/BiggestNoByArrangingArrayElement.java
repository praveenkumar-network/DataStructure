package array;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNoByArrangingArrayElement {
// https://www.geeksforgeeks.org/given-an-array-of-numbers-arrange-the-numbers-to-form-the-biggest-number/
	public static void main(String[] args) {
		String array[] = {"3", "30", "34", "5", "9"};
		Comparator<String> c = (o1 , o2)->{
			String s1 = o1+o2;
			String s2 = o2+o1;
			
			return s2.compareTo(s1);
		};
		Arrays.sort(array , c);
		StringBuilder stringBuilder = new StringBuilder();
		for(String s : array) {
			stringBuilder.append(s);
		}
		System.out.println(stringBuilder.toString());
	}

}
