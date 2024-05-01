package core;

public class CountCharacter3 {
  public static void main(String[] args) {
	String str="kiran vasant batwal";
	
	int count=0;
	String[]plain=str.split("");
	for(int i=0; i<=str.length()-1;i++) {
		if(str.charAt(i)!=' ') {
			count++;
		}
	}
	System.out.println("character are "+count);
	
	
}
}
