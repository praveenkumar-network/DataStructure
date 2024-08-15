package array;

public class ReverseStringWithSpecialCharacters {
// https://www.javatpoint.com/reverse-string-with-special-characters-in-java
	public static void main(String[] args) {
		String input = "a$b#c";
		char temp[] = new char[input.length()];
		int j = 0;
		for(int i = input.length() -1 ; i >=0 ; i--) {
			if(Character.isAlphabetic(input.charAt(i))){
			temp[j++] = input.charAt(i);	
			}
		}
		char c[] = input.toCharArray();
		j = 0;
		for(int i = 0 ; i < c.length ; i++) {
			if(Character.isAlphabetic(c[i])){
				c[i] = temp[j++];
			}
		}
		
		System.out.println(String.valueOf(c));

	}

}
