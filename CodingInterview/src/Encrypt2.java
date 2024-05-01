
public class Encrypt2 {
	public static void main(String[] args) {
		String text = "Pnwfs%{fxfsy%Gfy|fq";
		System.out.println(text);
		char[] chars= text.toCharArray();
		for(char ch: chars) {
			ch-=5;
			System.out.print(ch);
		}
	}
}
