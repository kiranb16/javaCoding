package Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class PPP {
	public static void main(String[] args)  {
	File file= new File("E://jhkjhj");
	FileReader fr;
	try {
		fr = new FileReader(file);
		System.out.println(fr);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
