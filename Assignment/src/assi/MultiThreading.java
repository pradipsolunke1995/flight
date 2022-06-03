package assi;

import java.util.ArrayList;
import java.util.List;

public class MultiThreading extends Thread {

	static List<Integer> list = new ArrayList<Integer>();

	public static void addToArrayList(int x) {
		list.add(x);
	}

	public static void removeFromArrayList(int z) {
		list.remove(z);
	}

	public static void main(String[] args) throws InterruptedException {
		Add1 add1= new Add1();
		Add2 add2= new Add2();
		Remove1 remove1 = new Remove1();
		Remove2 remove2 = new Remove2();
		
		
		
			
			Thread t1 = new Thread(add2);
			
				t1.start();
				System.out.println("Elements are added to the list");
				t1.notify();
				
				Thread t2 = new Thread(remove1);
				
				if(list.isEmpty()) {
					System.out.println("ArrayList is Empty, Remove1 Thread is waiting");
					t2.wait();
					System.out.println("Remove1 Thread is executed");
			}
			
		
		
			Thread t4 = new Thread(add1);
			
				
				t4.start();
				
				System.out.println("Elements are added to the list");
				t4.notify();
				
				Thread t3 = new Thread(remove2);
				
				if(list.isEmpty()) {
					System.out.println("ArrayList is Empty, Remove2 Thread is waiting");
					t3.wait();
					System.out.println("Remove2 Thread is executed");
				}
		
		
		
		
	}
	
		
	}

	
	
	
	
	
	
	
	
	
