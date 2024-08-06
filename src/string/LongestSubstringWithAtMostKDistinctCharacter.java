package string;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtMostKDistinctCharacter {
//https://www.youtube.com/watch?v=k--bSleyD4E
// https://www.youtube.com/watch?v=teM9ZsVRQyc
	public static void main(String[] args) {
		String s ="aabbcc";
		int k =3 ;
		int r = 0 ,l = 0;
		String ans = "";
		Map<Character , Integer> map = new HashMap<>();
		while(r < s.length()) {
			if(map.containsKey(s.charAt(r))) {
				map.put(s.charAt(r), map.get(s.charAt(r)) +1);
			}else {
				map.put(s.charAt(r), 1);
			}
			
			if(map.size()> k) {
				map.put(s.charAt(l), map.get(s.charAt(l))- 1);
				if(map.containsKey(s.charAt(l))&& map.get(s.charAt(l)) == 0) {
					map.remove(s.charAt(l));
				}
				l++;
				
			}
			String temp = s.substring(l , r +1);
			if(temp.length() > ans.length()) {
				ans = temp;
			}
			r++;
		}
		
		System.out.println(ans);


	}

}
