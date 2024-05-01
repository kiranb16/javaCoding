package basic;

public class RemoveDigitFromString {
	public static void main(String[] args) {

		String str = "123 Kiran batwal";
		String plain = str.replaceAll("\\d", "");
		System.out.println(plain);
		/*
		 * StringBuilder build = new StringBuilder(str);
		 * System.out.println(build.delete(11, 14));
		 */

	}
}
