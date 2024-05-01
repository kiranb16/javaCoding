package core;

public class RemoveWhiteSpace {

	static String removeWhiteSpace(String s) {
		StringBuilder output = new StringBuilder();
		char[] charArray = s.toCharArray();
		for (char c : charArray) {
			if (!Character.isWhitespace(c)) {
				output.append(c);
			}
		}
		return output.toString();
	}

	public static void main(String[] args) {
		String s = " Kiran batwal";
		System.out.println(removeWhiteSpace(s));

	}
}
