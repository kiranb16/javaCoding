package core;
public class SplitString{
	public static void main(String[] args) {
		String str=" Kiran Batwal";
		//by builder
		/*
		 * StringBuilder sb=new StringBuilder(str); 
		 * System.out.println(sb.reverse());
		 */
		
		// by buffer
		
		/*
		 * StringBuffer sb= new StringBuffer(str); 
		 * sb.reverse(); System.out.println(sb);
		 */
        
		// by iterartion
		String s2[]=str.split("\\s");
		for(String x: s2) {
			System.out.println(x);
		}
        
	}
	}
