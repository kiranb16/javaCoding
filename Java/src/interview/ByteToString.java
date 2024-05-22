package interview;

public class ByteToString{
   public static void main(String[] args) {
	byte[] bytes="hello world".getBytes();
	String s= new String(bytes);
	System.out.println(s);
	System.out.println(s.getClass());
}
}

