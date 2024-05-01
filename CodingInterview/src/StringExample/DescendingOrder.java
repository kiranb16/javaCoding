package StringExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
 public static void main(String[] args) {
	 List<String> list= new ArrayList<>();
	 list.add("AA");
	 list.add("ZZ");
	 list.add("BB");
	 list.add("TT");
	 Collections.sort(list,Collections.reverseOrder());
	 System.out.println(list);
}
}
