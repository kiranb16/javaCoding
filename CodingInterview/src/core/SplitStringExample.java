package core;

public class SplitStringExample {
 public static void main(String[] args) {
	
	 String s="12345-67890";
	 String []splites=s.split("-");
	 for(String str: splites) {
		 System.out.println(str);
	 }
}
}
