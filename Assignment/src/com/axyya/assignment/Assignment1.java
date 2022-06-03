package com.axyya.assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Assignment1 {

	public static void main(String[] args) {
		firstAssignment();
		secondAssignment();
	}

	static void firstAssignment() {
		try {
			LinkedList<String> list = new LinkedList<String>();

			list.add("All's Well That Ends Well");
			list.add("As You Like It");
			list.add("Comedy Of Errors");
			list.add("Love's Labour's Lost");
			list.add("Measure for Measure");
			list.add("Merchant of Venice");
			list.add("Merry Wives of Windsor");
			list.add("Midsummer Night's Dream");
			list.add("Much Ado about Nothing");
			list.add("Taming of the Shrew");
			list.add("Tempest");
			list.add("Twelfth Night");
			list.add("Two Gentlemen of Verona");
			list.add("Winter's Tale");

			//1.Insert “Macbeth” to the front.
			list.add(0, "Macbeth");
			System.out.println(list);
			
			//2.Remove “Tempest”
			list.remove("Tempest");
			System.out.println(list);
			
			//3. Swap the last two elements.

			Collections.swap(list, list.size()-2, list.size()-1);
			
			System.out.println(list);

			//4. Create a new copy of the list by cloning

			LinkedList<String> copy = (LinkedList<String>) list.clone();
			System.out.println("cloned "+copy);
			
			//5. Remove and return the first element	
			String removeElement = list.remove(0);
			System.out.println(removeElement);

			//6. Retrieve but does not remove, the first element
			System.out.println(list.get(0));
			
			//7. Retrieve but does not remove, the last element
			System.out.println(list.get(list.size() - 1));

			//8. Convert to ArrayList

			ArrayList<String> linkToArraylist = new ArrayList<String>();
			linkToArraylist.addAll(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void secondAssignment() {
		try {

			ArrayList<String> list2 = new ArrayList<String>();
			list2.add("The Incredible Hulk");
			list2.add("Iron Man 2");
			list2.add("Thor");
			list2.add("Captain America: The First Avenger");
			list2.add("Marvel's The Avengers");
			list2.add("Iron Man 3");
			list2.add("Captain America: The Winter Soldier");
			list2.add("Guardians of the Galaxy");
			list2.add("Avengers: Age of Ultron");
			list2.add("Ant-Man");

			//1. Create a new last five movies
			list2.add("Guardians of the Galaxy 2");
			list2.add("Thor 2");
			list2.add("Infinity War");
			list2.add("Captain Marvel");
			list2.add("EndGame");
			list2.add("SpiderMan");

			//2. Shuffle the original list.
			Collections.shuffle(list2);
			System.out.println(list2);

			//3. Create a clone of the list

			Object arrayCopy = list2.clone();
			ArrayList<String> copied = (ArrayList<String>) arrayCopy;
			System.out.println(copied);

			//4. Increase the capacity to 30 and add more movie to the list
			list2.ensureCapacity(30);
			
			list2.add("x-men 1");
			list2.add("x-men 2");
			list2.add("x-men 3");
			list2.add("x-men 4");
			
			System.out.println(list2);

			//5.Remove unoccupied space of Array list and fix the capacity of ArrayList as its current size
			list2.trimToSize();

			//6. Empty the list
			list2.clear();
			System.out.println(list2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
