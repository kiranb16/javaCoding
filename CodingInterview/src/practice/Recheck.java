package practice;

public class Recheck {
	public static void main(String[] args) {
		String str = "Kiran@Batwal##";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i))
					&& !Character.isWhitespace(str.charAt(i))) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("not found");
		} else {
			System.out.println("found  " + count);
		}
	}
}
