package com.velocity.list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashset {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
//		set.add(40);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
