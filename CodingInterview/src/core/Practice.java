package core;

public class Practice {
public static void main(String[] args) {
	 String str="KiranBatwal123@";
	 int count=0;
	 for(int i=0; i<str.length();i++) {
		 if(!Character.isDigit(str.charAt(i)) && 
				 !Character.isLetter(str.charAt(i))&&!Character.isWhitespace(str.charAt(i))){
			 count++;
		 }
	 }
	 if(count ==0) {
		 System.out.println("no special character found");
		 
	 }else {
		 System.out.println("special character found "+count);
	 }
}
}
