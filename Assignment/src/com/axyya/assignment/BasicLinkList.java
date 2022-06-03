package com.axyya.assignment;

import java.util.Iterator;
import java.util.LinkedList;


public class BasicLinkList {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(12);
		list.add(0);
		list.add(1);
		list.add(78);
		list.add(12);
		list.add(5, 23);
		
		list.remove(0);

		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}
