package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestWordInDictionary {
//https://www.youtube.com/watch?v=waIgDZZp9Wc
	
	public static void main(String[] args) {
		//String array[] = {"w" , "wo" , "wor" , "worl" ,"world" };
		String array[] = {"a" , "banana" , "app" , "appl" ,"ap","apply","apple" };
		Arrays.sort(array);
		
		Set<String> set = new HashSet<>();
		String ans = "";	
		for(String word : array) {
			if(word.length() == 1 || set.contains(word.substring(0 , word.length() - 1))) {
				if(word.length() > ans.length()) {
					ans = word;
				}
				set.add(word);
			}
		}
		System.out.println(ans);
		
	}

}
