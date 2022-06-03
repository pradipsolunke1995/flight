package threading;

class Main {

	public static void main(String[] args) {
		Operation op = new Operation();
		Adding add1 = new Adding(op);
		Adding2 add2 = new Adding2(op);
		Removing remove1 = new Removing(op);
		Removing2 remove2 = new Removing2(op);
		Thread addThread1 = new Thread(add1);
		Thread removeThread1 = new Thread(remove1);
		Thread addThread2 = new Thread(add2);
		Thread removeThread2 = new Thread(remove2);

		addThread2.start();
		addThread1.start();
		removeThread2.start();
		removeThread1.start();

	}
}
