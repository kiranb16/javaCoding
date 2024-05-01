package core;

public class RemoveSpecialCharacter2 {
	public static void main(String[] args) {
		String str = "I @# Love $%*** you";
		String resStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 64 && str.charAt(i) <= 127) {// bye using Asci value

				resStr = resStr + str.charAt(i);
			}
		}
		System.out.println(" String without special character : "+resStr);
	}
}
