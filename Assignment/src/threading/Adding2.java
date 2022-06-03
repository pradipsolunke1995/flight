package threading;

public class Adding2 implements Runnable {
	Operation op;

	public Adding2(Operation op) {
		this.op = op;
	}

	@Override
	public void run() {

		op.add2();

	}

}
