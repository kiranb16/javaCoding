package basic;

public class FinalKeyStaticWord {
   final static int data;
   static {
	   data=23;
   }
   public static void main(String[] args) {
	System.out.println(FinalKeyStaticWord.data);
}
}
