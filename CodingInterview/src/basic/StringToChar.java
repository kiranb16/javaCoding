package basic;

public class StringToChar {
 public static void main(String[] args) {
	 String str="hello";
		/*
		 * char c= str.charAt(0); 
		 * System.out.println(c);
		 */
	 char [] c=str.toCharArray();
	 System.out.println(c[3]);
}
}

