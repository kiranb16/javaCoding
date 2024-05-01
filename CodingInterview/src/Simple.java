
public class Simple {
 public static void main(String[] args) {
	String s="Kiran";
	String s1= new String("Kiran");
	System.out.println("EqualOperator check ref :"+(s==s1));
	System.out.println("equal method  checks containt :"+s.equals(s1));
	
	StringBuilder s3= new StringBuilder("Kiran");
	System.out.println(s.equals(s3));
	//System.out.println("condition "+(s==s3));
	
}
}
