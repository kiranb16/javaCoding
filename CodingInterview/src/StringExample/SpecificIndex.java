package StringExample;

public class SpecificIndex {
	public static void main(String[] args) {
     String str= "eelcome to java";
     int index=0;
     char ch='W';
     StringBuffer sb= new StringBuffer(str);
     sb.setCharAt(index, ch);
     System.out.println(sb);
     
	}
}
