package com.axyya.assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class CollectionPractice {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("ind");
		list.add("ban");
		list.add("usa");
		list.add("uk");
		
		System.out.println(list);
		
		Iterator<String> itr = list.iterator();
		itr.forEachRemaining((value)-> System.out.println(value));
		
		
	
	}
	
	

}
