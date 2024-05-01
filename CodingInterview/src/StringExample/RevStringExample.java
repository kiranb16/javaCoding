package StringExample;

public class RevStringExample {
	public static void main(String[] args) {
		String s=" Moze Engineering";
		String plain[]=s.split("");
		String rev="";
		for(int i=plain.length-1;i>=0;i--) {
			rev=rev+plain[i]+" ";
		}
		System.out.println(rev);
	}
}
/*
String str = "Kiran Vasant Batwal";
String st[] = str.split(" ");
String res = "";
for (int i = st.length - 1; i >= 0; i--) {
	res=res+ st[i] + " ";// other way=    res+=st[i]+" ";
}
System.out.println(res);
*/