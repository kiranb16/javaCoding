package StringExample;

public class ReplaceRepeatingCharacter {
public static void main(String[] args) {
	String str="programming";
	
	//method 1
	StringBuilder sb= new StringBuilder();
	//str.chars().distinct().forEach(c->sb.append((char)c));
	str.chars().distinct().forEach(e->sb.append((char)e));
	System.out.println(sb);
	
	//method 2
	StringBuilder sb1= new  StringBuilder();
	for(int i=0; i<str.length();i++) {
		char ch=str.charAt(i);
		int idx=str.indexOf(ch, i+1);
		if(idx==-1) {
			sb1.append(ch);
		}
	}
	System.out.println(sb1);
	
	
	
}
}
