package StringExample;

public class DuplicateCharacter2 {
	public static void main(String[] args) {
		String str = "Helloo";
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					System.out.println("duplicate character  " + ch[j]);
					count++;
					break;

				}

			}
		}
		System.out.println(count);
	}
}
