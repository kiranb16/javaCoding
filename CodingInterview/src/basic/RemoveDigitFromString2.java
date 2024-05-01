package basic;

public class RemoveDigitFromString2 {
	public static void removeDigit(String str) {
		char[] c=str.toCharArray();
		String result="";
		for(int i=0; i<c.length; i++) {
			if(!Character.isDigit(c[i])) {
				result= result+c[i];
			}
		}
		System.out.println(result);
	} 
	
public static void main(String[] args) {
	removeDigit("Kiran44");
}
}
