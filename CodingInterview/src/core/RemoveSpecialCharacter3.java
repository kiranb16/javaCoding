package core;

public class RemoveSpecialCharacter3 {
	public static void main(String[] args) {
		String str = " kiran@***Batwal555";
		String plain = "";
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i))) {

			} else {
				plain = plain + str.charAt(i);
			}
		}
		System.out.println("special character removed :" + plain);
	}
}
