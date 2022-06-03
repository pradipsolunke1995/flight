package assi;

public class Remove2 extends Thread{

	@Override
	public void run() {
		for (int i = 25; i < 49; i++) {
			MultiThreading.removeFromArrayList(i);
		}
	}
}
