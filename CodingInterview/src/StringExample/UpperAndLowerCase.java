package StringExample;

public class UpperAndLowerCase {
	public static void main(String[] args) {
		String str = " kiranRao VasantRao Batwal";// convert String lower and uppercase
		int mid = str.length() / 2;
		String lowerCase = "";
		String uppercase = "";
		for (int i = 0; i < str.length(); i++) {
			if (i < mid) {
				uppercase = uppercase + Character.toUpperCase(str.charAt(i));
			} else {
				lowerCase = lowerCase + Character.toLowerCase(str.charAt(i));
			}
		}
		System.out.println(uppercase+lowerCase);

	}
}
