package practice;

public class StringExample12 {
 public static void main(String[] args) {
	String s=" Kiran is Good Boy";
	String[] str=s.split("");
	String rev=" ";
	for(int i=0; i>=str.length-1; i++) {
		rev=s.charAt(i)+rev;
	}
	System.out.println(rev);
	
}
}
/*
String s="Love you jindagi";
String rev="";
char ch;
for(int i=0;  i<s.length(); i++) {
	  ch=s.charAt(i);
	  rev= ch+ rev;
	  
}
System.out.println(rev);
*/