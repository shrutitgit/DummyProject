package com.velocity.list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Shruti","Neval","Roshni","Vivek");
	
	
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
