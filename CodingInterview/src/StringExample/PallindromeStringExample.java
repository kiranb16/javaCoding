package StringExample;

// pallindrome words from String
public class PallindromeStringExample {
	public static void main(String[] args) {
		String input = "my name is nitin and i can speak malayalam";
		String[] words=input.split(" ");
		for(String word:words) {
			if(ispallindrome(word)) {
				System.out.println(word+" is pallindrome");
			}
			
		}
	}

	public static boolean ispallindrome(String input) {
		int i1 = 0;
		int i2 = input.length() - 1;
		while (i2 > i1) {
			if (input.charAt(i1) != input.charAt(i2)) {
				return false;
			}
		}
		i1++;
		i2--;

		return true;
	}
}