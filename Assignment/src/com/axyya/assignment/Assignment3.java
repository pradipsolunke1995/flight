package com.axyya.assignment;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class Assignment3 {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("Japan", "Tokyo");
		map.put("Jordan", "Amman");
		map.put("Kazakhstan", "Nur-Sultan");
		map.put("Kenya", "Nairobi");
		map.put("Kiribati", "Tarawa Atoll");
		map.put("Kosovo", "Pristina");
		map.put("Kuwait", "Kuwait City");
		map.put("Kyrgyzstan", "Bishkek");
		map.put("Laos", "Vientiane");
		map.put("Latvia", "Riga");
		map.put("Lebanon", "Beirut");
		map.put("Lesotho", "Maseru");
		map.put("Liberia", "Monrovia");
		map.put("Libya", "Tripoli");
		map.put("Liechtenstein", "Vaduz");
		map.put("Lithuania", "Vilnius");
		map.put("Luxembourg", "Luxembourg");
		map.put("Madagascar", "Antananarivo");
		
		

		System.out.println(map.entrySet());
		// 1. count the number of key-value (size) mappings in a map

		System.out.println(map.size());

		// 2. get a shallow copy of a HashMap instance

		Map<String, String> copy = new HashMap<String, String>();

		copy.putAll(map);

		// 3.create a set view of the mappings contained in a map

		for (Map.Entry m : map.entrySet()) {
			System.out.println("Country: " + m.getKey() + " & Capital: " + m.getValue());
		}

		// 4. to get a collection view of the values contained in this map

		for (Map.Entry m : map.entrySet()) {
			System.out.println("Value: " + m.getValue());
		}

		// 5. convert the above map into a tree map having country and capital as keys
		// and values respectively

		TreeMap<String, String> tMap = new TreeMap<String, String>();
		tMap.putAll(map);
		
		// 1. get the first (lowest) key and the last (highest) key currently in a map

		class CompairKey implements Comparator<String> {

			@Override
			public int compare(String o1, String o2) {
				int first = o1.length();
				int second = o2.length();

				if (first < second) {
					return -1;
				} else if (first > second) {
					return 1;
				} else {
					return o1.compareTo(o2);
				}
			}

		}
		TreeMap <String, String> tm= new TreeMap<String, String>(new CompairKey());
		tm.putAll(map);
		
		System.out.println(tm.firstKey());
		System.out.println(tm.lastKey());
		
		//2. get a reverse order view of the keys contained in a given map
		System.out.println(tm.descendingKeySet());
		
		//3. get a new map containing countries whose name begin with ‘L’
		
		HashSet<String> hs= new HashSet<String>(tm.keySet());
		System.out.println(hs);
		
		
		for (String str : hs) {
			if(str.startsWith("L")) {
				System.out.println(str);
			}
			
			
		}
		//4. to get a collection view of the values contained in this map and sort them in descending order
		
		class CompairValues implements Comparator<String>{

			@Override
			public int compare(String o1, String o2) {
				if(o1.hashCode()>o2.hashCode()) {
					return 1;
				}
				if(o1.hashCode()<o2.hashCode()) {
					return -1;
				}
				return o1.compareTo(o2);
			}
			
		}
		TreeMap <String, String> tmNew= new TreeMap<String, String>(new CompairValues());
		tmNew.putAll(tm);
		
		System.out.println(tmNew.values());
		
		
		//5.Convert the original map into a concurrent hash map
		
		ConcurrentHashMap<String, String> chm= new ConcurrentHashMap<String, String>(tm);
		System.out.println(chm);
		
		


		

	}

}
