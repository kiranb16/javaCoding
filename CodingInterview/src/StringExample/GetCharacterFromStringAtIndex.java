package StringExample;

public class GetCharacterFromStringAtIndex {

	public static char getCharacter(String  str, int i) {
		return str.charAt(i);
	}
	public static void main(String[] args) {
		String str="KiranBatwal";
		int i=5;
		char c =getCharacter(str, i);
		System.out.println(c);
	}
}
