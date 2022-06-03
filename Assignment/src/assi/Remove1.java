package assi;

public class Remove1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 24; i++) {
			MultiThreading.removeFromArrayList(i);
		}
	}
}
