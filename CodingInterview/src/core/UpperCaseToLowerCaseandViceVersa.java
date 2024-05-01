package core;

public class UpperCaseToLowerCaseandViceVersa {

	public static void oppositeCharacter(StringBuffer str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c)) {
				str.setCharAt(i, Character.toUpperCase(c));
			} else {
				str.setCharAt(i, Character.toLowerCase(c));
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Kiran  Batwal");
		oppositeCharacter(str);
	}
}
