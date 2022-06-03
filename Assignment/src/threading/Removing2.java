package threading;

public class Removing2 implements Runnable {
	Operation op;

	public Removing2(Operation op) {
		this.op = op;
	}

	@Override
	public void run() {
		op.remove2();
	}

}
