package refrenceMethod;

import java.util.function.BiFunction;

class Arithmetic2 {
	public static int add(int a, int b) {
		return a + b;
	}

	public static float add(int a, float b) {
		return a + b;
	}

	public static float add(float a, float b) {
		return a + b;
	}
}

public class StaticRefMethod3 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder1 =  Arithmetic2::add;
		System.out.println(" 1st addition :" + adder1.apply(12, 13));

		BiFunction<Integer, Float, Float> adder2 = Arithmetic2::add;
		System.out.println("2nd :" + adder2.apply(12, (float) 12.90));
		
		BiFunction<Float, Float, Float> adder3= Arithmetic2::add;
		System.out.println("3rd :" + adder3.apply((float) 12.234, (float) 12.90));
	}
}
