package Java8Example;

public class Practice {
	public static void main(String[] args) {
		String str="RoR";
		String org=str;
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(org==rev) {
			System.out.println("pallindrome String");
		}else {
			System.out.println("not pallindrome String");
		}
	}

}
