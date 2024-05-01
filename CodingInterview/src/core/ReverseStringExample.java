package core;

public class ReverseStringExample {
	public static void main(String[] args) {
      String s=" Kiran vasant Batwal";
        char sb[]=s.toCharArray();  // by using String to charArray
        int l= sb.length;
        
        String rev="";
         for( int i=l-1; i>=0; i--) {
        	   rev= rev+sb[i];
        	 
         }
         System.out.println(rev);
         
         
	}
}