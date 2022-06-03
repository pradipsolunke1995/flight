package assi;

public class Add1 extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			MultiThreading.addToArrayList(i);
			System.out.println(MultiThreading.list.get(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
