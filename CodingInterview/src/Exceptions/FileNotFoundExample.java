package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExample {
 public static void main(String[] args) {
	try { File file= new File("E:///////");
	
		FileReader fr= new FileReader(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println(e+"file not found Exception catched");
	}
	 
}
}
