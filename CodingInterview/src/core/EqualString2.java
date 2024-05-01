package core;

public class EqualString2 {
public static void main(String[] args) {
	String str1="kiran";
	String str2="kiran";
	
	boolean re=areStringEqual(str1, str2);
	System.out.println("String are equal : "+re);
}

private static boolean areStringEqual(String str1, String str2) {
	if(str1.length()== str2.length()) {
		for(int i=0; i<str1.length(); i++) {
			if(str1.charAt(i)== str2.charAt(i)) {
				return true;
			}
		}
	}
	
	return false;
	
}
}
