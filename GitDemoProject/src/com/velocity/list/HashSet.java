package com.velocity.list;

import java.util.Iterator;

public class HashSet {

	public static void main(String[] args) {

		java.util.HashSet<Integer> set = new java.util.HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
