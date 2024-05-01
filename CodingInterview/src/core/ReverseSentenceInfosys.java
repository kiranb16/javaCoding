package core;

public class ReverseSentenceInfosys {
	public static void main(String[] args) {
		String sen = " Kiran is good Boy";
		sen = sen + " ";
		String revSen = "";
		String word = "";
		for (int i = 0; i < sen.length(); i++) {
			char ch = sen.charAt(i);
			if (ch != ' ') {
				word = word + ch;
			} else {
				revSen = word + " " + revSen;
				word = "";
			}
		}
		System.out.println(revSen);
	}
}