package com.axyya.assignment;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Assignment2 {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		ArrayDeque<Integer> l = new ArrayDeque<Integer>();

		l.add(12);
		l.add(0);
		l.add(1);
		l.add(78);
		l.add(12);
		l.addLast(23);
		l.pollFirst();

		Iterator<Integer> itr = l.iterator();
		// itr.forEachRemaining(value-> System.out.print(value+" "));
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		
	}
}
