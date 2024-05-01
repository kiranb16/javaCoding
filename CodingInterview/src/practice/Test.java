package practice;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.text.PlainDocument;


public class Test {
	public static void main(String[] args) throws IOException {
		String s = "hello worldh";
		String [] plain= s.split("");
		String firstNptLeter = "";
		for( int i=0; i<plain.length; i++) {
			
			int idx = s.indexOf(plain[i]);
			int lIdx = s.lastIndexOf(plain[i]);
			if(idx ==lIdx) {
				firstNptLeter = plain[i];
				break;
			}
		}
		System.out.println(firstNptLeter);
		
	}
}