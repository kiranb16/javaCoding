import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AAA{
	public static void main(String[] args) {
		List<List<Integer>> mobnumber= new ArrayList<>();
		mobnumber.add(Arrays.asList(9866554,97655));
		mobnumber.add(Arrays.asList(984543,9761333));
		mobnumber.add(Arrays.asList(9861111,976555442));
		mobnumber.add(Arrays.asList(23446554,23337655));
		System.out.println("simple map"+mobnumber);
		mobnumber.stream().flatMap(a->a.stream()).collect(Collectors.toList()).forEach(System.out:: println);
	
	}
	
}
	/*
	List<String> list= new ArrayList<>();
	list.add("apple");
	list.add("mango");
	list.add("lemonn");
	List<String> li=list.stream().collect(Collectors.toList());
	System.out.println(li);
	
	System.out.println("flatMap");
	List<List<Integer>> mobnumber= new ArrayList<>();
	mobnumber.add(Arrays.asList(9866554,97655));
	mobnumber.add(Arrays.asList(984543,9761333));
	mobnumber.add(Arrays.asList(9861111,976555442));
	mobnumber.add(Arrays.asList(23446554,23337655));
	System.out.println("simple map"+mobnumber);
	
	//flatmap= map+ flattering
	List<Integer> num=mobnumber.stream().flatMap(a->a.stream()).collect(Collectors.toList());
	System.out.println(num);
	*/