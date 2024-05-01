package basic;

public class BiggestOfThree {
 public static int  biggestOfThree(int x, int y, int z) {
	 if(x>=y && x>=z) {
		  return x;
	 } else if( y>=x && y>=z) {
		  return y;
	 }
	 return z;
 }
 public static void main(String[] args) {
	int largest=BiggestOfThree.biggestOfThree(12, 13, 14);
	System.out.println("largest no is :"+largest);
}
}
