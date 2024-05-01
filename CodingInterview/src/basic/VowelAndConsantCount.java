package basic;

public class VowelAndConsantCount {
	public static void main(String[] args) {
		String str = "Kiran Batwal";
		countVowel(str);

	}

	private static void countVowel(String str) {
		int vowelCount = 0;
		int consantCount = 0;

		for (int i = 0; i < str.length(); i++) {
			if (isVowel(str.charAt(i))) {
				vowelCount++;
			} else {
				consantCount++;
			}
		}
		System.out.println("vowel count are "+vowelCount);
		System.out.println("consant count are "+consantCount);

	}

	private static boolean isVowel(char ch) {
		ch = Character.toUpperCase(ch);
		return (ch == 'A' || ch == 'O' || ch == 'U' || ch == 'E' || ch == 'I');
	}
}
