package core2;

public class StringCountVowels {
	public static void main(String[] args) {
		String str = "Kiran Batwal";
		str = str.toLowerCase();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' 
					|| str.charAt(i) == 'i' 
					|| str.charAt(i) == 'o' 
					|| str.charAt(i) == 'u'
					|| str.charAt(i) == 'e') {
                   count++;
			}
		}
		System.out.println(count);
	}
}