package StringExample;

public class PallindromeString {
public static void main(String[] args) {
	String s="akr";
	String rev="";
	char [] c=s.toCharArray();
	for(int i=c.length-1; i>=0; i--) {
		rev=rev+c[i];
	}
	
	if(s.contains(rev)) {
		System.out.println("pallindrome");
	}else{
		System.out.println("not pallindrome");
	}
}
}
