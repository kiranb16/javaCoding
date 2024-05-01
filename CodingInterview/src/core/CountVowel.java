package core;

public class CountVowel {
	public static void main(String[] args) {

		String s = "Kiran vasant Batwal";
		s=s.toLowerCase();
		
		char[] c=s.toCharArray();
		int count=0;
		for(int i=0; i<c.length;i++) {
			if(s.charAt(i)=='a'|| s.charAt(i)=='i' || s.charAt(i)=='u'||s.charAt(i)=='o'|| s.charAt(i)=='u' ) {
				count++;
			}
		}
		System.out.println(count);

	}
}