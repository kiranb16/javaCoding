package Exceptions_Inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

class Employee{
	void addEmployee() throws NullPointerException {
		throw new NullPointerException();
	}
}
public class ExceptionHierachy extends Employee {

	@Override
	void addEmployee() throws FileNotFoundException {
		throw new FileNotFoundException();
	}

	
}
