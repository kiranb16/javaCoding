package basic;

public class ValidPincode {
	
	static boolean checkValidPincode(String str) {
		for(char c: str.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {

		String address = "15/02/23,old road pune, maharashtra, 9890981141,412207, india";
		String words[] = address.split(",");
		for (String word : words) {
            if(word.length()==6 && checkValidPincode(word)) {
            	System.out.println("this is valid pincode :"+word);
            }
		}
	
	
	}
	
} 