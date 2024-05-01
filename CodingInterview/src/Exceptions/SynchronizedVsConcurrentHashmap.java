package Exceptions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SynchronizedVsConcurrentHashmap {
	public static void main(String[] args) {

		Map<Integer, String> shm= Collections.synchronizedMap(new HashMap<>());

		ConcurrentHashMap<Integer, String> chm= new ConcurrentHashMap<Integer, String>();
		
	}
}
