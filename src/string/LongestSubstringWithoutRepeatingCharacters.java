package string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		//String s = "abcdbas";
		String s = "ABCDEFGABEF";
		int r = 0 ,l = 0;
		String ans = "";
		Set<Character> set = new HashSet<>();
		while(r < s.length()) {
			if(set.contains(s.charAt(r))) {
				set.remove(s.charAt(l));
				String temp = s.substring(l , r);
				if(temp.length() > ans.length()) {
					ans = temp;
				}
				l++;
			}else {
				set.add(s.charAt(r));
				String temp = s.substring(l , r+1);
				if(temp.length() > ans.length()) {
					ans = temp;
				}
				r++;
			}
		}
		System.out.println(ans);


	}

}
