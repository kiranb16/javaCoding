package core;

public class UpperCaseToLowerCaseandViceVersaWithoutInbuilt {
	public static void oppositeCharacter(StringBuffer str) {
		int n = str.length();
		for (int i = 0; i < n; i++) {
			Character c = str.charAt(i);
			if (Character.isLowerCase(c)) {
				char  toUpperCase=(char)(c-32);// using asci value
				str.setCharAt(i, toUpperCase);
			} else {
				char toLowerCase=(char)(c+32);
				str.setCharAt(i,toLowerCase);
			}
		}
		System.out.println(str);
	}

	private static char toLowerCase(Character c) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static char toUpperCase(Character c) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("KiranBatwal");
		oppositeCharacter(str);
	}
}
