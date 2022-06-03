package com.axyya.assignment;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;

class CardSort implements Comparator<Payment>{

	CardSort(){
		
	}

	@Override
	public int compare(Payment o1, Payment o2) {
		
		return o1.cardType.compareTo(o2.cardType);
	}
	
}

public class Payment {
	//1. Add two fields to payment, AccountNumber and Cardtype

	int accountNumber;
	
	String cardType;
	
	
	
	

	public Payment(int accountNumber, String cardType) {
		super();
		this.accountNumber = accountNumber;
		this.cardType = cardType;
	}

	CardSort comparator = new CardSort();

	public static void main(String[] args) {

		CardSort comp = new CardSort();
		
		//2. Sort the queue based on card type
		PriorityQueue<Payment> pr = new PriorityQueue<Payment>(20, comp);
		pr.add(new Payment(1571344, "visa"));
		pr.add(new Payment(2164568, "rupay"));
		pr.add(new Payment(5415551, "maestro"));
		pr.add(new Payment(1546636, "masterCard"));
		
		System.out.println(pr.toString());
		
		//3. Convert the queues into a set
		Set<Payment> s1= new HashSet<Payment>();
		s1.addAll(pr);
		System.out.println(s1.toString());
		
		//4. Convert the original queue into a thread safe version of Queue.
		
		ArrayBlockingQueue<Payment> ab = new ArrayBlockingQueue<Payment>(10);
		ab.addAll(pr);
		

		
		
		
		
	}

	@Override
	public String toString() {
		return "Payment [accountNumber=" + accountNumber + ", cardType=" + cardType + "]";
	}

	

}
