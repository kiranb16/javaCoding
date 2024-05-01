package lambada;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo  {
public static void main(String[] args) {
	
	/*
	 * System.out.println(new SupplierDemo().get()); }
	 * 
	 * @Override public String get() { // TODO Auto-generated method stub return
	 * "Hi Kiran Whatsup";
	 */
	
	Supplier<String> supplier= ()->{
		return " hi Kiran Whatsapp";
	
	};
	
	List<String> list= Arrays.asList("mango","pineapple","lemon","per");
	System.out.println(list.stream().findAny().orElseGet(supplier));
	//System.out.println(supplier.get());
}
}
