package StringExample;

public class PallindromeString2 {
 public static void main(String[] args) {
	String orignal="nayan";
	String rev="";
	for(int i= orignal.length()-1; i>=0; i--) {
		rev= rev+ orignal.charAt(i);
		
	}
	System.out.println(rev);
	if(orignal.equals(rev)) {
		System.out.println("pallindrome string");
	}else {
		System.out.println("not pallindrome String");
	}
}
}
