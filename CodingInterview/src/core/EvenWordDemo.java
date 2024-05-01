package core;

public class EvenWordDemo {
	public static void main(String[] args) {
		String str="java is h good";
		 String plain[]=str.split(" ");
		 for(String s: plain) {
			 if(s.length()%2==0) {
				 System.out.println(s);
			 }
		 }
	}
}
