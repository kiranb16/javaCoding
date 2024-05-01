package core;

import java.util.Arrays;

public class SortedString {
	public static void main(String[] args) {
    String str="I LOVE YOU";
    char[] ch=str.toCharArray();
    Arrays.sort(ch);
   String sorted= new String(ch);
   System.out.println(sorted);
	}
}
