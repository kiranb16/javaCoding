package array;

public class RemoveDuplicateChar {
   public static void main(String[] args) {
	
	   String str="Programming";
	   //str.chars().distinct().forEach(e->System.out.print((char)e+" "));
	   
	   
	   //logic second
	   
	   StringBuilder sb= new StringBuilder();
	   char ch[]=str.toCharArray();
	   for(int i=0; i<ch.length; i++) {
		   boolean reapeted= false;
		   for(int j= i+1; j<ch.length; j++) {
			   if(ch[i]==ch[j]) {
				  // System.out.print(sb.append(ch[i]));
				   reapeted= true;
				   break;
			   }
		   }
		   if(!reapeted) {
			   sb.append(ch[i]);
		   }
	   }
	   System.out.println(sb);
	   
	   //logic 3rd
	   
}
}
























