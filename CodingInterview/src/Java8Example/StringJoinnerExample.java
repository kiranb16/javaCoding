package Java8Example;

import java.util.StringJoiner;

public class StringJoinnerExample {
	public static void main(String[] args) {
  // stringjoiner class Introduced in java8;
		StringJoiner tier1= new StringJoiner(",");
		tier1.add("mumbai");
		tier1.add("nagpur");
		tier1.add("amaravati");
		tier1.add("pune");
		System.out.println(tier1);
		StringJoiner tier= new StringJoiner(",");
		tier.add("surrat");
		tier.add("gandhinagar");
		tier.add("bhopal");
		tier.add("ahadabad");
		System.out.println(tier);
		tier1.merge(tier);
		System.out.println(tier1);
	}
}
