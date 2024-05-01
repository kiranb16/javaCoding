package basic;

public class FirstLetterOfEachWord {
	public static void main(String[] args) {
		String str = "well Kiran keep it well";
         splitWords(str);
	}

	private static void splitWords(String str) {
	   String words[]=str.split(" ");
	   for(int i=0;i<words.length;i++) {
		   String s= words[i];
		   System.out.println(s.charAt(0));
	   }
		
	}
}
