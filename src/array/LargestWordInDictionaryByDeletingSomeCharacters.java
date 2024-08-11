package array;

public class LargestWordInDictionaryByDeletingSomeCharacters {
// https://www.youtube.com/watch?v=G2y5bCDAzJk
	public static void main(String[] args) {
//Given a string s and a string array dictionary, return the longest string in the dictionary that can be formed by deleting 
//some of the given string characters. If there is more than one possible result, return the longest word with the smallest lexicographical order.
//If there is no possible result, return the empty string.		
		//String dic[] = {"ale", "apple", "monkey", "plea"}; 
		String dic[] = {"a", "b", "c"}; 
		String s2 = "abpcplea";
		 String longestString = "";
		for(String dicWord : dic) {
		if(isSubsequence(dicWord , s2)) {
			//dicWord length > longestString OR lexicographical small
			if(dicWord.length() > longestString.length() ||(dicWord.length() == longestString.length() && dicWord.compareTo(longestString) < 1) )
			{
				longestString = dicWord;
			}
			}
		}
		System.out.println(longestString);
	}
	private static boolean isSubsequence(String dicWord , String s2) {
		int i =0 , j =0;
		if(dicWord.length() > s2.length()) {
			return false;
		}
		while(i < dicWord.length() && j < s2.length()){
			if(dicWord.charAt(i) == s2.charAt(j)) {
				i++;
				j++;
			}else {
				j++;
			}
		}
		
		return i == dicWord.length();
	}
	
	

}
