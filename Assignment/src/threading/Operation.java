package threading;

import java.util.ArrayList;
import java.util.List;

public class Operation {

	List<String> list = new ArrayList<String>();

	public synchronized void add1() {

		list.add("first");
		list.add("second");
		list.add("third");
		list.add("fourth");

		notify();

	}

	public synchronized void add2() {

		if (list.isEmpty()) {
			try {
				System.out.println("waiting for add1 signal");
				wait();
				list.add(0, "first prime");
				System.out.println("first prime added to list");

			} catch (InterruptedException e) {
			}

		}

	}

	public synchronized void remove1() {
		if (list.contains("first prime")) {
			try {
				System.out.println("waiting for add2 signal");

				list.remove("first prime");
				System.out.println("first prime removed");
				System.out.println(list);
				notify();
			} catch (Exception e) {
			}
		}
	}

	public synchronized void remove2() {
		if (list.size() == 5) {
			try {
				System.out.println("waiting for remove1 signal");
				wait();
				list.clear();
				System.out.println("List Cleared");
				System.out.println(list);
			} catch (InterruptedException e) {
			}
		}
	}

}
