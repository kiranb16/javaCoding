package core;

public class ReplaceWhoteSpace {
 public static void main(String[] args) {
	 String str= " k i r an Ba t wal";
	  String plain= str.replaceAll("\\s", "");
	  System.out.println(plain);
}
}
