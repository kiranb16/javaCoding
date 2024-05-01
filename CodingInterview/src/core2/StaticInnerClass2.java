package core2;
class Test{
	static int data;
	static class Inner{
		static void msg() {
			data=123;
			System.out.println(data);
		}
	}
}
public class StaticInnerClass2 {
 public static void main(String[] args) {
	Test.Inner.msg();
}
}
