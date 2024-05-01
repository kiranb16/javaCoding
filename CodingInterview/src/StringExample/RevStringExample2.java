package StringExample;

public class RevStringExample2 {
public static void main(String[] args) {
	
	String s="kiran Batwal";
	/*
	 * StringBuilder sb= new StringBuilder(); 
	 * sb.append(s);
	 * System.out.println(sb.reverse());
	 */
	
	// method 2
	/*
	 * StringBuilder sb= new StringBuilder(s); 
	 * System.out.println(sb.reverse());
	 */
	
	//method 3
	
	/*
	 * char [] arr= s.toCharArray(); 
	 * for( int i=arr.length-1; i>=0; i--) {
	 * System.out.print(arr[i]); }
	 */
	String[] plain= s.split("");
	for(int i=plain.length-1; i>=0; i--) {
		System.out.print(plain[i]);
	}
	
}
}
