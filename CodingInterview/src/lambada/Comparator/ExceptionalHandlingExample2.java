package lambada.Comparator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionalHandlingExample2 {
	public static void main(String[] args) {
		List<String> list= Arrays.asList("23","34","45","566");
		list.forEach(handledException(s->Integer.parseInt(s)));
	}
	
	public static Consumer<String> handledException( Consumer<String> payload){
		return obj->{
			try {payload.accept(obj);
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		};  
	}
}
