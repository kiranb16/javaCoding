package core;

import java.util.Scanner;

public class CountVowelFrom {
 public static void main(String[] args) {
	System.out.println("Enter the String");
	Scanner sc= new Scanner(System.in);
	String n=sc.nextLine();
	char ch[]=n.toCharArray();
	int count=0;
	for(char c:ch) {
		switch (c) {
		case 'a':
		case 'A':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
		case 'e':
		case 'E':
			count++;
		break;
		default:System.out.println("vowel are not present");
		}
	}
	System.out.println("vowel ares "+count);
}
}
