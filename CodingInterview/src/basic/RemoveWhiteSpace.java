package basic;

public class RemoveWhiteSpace {
	
	public static String removeWhiteSpace( String str) {
		char chararray[]=str.toCharArray();
		String result="";
		for(int i=0; i<chararray.length; i++) {
			if(!Character.isWhitespace(chararray[i])) {
				result= result+chararray[i];
				
			}
		}
		return result;
	}
public static void main(String[] args) {
	System.out.println(removeWhiteSpace(" Kiran  batwal 555"));
	
	// logic 1st
	/*String str=" White Space Remove";
	
	 * String str1=str.replaceAll("\\s+", ""); 
	 * System.out.println(str1);
	 */
}
}
