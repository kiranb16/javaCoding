package Exceptions;

public class ForEachLoop {
	public static void main(String[] args) {
		int Total = 0;
		for (int x = 0; x <= 10; x++) {
			Total += x;
			//Total=Total+x;
			System.out.println(x);
		}
		System.out.println(Total);
	}
}
