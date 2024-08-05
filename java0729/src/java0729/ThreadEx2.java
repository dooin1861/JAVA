package java0729;

public class ThreadEx2 extends Thread {

	public ThreadEx2() {
		this.setName("ThreadA");
	}
	@Override
	public void run() {
		for (int i = 0; i < 2; i++) {
			System.out.println(this.getName());
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	

}
