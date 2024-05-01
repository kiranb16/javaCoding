package StringExample;

public class ReplaceStringCharacter {
	public static void main(String[] args) {
		String str = "CodemindCollection";
		char ch = 'C';
		removeChar(str, ch);
		

	}

	public static void removeChar(String str, char ch) {

		String finalstr="";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'C') {
				finalstr = finalstr + str.charAt(i);
			}
		}
		System.out.println(finalstr);
	}
}
