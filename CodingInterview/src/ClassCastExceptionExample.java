
public class ClassCastExceptionExample {
 public static void main(String[] args) {
	try {
	 Object o= Integer.valueOf(10);
	String s=(String)o;
	System.out.println(s);
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
