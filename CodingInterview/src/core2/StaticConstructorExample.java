package core2;

public class StaticConstructorExample {
  static int id;
  static String name;
  
  static {
	  id=23;
	  name="Kiran";
  }
  
public static void main(String[] args) {
	System.out.println(id+" "+name);
}
}
