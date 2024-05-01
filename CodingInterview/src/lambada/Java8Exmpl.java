package lambada;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class Java8Exmpl {
 public static void main(String[] args) {

	 List<String> list= new ArrayList<>();
	 list.add("kiran");
	 list.add("Ravi");
	 list.add("malhar");
	 list.add("avadhut");
	 list.stream().forEach(System.out:: println);
	 
	 Map<Integer, String> map= new LinkedHashMap<>();
	 map.put(111, "Kiran");
	 map.put(555, "Kiran Batwal");
	 map.forEach((key, value)->System.out.println(key+" : "+value));
	 
	 map.entrySet().stream().forEach(System.out:: println);
	 
	 Consumer<String> consumer= (t)->{
		 System.out.println(t);
	 };
	 for( String s:list) {
	 consumer.accept(s);
	 }
}
}
