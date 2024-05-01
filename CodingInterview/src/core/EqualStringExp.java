package core;

public class EqualStringExp {
public static void main(String[] args) {
	String str1="Kiran";
	String str2="Kiran";
	System.out.println(areEqualString(str1,str2));
}

private static boolean areEqualString(String str1, String str2) {
	for(int i=0; i<str1.length();i++) {
		if(str1.charAt(i)!=str2.charAt(i)) {
			return false;
			
		}
	}
	 return true;
	
	
}
}
