import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EncryptedAndDecrypted {
	public static void main(String[] args) {
		String s="Kiran batwal";
		char ch[]=s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			ch[i]+=5;
		}
		System.out.println(ch);
		for(int i=0; i<ch.length; i++) {
			ch[i]-=5;
		}
		
		System.out.println(ch);
		
	}

}
