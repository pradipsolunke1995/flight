package threading;

public class Removing implements Runnable {
	Operation op;

	public Removing(Operation op) {
		this.op = op;
	}

	@Override
	public void run() {
		op.remove1();
	}

}
