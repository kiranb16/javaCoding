package core2;

public class RemoveCharacter {
	public static void main(String[] args) {
      String s="Kirhan Batwahl";
     // char c='h';
      removeChar(s, 'h');
      
	}
	
	public static void removeChar(String s, char c) {
		String finalstr=" ";
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=c) {
				finalstr=finalstr+s.charAt(i);
			}
			
		}
		System.out.println("finalString :"+finalstr);
	}
}

