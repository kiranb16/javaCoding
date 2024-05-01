package InterviewProgramm;

import java.util.HashSet;
import java.util.Scanner;

public class DuplicateCharacter {
	public static void main(String[] args) {
		System.out.println("enter String");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		HashSet<Character> characterset= new HashSet<>();
		for(char c: str.toCharArray()) {
			if(characterset.contains(c)) {
				System.out.println(c+" ");
			}else {
				characterset.add(c);
			}
		}
	}
}
