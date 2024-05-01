package core;

import java.util.Arrays;

public class AnagramExample {
 public static void main(String[] args) {
	String str1="ajay";
	String str2="jay";
	 str1=str1.toLowerCase();
	 str2=str2.toLowerCase();
	 if(str1.length()==str2.length()) {
		 char [] chararray1=str1.toCharArray();
		 char [] chararray2=str2.toCharArray();
		 
		 Arrays.sort(chararray1);
		 Arrays.sort(chararray2);
		 
		 boolean result=Arrays.equals(chararray1, chararray2);
		 
		 if(result= true) {
			 System.out.println("anagram");
		 }else {
			 System.out.println("not anagram");
		 }
	 }else {
		 System.out.println(" not equal and not anagram");
	 }
}
}
