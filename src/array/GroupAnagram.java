package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
// https://www.youtube.com/watch?v=NNBQik4phMI&t=379s
	public static void main(String[] args) {
		String array[] = {"eat","tea","tan","ate","nat","bat"};
		//String array[] = {"geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs"};
		System.out.println(groupAllAnagram(array));
	}
	private static  List<List<String>> groupAllAnagram(String array[]){
		               
		Map<Map<Character , Integer> , List<String>> map = new HashMap<>();
		
		for(String s : array) {
			Map<Character , Integer> frequencyMap = generateKey(s);
			
			if(map.containsKey(frequencyMap)) {
				map.get(frequencyMap).add(s);
			}else {
				List<String>  list = new ArrayList<>();
				list.add(s);
				map.put(frequencyMap, list );
			}
		}
		return new ArrayList<>(map.values());
	}
	private static Map<Character , Integer>  generateKey(String str) {
		Map<Character , Integer> frequencyMap = new  HashMap<>();
		for(int i = 0 ; i < str.length() ; i++) {
			frequencyMap.put(str.charAt(i), frequencyMap.getOrDefault(frequencyMap.get(str.charAt(i)), 0) + 1);
		}
		return frequencyMap;
	}

}
