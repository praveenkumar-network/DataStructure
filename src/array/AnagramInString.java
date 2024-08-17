package array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AnagramInString {
	//https://www.youtube.com/watch?v=slDyFUnGtoU
public static void main(String[] args) {
	String input = "AAABABAA";
	String pattern = "AABA";
	
	Map<Character , Integer> inputFrequency = new HashMap<>();
	Map<Character , Integer> patternFrequency = new HashMap<>();
	
	for(int i = 0 ; i < pattern.length() ; i++) {
		patternFrequency.put(pattern.charAt(i), patternFrequency.getOrDefault(pattern.charAt(i), 0) + 1);
		inputFrequency.put(input.charAt(i),inputFrequency.getOrDefault(input.charAt(i), 0) + 1 );
	}
	int l =0 ;
	int r = pattern.length();
	int count = 0;
	String ans = "";
	while(r < input.length()) {
			if(compareTwoMap(inputFrequency, patternFrequency)) {
				count++;
				ans = ans+l+" ";
				
			}
			
			inputFrequency.put(input.charAt(r), inputFrequency.getOrDefault(input.charAt(r), 0) +1 );
			if(inputFrequency.get(input.charAt(l)) == 0) {
				inputFrequency.remove(input.charAt(l));
			}else {
				inputFrequency.put(input.charAt(l), inputFrequency.get(input.charAt(l)) - 1);	
			}
			r++;
			l++;
	}
	if(compareTwoMap(inputFrequency, patternFrequency)) {
		count++;
		ans = ans+l+" ";
	}
	System.out.println("total anagram : "+count);
	System.out.println("Anagram found at index : "+ans);
}
private static boolean compareTwoMap(Map<Character , Integer> inputFrequency , Map<Character , Integer> patternFrequency) {
	Set<Character> keys = patternFrequency.keySet();
	for(char key : keys) {
		if(inputFrequency.get(key) != patternFrequency.get(key)) {
			return false;
		}
	}
	return true;
}
}
