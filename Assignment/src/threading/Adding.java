package threading;

public class Adding implements Runnable {
	Operation op;

	public Adding(Operation op) {
		this.op = op;
	}

	@Override
	public void run() {

		op.add1();
	}

}
