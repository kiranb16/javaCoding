package StringExample;

import java.util.Arrays;

public class AnagramString {
  public static void main(String[] args) {
	
	  isAnagram("keep", "peek");
	  isAnagram("low", "lov");
}

 static void isAnagram(String string, String string2) {
	
	boolean status=true;
	if(string.length()!= string2.length()) {
		status =false;
	}else {
		char [] s1=string.toLowerCase().toCharArray();
		char [] s2=string2.toLowerCase().toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		status=Arrays.equals(s1, s2);
		
	}
	if(status) {
		System.out.println(string+"  and "+string2+" are anagram");
	}else {
		System.out.println(string+"    "+string2+" are not anagram");
	}
}
}
/*

public class AnagramString {  
   static void isAnagram(String str1, String str2) {  
       String s1 = str1.replaceAll("\\s", "");  
       String s2 = str2.replaceAll("\\s", "");  
       boolean status = true;  
       if (s1.length() != s2.length()) {  
           status = false;  
       } else {  
           char[] ArrayS1 = s1.toLowerCase().toCharArray();  
           char[] ArrayS2 = s2.toLowerCase().toCharArray();  
           Arrays.sort(ArrayS1);  
           Arrays.sort(ArrayS2);  
           status = Arrays.equals(ArrayS1, ArrayS2);  
       }  
       if (status) {  
           System.out.println(s1 + " and " + s2 + " are anagrams");  
       } else {  
           System.out.println(s1 + " and " + s2 + " are not anagrams");  
       }  
   }  
  
   public static void main(String[] args) {  
       isAnagram("Keep", "Peek");  
       isAnagram("Mother In Law", "Hitler Woman");  
   }  
}  
*/