
public class Encrypt {
	public static void main(String[] args) {
		String text = "Kiran vasant Batwal";
		System.out.println(text);
//		char chars[] = text.toCharArray();
//		for (char ch : chars) {
//			ch+=5;
//			System.out.print(ch);
//		}
		
		char[] ch=text.toCharArray();
		for(int i=0; i<ch.length; i++) {
			ch[i]+=5;
			
			System.out.print(ch[i]);
		}
		
		
		
	}
}
